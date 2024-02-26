package com.example.ecommerce.domain.usecase.product

import com.example.ecommerce.common.NetworkResponseState
import com.example.ecommerce.domain.entity.product.DetailProductEntity
import kotlinx.coroutines.flow.Flow

interface GetSingleProductUseCase {
    operator fun invoke(id: Int): Flow<NetworkResponseState<DetailProductEntity>>
}
