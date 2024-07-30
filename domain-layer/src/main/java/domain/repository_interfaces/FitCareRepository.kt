package domain.repository_interfaces

import domain.model.Customer

interface FitCareRepository {
     suspend fun getCustomerList() : List<Customer>
     suspend fun getCustomer(name: String) : Customer?
}