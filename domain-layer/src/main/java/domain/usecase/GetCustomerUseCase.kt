package domain.usecase

import domain.model.Customer
import domain.repository_interfaces.FitCareRepository
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.Flow

import javax.inject.Inject

class GetCustomerUseCase @Inject constructor(private val repository: FitCareRepository) {

    fun getCustomer(name : String): Flow<Customer?> {
        return flow { emit(repository.getCustomer(name)) }
    }

}