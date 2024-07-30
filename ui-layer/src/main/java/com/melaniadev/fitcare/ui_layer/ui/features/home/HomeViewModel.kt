package com.melaniadev.fitcare.ui_layer.ui.features.customer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import domain.model.Customer
import domain.usecase.GetCustomersUseCase
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CustomerViewModel @Inject constructor(private val getCustomersUseCase: GetCustomersUseCase) :
    ViewModel() {
    private val _state = MutableStateFlow<State>(State.Idle)
    val state = _state.asStateFlow()

    fun customerList() {
        viewModelScope.launch {
            getCustomersUseCase.getCustomerList()
                .onStart {  }
                .catch {  }
                .collect { _state.emit(State.CustomerListRecived(customerList = it))}
        }
    }
}

sealed class State {
    data object Idle: State()
    data class CustomerListRecived(val customerList: List<Customer>) : State()
}