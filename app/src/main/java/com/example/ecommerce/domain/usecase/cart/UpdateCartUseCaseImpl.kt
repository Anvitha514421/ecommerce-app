package com.example.ecommerce.domain.usecase.cart // ktlint-disable package-name

import com.example.ecommerce.domain.entity.cart.UserCartEntity
import com.example.ecommerce.domain.repository.LocalRepository
import javax.inject.Inject

class UpdateCartUseCaseImpl @Inject constructor(
    private val repository: LocalRepository,
) : UpdateCartUseCase {
    override suspend fun invoke(userCartEntity: UserCartEntity) {
        repository.updateUserCart(userCartEntity)
    }
}
