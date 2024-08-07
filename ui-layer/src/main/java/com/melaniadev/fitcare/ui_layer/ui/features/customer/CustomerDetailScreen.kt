package com.melaniadev.fitcare.ui_layer.ui.features.customer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.melaniadev.fitcare.ui_layer.R
import com.melaniadev.fitcare.ui_layer.ui.components.ActionButtonsComponent
import com.melaniadev.fitcare.ui_layer.ui.components.LeftIconInfoComponent
import com.melaniadev.fitcare.ui_layer.ui.components.LeftImageInfoComponent
import com.melaniadev.fitcare.ui_layer.ui.components.TopBarBackButton
import com.melaniadev.fitcare.ui_layer.ui.theme.localCustomColorsPalette


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun DetailPreview() {
    val navigationController = rememberNavController()
    DetailCustomerScreen(navigationController = navigationController, "")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailCustomerScreen(navigationController: NavHostController, name: String) {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    val viewModel = hiltViewModel<CustomerViewModel>()
    val uiState = viewModel.customerUiModel.collectAsState()
    val customer = uiState.value.customer
    if(customer == null){
        viewModel.getCustomerDetail(name)
    }

    Scaffold(modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection), topBar = {
        TopBarBackButton(
            isNavigable = true,
            navigationController,
            title = stringResource(R.string.user_profile_top_bar_title),
            scrollBehavior = scrollBehavior
        )
    }, content = { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .verticalScroll(enabled = true, state = rememberScrollState())
                .padding(horizontal = 20.dp, vertical = 15.dp)
        ) {
            DetailScreenUserImage(customer = customer)
            InfoBioComponent(customer = customer)
            ActionButtonsComponent(navigationController = navigationController)
            customer?.email?.let {
                LeftIconInfoComponent(
                    iconDrawable = R.drawable.email_vector,
                    contentDescription = "Email",
                    header = "Email",
                    body = it
                )
            }
            customer?.phone?.let {
                LeftIconInfoComponent(
                    iconDrawable = R.drawable.phone_vector,
                    contentDescription = "Phone number",
                    header = "Phone",
                    body = it
                )
            }
            AssignedProfessionalComponent(customer = customer)
            VisitHistoryComponent(customer = customer)
        }
    })
}

@Composable
private fun DetailScreenUserImage(customer: domain.model.Customer?) {
    Box(
        modifier = Modifier
            .padding(bottom = 15.dp)
            .background(color = Color.Transparent)
    ) {
        AsyncImage(
            contentScale = ContentScale.Crop,
            model = customer?.imageUrl,
            contentDescription = "Image profile",
            modifier = Modifier
                .clip(CircleShape)
                .height(115.dp)
                .width(115.dp)
        )
    }
}

@Composable
private fun InfoBioComponent(customer: domain.model.Customer?) {
    Column() {
        customer?.name?.let {
            Text(
                text = it, style = MaterialTheme.typography.bodyLarge
            )
        }
        Text(
            text = customer?.gender?.genderType + ", " + customer?.age + " years old",
            style = MaterialTheme.typography.bodyMedium,
            color = localCustomColorsPalette.current.customTextColor

        )
        Text(
            text = customer?.height + "cm" + " | " + customer?.weight + "kg",
            style = MaterialTheme.typography.bodyMedium,
            color = localCustomColorsPalette.current.customTextColor
        )
    }
}

@Composable
private fun AssignedProfessionalComponent(customer: domain.model.Customer?) {
    Column(modifier = Modifier.padding(vertical = 10.dp)) {
        Text(
            text = "Assigned Professional",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(vertical = 10.dp)
        )
        customer?.professional?.name?.let {
            LeftImageInfoComponent(
                imageUrl = "https://picsum.photos/id/1/200/300",
                header = it,
                body1 = customer.professional.therapyType?.nameOfTherapy.orEmpty()
            )
        }
    }
}

@Composable
private fun VisitHistoryLazyColumn(visits: List<domain.model.Visit>?) {
    Column {
        visits?.forEach { visit ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 15.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = visit.typeOfVisit, style = MaterialTheme.typography.bodyMedium)
                Text(
                    text = visit.date,
                    style = MaterialTheme.typography.bodySmall,
                    color = localCustomColorsPalette.current.customTextColor
                )
            }
        }
    }
}

@Composable
private fun VisitHistoryComponent(customer: domain.model.Customer?) {
    Text(
        text = "Visit History",
        style = MaterialTheme.typography.titleLarge,
        modifier = Modifier.padding(top = 20.dp)
    )
    VisitHistoryLazyColumn(visits = customer?.visitHistory)
}



