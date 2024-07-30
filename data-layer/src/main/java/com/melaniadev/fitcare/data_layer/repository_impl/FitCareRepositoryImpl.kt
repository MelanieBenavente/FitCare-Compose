package com.melaniadev.fitcare.data_layer.repository_impl

import domain.model.Customer
import domain.repository_interfaces.FitCareRepository
import kotlinx.coroutines.delay

class FitCareRepositoryImpl : FitCareRepository {

    override suspend fun getCustomerList(): List<Customer> {
        delay(200L)
       return mockList()
    }

    override suspend fun getCustomer(name: String): Customer? {
        return mockList().filter { name == it.name }.firstOrNull()
    }

}