package com.example.ecommerce.domain.usecase.favorite

import com.example.ecommerce.common.NetworkResponseState
import com.example.ecommerce.domain.entity.product.FavoriteProductEntity
import com.example.ecommerce.domain.repository.LocalRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FavoriteUseCaseImpl @Inject constructor(
    private val repository: LocalRepository,
) : FavoriteUseCase {
    override suspend fun invoke(userId: String): Flow<NetworkResponseState<List<FavoriteProductEntity>>> =
        repository.getFavoriteProductsFromDb(userId)

    override suspend fun invoke(item: FavoriteProductEntity) {
        repository.insertFavoriteProductToDb(item)
    }
}
