package com.example.ecommerce.data.mapper

import com.example.ecommerce.domain.entity.product.ProductEntity
import com.example.ecommerce.domain.mapper.ProductListMapper
import com.example.ecommerce.data.dto.Product
import javax.inject.Inject

class ProductEntityMapper @Inject constructor() :
    ProductListMapper<Product, ProductEntity> {
    override fun map(input: List<Product>): List<ProductEntity> {
        return input.map {
            ProductEntity(
                id = it.id,
                title = it.title,
                description = it.description,
                price = it.price.toString(),
                imageUrl = it.images[0],
                rating = it.rating,
            )
        }
    }
}
