package com.example.ecommerce.domain.usecase.category

import com.example.ecommerce.common.NetworkResponseState
import com.example.ecommerce.domain.repository.RemoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CategoryUseCaseImpl @Inject constructor(private val repository: RemoteRepository) :
    CategoryUseCase {
    override fun invoke(): Flow<NetworkResponseState<List<String>>> {
        return repository.getAllCategoriesListFromApi()
    }
}
