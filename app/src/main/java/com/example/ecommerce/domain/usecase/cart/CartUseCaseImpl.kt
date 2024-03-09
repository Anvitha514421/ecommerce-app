package com.example.ecommerce.domain.usecase.cart

import com.example.ecommerce.common.NetworkResponseState
import com.example.ecommerce.domain.entity.cart.UserCartEntity
import com.example.ecommerce.domain.repository.LocalRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CartUseCaseImpl @Inject constructor(private val repository: LocalRepository) : CartUseCase {
    override suspend fun invoke(userId: String): Flow<NetworkResponseState<List<UserCartEntity>>> = repository.getCartsByUserIdFromDb(userId)
    override suspend fun invoke(userCartEntity: UserCartEntity) {
        repository.insertUserCartToDb(userCartEntity)
    }
}
