package com.example.ecommerce.domain.usecase.category

import com.example.ecommerce.common.NetworkResponseState
import kotlinx.coroutines.flow.Flow

interface CategoryUseCase {
    operator fun invoke(): Flow<NetworkResponseState<List<String>>>
}
