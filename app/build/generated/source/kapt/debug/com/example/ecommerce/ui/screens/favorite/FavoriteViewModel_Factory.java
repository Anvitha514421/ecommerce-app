package com.example.ecommerce.ui.screens.favorite;

import android.content.SharedPreferences;
import com.example.ecommerce.domain.entity.product.FavoriteProductEntity;
import com.example.ecommerce.domain.mapper.ProductBaseMapper;
import com.example.ecommerce.domain.mapper.ProductListMapper;
import com.example.ecommerce.domain.usecase.favorite.DeleteFavoriteUseCase;
import com.example.ecommerce.domain.usecase.favorite.FavoriteUseCase;
import com.example.ecommerce.ui.uiData.FavoriteUiData;
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
public final class FavoriteViewModel_Factory implements Factory<FavoriteViewModel> {
  private final Provider<FavoriteUseCase> favoriteUseCaseProvider;

  private final Provider<ProductListMapper<FavoriteProductEntity, FavoriteUiData>> mapperProvider;

  private final Provider<ProductBaseMapper<FavoriteUiData, FavoriteProductEntity>> singleMapperProvider;

  private final Provider<DeleteFavoriteUseCase> deleteFavoriteUseCaseProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public FavoriteViewModel_Factory(Provider<FavoriteUseCase> favoriteUseCaseProvider,
      Provider<ProductListMapper<FavoriteProductEntity, FavoriteUiData>> mapperProvider,
      Provider<ProductBaseMapper<FavoriteUiData, FavoriteProductEntity>> singleMapperProvider,
      Provider<DeleteFavoriteUseCase> deleteFavoriteUseCaseProvider,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.favoriteUseCaseProvider = favoriteUseCaseProvider;
    this.mapperProvider = mapperProvider;
    this.singleMapperProvider = singleMapperProvider;
    this.deleteFavoriteUseCaseProvider = deleteFavoriteUseCaseProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public FavoriteViewModel get() {
    return newInstance(favoriteUseCaseProvider.get(), mapperProvider.get(), singleMapperProvider.get(), deleteFavoriteUseCaseProvider.get(), sharedPreferencesProvider.get());
  }

  public static FavoriteViewModel_Factory create(Provider<FavoriteUseCase> favoriteUseCaseProvider,
      Provider<ProductListMapper<FavoriteProductEntity, FavoriteUiData>> mapperProvider,
      Provider<ProductBaseMapper<FavoriteUiData, FavoriteProductEntity>> singleMapperProvider,
      Provider<DeleteFavoriteUseCase> deleteFavoriteUseCaseProvider,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new FavoriteViewModel_Factory(favoriteUseCaseProvider, mapperProvider, singleMapperProvider, deleteFavoriteUseCaseProvider, sharedPreferencesProvider);
  }

  public static FavoriteViewModel newInstance(FavoriteUseCase favoriteUseCase,
      ProductListMapper<FavoriteProductEntity, FavoriteUiData> mapper,
      ProductBaseMapper<FavoriteUiData, FavoriteProductEntity> singleMapper,
      DeleteFavoriteUseCase deleteFavoriteUseCase, SharedPreferences sharedPreferences) {
    return new FavoriteViewModel(favoriteUseCase, mapper, singleMapper, deleteFavoriteUseCase, sharedPreferences);
  }
}
