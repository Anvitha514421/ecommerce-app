package com.example.ecommerce.data.mapper

import com.example.ecommerce.domain.entity.product.DetailProductEntity
import com.example.ecommerce.domain.mapper.ProductBaseMapper
import com.example.ecommerce.data.dto.Product
import javax.inject.Inject

class SingleProductEntityMapper @Inject constructor() :
    ProductBaseMapper<Product, DetailProductEntity> {
    override fun map(input: Product): DetailProductEntity {
        return DetailProductEntity(
            id = input.id,
            title = input.title,
            description = input.description,
            price = input.price.toString(),
            imageUrl = input.images,
            rating = input.rating.toString(),
        )
    }
}
