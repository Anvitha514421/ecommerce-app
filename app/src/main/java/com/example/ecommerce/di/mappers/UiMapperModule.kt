package com.example.ecommerce.di.mappers

import com.example.ecommerce.domain.entity.cart.UserCartEntity
import com.example.ecommerce.domain.entity.product.DetailProductEntity
import com.example.ecommerce.domain.entity.product.FavoriteProductEntity
import com.example.ecommerce.domain.entity.product.ProductEntity
import com.example.ecommerce.domain.entity.user.UserInformationEntity
import com.example.ecommerce.domain.mapper.ProductBaseMapper
import com.example.ecommerce.domain.mapper.ProductListMapper
import com.example.ecommerce.ui.mapper.CartEntityToFavoriteEntityMapper
import com.example.ecommerce.ui.mapper.CartEntityToUiMapper
import com.example.ecommerce.ui.mapper.CartUiToEntityMapper
import com.example.ecommerce.ui.mapper.DetailProductEntityToUiMapper
import com.example.ecommerce.ui.mapper.FavoriteEntityToUiMapper
import com.example.ecommerce.ui.mapper.FavoriteUiToEntityMapper
import com.example.ecommerce.ui.mapper.ProductEntityToUiMapper
import com.example.ecommerce.ui.mapper.UserInfoEntityToUiDataMapper
import com.example.ecommerce.ui.mapper.UserInfoUiDataToEntityMapper
import com.example.ecommerce.ui.uiData.DetailProductUiData
import com.example.ecommerce.ui.uiData.FavoriteUiData
import com.example.ecommerce.ui.uiData.ProductUiData
import com.example.ecommerce.ui.uiData.UserCartUiData
import com.example.ecommerce.ui.uiData.UserInformationUiData
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class UiMapperModule {
    @Binds
    @ViewModelScoped
    abstract fun bindHomeProductUiMapper(productUiDataMapper: ProductEntityToUiMapper): ProductListMapper<ProductEntity, ProductUiData>

    @Binds
    @ViewModelScoped
    abstract fun bindDetailProductUiMapper(productUiDataMapper: DetailProductEntityToUiMapper): ProductBaseMapper<DetailProductEntity, DetailProductUiData>

    @Binds
    @ViewModelScoped
    abstract fun bindCartUiMapper(cartUiDataMapper: CartEntityToUiMapper): ProductListMapper<UserCartEntity, UserCartUiData>

    @Binds
    @ViewModelScoped
    abstract fun bindSingleCartUiMapper(singleCartUiDataMapper: CartUiToEntityMapper): ProductBaseMapper<UserCartUiData, UserCartEntity>

    @Binds
    @ViewModelScoped
    abstract fun bindUserInfoEntityToUiDataMapper(userInformationUiDataMapper: UserInfoEntityToUiDataMapper): ProductBaseMapper<UserInformationEntity, UserInformationUiData>

    @Binds
    @ViewModelScoped
    abstract fun bindUserInfoUiDataToEntityMapper(userInformationEntityMapperToUi: UserInfoUiDataToEntityMapper): ProductBaseMapper<UserInformationUiData, UserInformationEntity>

    @Binds
    @ViewModelScoped
    abstract fun bindFavoriteItemUiMapper(favoriteEntityToUiMapper: FavoriteEntityToUiMapper): ProductListMapper<FavoriteProductEntity, FavoriteUiData>

    @Binds
    @ViewModelScoped
    abstract fun bindSingleFavoriteItemUiMapper(favoriteUiToEntityMapper: FavoriteUiToEntityMapper): ProductBaseMapper<FavoriteUiData, FavoriteProductEntity>

    @Binds
    @ViewModelScoped
    abstract fun bindSingleCartToFavoriteEntityMapper(cartEntityToFavoriteEntityMapper: CartEntityToFavoriteEntityMapper): ProductBaseMapper<UserCartEntity, FavoriteProductEntity>
}
