package com.melaniadev.fitcare.ui_layer.ui.features.home

import domain.model.Customer

data class HomeUiModel(
    val isError: Boolean = false,
    val isLoading: Boolean = false,
    val customerList: List<Customer>? = null
)