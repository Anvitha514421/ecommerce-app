package com.example.ecommerce.domain.usecase.cart // ktlint-disable package-name

import com.example.ecommerce.domain.entity.cart.UserCartEntity

interface UpdateCartUseCase {
    suspend operator fun invoke(userCartEntity: UserCartEntity)
}
