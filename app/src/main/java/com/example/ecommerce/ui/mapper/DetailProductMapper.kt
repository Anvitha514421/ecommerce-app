package com.example.ecommerce.ui.mapper // ktlint-disable filename

import com.example.ecommerce.domain.entity.product.DetailProductEntity
import com.example.ecommerce.domain.mapper.ProductBaseMapper
import com.example.ecommerce.ui.uiData.DetailProductUiData
import javax.inject.Inject

class DetailProductEntityToUiMapper @Inject constructor() :
    ProductBaseMapper<DetailProductEntity, DetailProductUiData> {
    override fun map(input: DetailProductEntity): DetailProductUiData {
        return DetailProductUiData(
            productId = input.id,
            title = input.title,
            description = input.description,
            price = input.price,
            imageUrl = input.imageUrl,
            rating = input.rating,
        )
    }
}
