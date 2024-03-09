package com.example.ecommerce.domain.usecase.favorite

import com.example.ecommerce.domain.entity.product.FavoriteProductEntity

interface DeleteFavoriteUseCase {
    suspend operator fun invoke(favoriteProductEntity: FavoriteProductEntity)
}