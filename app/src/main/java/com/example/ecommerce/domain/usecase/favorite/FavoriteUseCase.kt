package com.example.ecommerce.domain.usecase.favorite

import com.example.ecommerce.common.NetworkResponseState
import com.example.ecommerce.domain.entity.product.FavoriteProductEntity
import kotlinx.coroutines.flow.Flow

interface FavoriteUseCase {
    suspend operator fun invoke(userId: String): Flow<NetworkResponseState<List<FavoriteProductEntity>>> // getFavoriteProductsFromLocal

    suspend operator fun invoke(item: FavoriteProductEntity) // insertFavoriteItemToDb
}
