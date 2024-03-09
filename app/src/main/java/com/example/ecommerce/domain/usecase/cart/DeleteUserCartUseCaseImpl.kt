package com.example.ecommerce.domain.usecase.cart

import com.example.ecommerce.domain.entity.cart.UserCartEntity
import com.example.ecommerce.domain.repository.LocalRepository
import javax.inject.Inject

class DeleteUserCartUseCaseImpl @Inject constructor(private val repository: LocalRepository) :
    DeleteUserCartUseCase {
    override suspend fun invoke(userCartEntity: UserCartEntity) {
        repository.deleteUserCart(userCartEntity)
    }
}
