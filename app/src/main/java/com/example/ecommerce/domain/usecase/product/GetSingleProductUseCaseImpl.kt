package com.example.ecommerce.domain.usecase.product

import com.example.ecommerce.common.NetworkResponseState
import com.example.ecommerce.domain.entity.product.DetailProductEntity
import com.example.ecommerce.domain.repository.RemoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSingleProductUseCaseImpl @Inject constructor(
    private val repository: RemoteRepository,
) : GetSingleProductUseCase {
    override fun invoke(id: Int): Flow<NetworkResponseState<DetailProductEntity>> =
        repository.getSingleProductByIdFromApi(id)
}
