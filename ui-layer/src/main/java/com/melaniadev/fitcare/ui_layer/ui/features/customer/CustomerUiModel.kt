package com.melaniadev.fitcare.ui_layer.ui.features.customer

import domain.model.Customer

class CustomerUiModel (
    val isError: Boolean = false,
    val isLoading: Boolean = false,
    val customer: Customer? = null
)

