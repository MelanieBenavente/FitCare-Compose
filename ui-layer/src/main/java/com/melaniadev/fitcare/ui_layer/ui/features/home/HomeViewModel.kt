package com.melaniadev.fitcare.ui_layer.ui.features.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import domain.usecase.GetCustomerListUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val getCustomerListUseCase: GetCustomerListUseCase) :
    ViewModel() {
    private val _homeUiModelState = MutableStateFlow(HomeUiModel())
    val homeUiModel = _homeUiModelState.asStateFlow()

    init {
        getCustomerList()
    }

    private fun getCustomerList() {
        viewModelScope.launch {
            getCustomerListUseCase.getCustomerList()
                .onStart { _homeUiModelState.emit(HomeUiModel(isLoading = true, customerList = homeUiModel.value.customerList)) }
                .catch { _homeUiModelState.emit(HomeUiModel(isError = true, customerList = homeUiModel.value.customerList)) }
                .collect { _homeUiModelState.emit(HomeUiModel(customerList = it))}
        }
    }
}
