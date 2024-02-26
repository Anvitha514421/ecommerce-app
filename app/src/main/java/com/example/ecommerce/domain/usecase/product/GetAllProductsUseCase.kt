package com.example.ecommerce.domain.usecase.product

import com.example.ecommerce.common.NetworkResponseState
import com.example.ecommerce.domain.entity.product.ProductEntity
import kotlinx.coroutines.flow.Flow

interface GetAllProductsUseCase {
    operator fun invoke(): Flow<NetworkResponseState<List<ProductEntity>>>

    operator fun invoke(categoryName: String): Flow<NetworkResponseState<List<ProductEntity>>>
}
