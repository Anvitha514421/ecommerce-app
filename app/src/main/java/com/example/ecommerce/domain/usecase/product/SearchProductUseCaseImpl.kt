package com.example.ecommerce.domain.usecase.product

import com.example.ecommerce.common.NetworkResponseState
import com.example.ecommerce.domain.entity.product.ProductEntity
import com.example.ecommerce.domain.repository.RemoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchProductUseCaseImpl @Inject constructor(
    private val repository: RemoteRepository,
) : SearchProductUseCase {
    override fun invoke(query: String): Flow<NetworkResponseState<List<ProductEntity>>> {
        return repository.getProductsListBySearchFromApi(query)
    }
}
