package domain.usecase

import domain.model.Customer
import domain.repository_interfaces.FitCareRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCustomersUseCase @Inject constructor(private val repository: FitCareRepository){

    fun getCustomerList(): Flow<List<Customer>> {
        return flow { emit(repository.getCustomerList()) }
    }
}