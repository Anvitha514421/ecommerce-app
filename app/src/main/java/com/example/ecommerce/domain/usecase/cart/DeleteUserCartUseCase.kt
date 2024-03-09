package com.example.ecommerce.domain.usecase.cart

import com.example.ecommerce.domain.entity.cart.UserCartEntity

interface DeleteUserCartUseCase {
    suspend operator fun invoke(userCartEntity: UserCartEntity)
}
