package com.example.ecommerce.ui.mapper

import com.example.ecommerce.ui.uiData.ProductUiData
import com.example.ecommerce.domain.entity.product.ProductEntity
import com.example.ecommerce.domain.mapper.ProductListMapper
import javax.inject.Inject

class ProductEntityToUiMapper @Inject constructor() :
    ProductListMapper<ProductEntity, ProductUiData> {
    override fun map(input: List<ProductEntity>): List<ProductUiData> {
        return input.map {
            ProductUiData(
                id = it.id,
                title = it.title,
                description = it.description,
                price = it.price,
                imageUrl = it.imageUrl,
                rating = it.rating,
            )
        }
    }
}
