package com.example.ecommerce.domain.usecase.cart

import com.example.ecommerce.common.NetworkResponseState
import com.example.ecommerce.domain.entity.cart.UserCartEntity
import kotlinx.coroutines.flow.Flow

interface CartUseCase {
    suspend operator fun invoke(userId: String): Flow<NetworkResponseState<List<UserCartEntity>>> // getCartsByUserIdFromLocal

    suspend operator fun invoke(userCartEntity: UserCartEntity) // insertCartToDb
}
