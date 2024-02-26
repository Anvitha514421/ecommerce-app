package com.example.ecommerce.domain.usecase.product

import com.example.ecommerce.common.NetworkResponseState
import com.example.ecommerce.domain.entity.product.ProductEntity
import kotlinx.coroutines.flow.Flow

interface SearchProductUseCase {
    operator fun invoke(query: String): Flow<NetworkResponseState<List<ProductEntity>>>
}
