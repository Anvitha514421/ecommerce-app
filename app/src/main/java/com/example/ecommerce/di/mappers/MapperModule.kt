package com.example.ecommerce.di.mappers

import com.example.ecommerce.domain.entity.product.DetailProductEntity
import com.example.ecommerce.domain.entity.product.ProductEntity
import com.example.ecommerce.domain.mapper.ProductBaseMapper
import com.example.ecommerce.domain.mapper.ProductListMapper
import com.example.ecommerce.data.dto.Product
import com.example.ecommerce.data.mapper.ProductEntityMapper
import com.example.ecommerce.data.mapper.SingleProductEntityMapper
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class MapperModule {

    @Binds
    @ViewModelScoped
    abstract fun bindAllProductsEntityMapper(productEntityMapper: ProductEntityMapper): ProductListMapper<Product, ProductEntity>

    @Binds
    @ViewModelScoped
    abstract fun bindSingleProductEntityMapper(singleProductEntityMapper: SingleProductEntityMapper): ProductBaseMapper<Product, DetailProductEntity>
}
