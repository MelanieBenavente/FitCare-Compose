package com.melaniadev.fitcare.ui_layer.ui.features.customer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import domain.usecase.GetCustomerUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CustomerViewModel @Inject constructor(private val getCustomerUseCase: GetCustomerUseCase) : ViewModel() {
    private val _customerUiModelState = MutableStateFlow(CustomerUiModel())
    val customerUiModel = _customerUiModelState.asStateFlow()

     fun getCustomerDetail(name: String) {
        viewModelScope.launch {
            getCustomerUseCase.getCustomer(name)
                .onStart { _customerUiModelState.emit(CustomerUiModel(isLoading = true))}
                .catch { _customerUiModelState.emit(CustomerUiModel(isError = true))}
                .collect { _customerUiModelState.emit(CustomerUiModel(customer = it))}
        }
    }
}
