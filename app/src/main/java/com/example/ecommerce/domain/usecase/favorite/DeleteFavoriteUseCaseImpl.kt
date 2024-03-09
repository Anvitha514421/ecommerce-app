package com.example.ecommerce.domain.usecase.favorite

import com.example.ecommerce.domain.entity.product.FavoriteProductEntity
import com.example.ecommerce.domain.repository.LocalRepository
import javax.inject.Inject

class DeleteFavoriteUseCaseImpl @Inject constructor(
    private val repository: LocalRepository,
) : DeleteFavoriteUseCase {
    override suspend fun invoke(favoriteProductEntity: FavoriteProductEntity) {
        repository.deleteFavoriteProduct(favoriteProductEntity)
    }
}
