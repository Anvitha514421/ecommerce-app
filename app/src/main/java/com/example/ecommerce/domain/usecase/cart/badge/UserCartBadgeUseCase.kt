package com.example.ecommerce.domain.usecase.cart.badge

import com.example.ecommerce.common.NetworkResponseState
import kotlinx.coroutines.flow.Flow

interface UserCartBadgeUseCase {
    suspend operator fun invoke(userId: String): Flow<NetworkResponseState<Int>>
}