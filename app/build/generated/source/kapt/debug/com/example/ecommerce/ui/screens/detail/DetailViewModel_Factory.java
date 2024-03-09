package com.example.ecommerce.ui.screens.detail;

import android.content.SharedPreferences;
import androidx.lifecycle.SavedStateHandle;
import com.example.ecommerce.domain.entity.cart.UserCartEntity;
import com.example.ecommerce.domain.entity.product.DetailProductEntity;
import com.example.ecommerce.domain.entity.product.FavoriteProductEntity;
import com.example.ecommerce.domain.mapper.ProductBaseMapper;
import com.example.ecommerce.domain.usecase.cart.CartUseCase;
import com.example.ecommerce.domain.usecase.favorite.FavoriteUseCase;
import com.example.ecommerce.domain.usecase.product.GetSingleProductUseCase;
import com.example.ecommerce.ui.uiData.DetailProductUiData;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DetailViewModel_Factory implements Factory<DetailViewModel> {
  private final Provider<GetSingleProductUseCase> getSingleProductUseCaseProvider;

  private final Provider<CartUseCase> cartUseCaseProvider;

  private final Provider<ProductBaseMapper<DetailProductEntity, DetailProductUiData>> mapperProvider;

  private final Provider<FavoriteUseCase> favoriteUseCaseProvider;

  private final Provider<ProductBaseMapper<UserCartEntity, FavoriteProductEntity>> cartToFavoriteUiMapperProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public DetailViewModel_Factory(Provider<GetSingleProductUseCase> getSingleProductUseCaseProvider,
      Provider<CartUseCase> cartUseCaseProvider,
      Provider<ProductBaseMapper<DetailProductEntity, DetailProductUiData>> mapperProvider,
      Provider<FavoriteUseCase> favoriteUseCaseProvider,
      Provider<ProductBaseMapper<UserCartEntity, FavoriteProductEntity>> cartToFavoriteUiMapperProvider,
      Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.getSingleProductUseCaseProvider = getSingleProductUseCaseProvider;
    this.cartUseCaseProvider = cartUseCaseProvider;
    this.mapperProvider = mapperProvider;
    this.favoriteUseCaseProvider = favoriteUseCaseProvider;
    this.cartToFavoriteUiMapperProvider = cartToFavoriteUiMapperProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public DetailViewModel get() {
    return newInstance(getSingleProductUseCaseProvider.get(), cartUseCaseProvider.get(), mapperProvider.get(), favoriteUseCaseProvider.get(), cartToFavoriteUiMapperProvider.get(), savedStateHandleProvider.get(), sharedPreferencesProvider.get());
  }

  public static DetailViewModel_Factory create(
      Provider<GetSingleProductUseCase> getSingleProductUseCaseProvider,
      Provider<CartUseCase> cartUseCaseProvider,
      Provider<ProductBaseMapper<DetailProductEntity, DetailProductUiData>> mapperProvider,
      Provider<FavoriteUseCase> favoriteUseCaseProvider,
      Provider<ProductBaseMapper<UserCartEntity, FavoriteProductEntity>> cartToFavoriteUiMapperProvider,
      Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new DetailViewModel_Factory(getSingleProductUseCaseProvider, cartUseCaseProvider, mapperProvider, favoriteUseCaseProvider, cartToFavoriteUiMapperProvider, savedStateHandleProvider, sharedPreferencesProvider);
  }

  public static DetailViewModel newInstance(GetSingleProductUseCase getSingleProductUseCase,
      CartUseCase cartUseCase, ProductBaseMapper<DetailProductEntity, DetailProductUiData> mapper,
      FavoriteUseCase favoriteUseCase,
      ProductBaseMapper<UserCartEntity, FavoriteProductEntity> cartToFavoriteUiMapper,
      SavedStateHandle savedStateHandle, SharedPreferences sharedPreferences) {
    return new DetailViewModel(getSingleProductUseCase, cartUseCase, mapper, favoriteUseCase, cartToFavoriteUiMapper, savedStateHandle, sharedPreferences);
  }
}
