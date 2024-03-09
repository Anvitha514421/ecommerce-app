package com.example.ecommerce.ui.screens.home;

import com.example.ecommerce.domain.entity.product.ProductEntity;
import com.example.ecommerce.domain.mapper.ProductListMapper;
import com.example.ecommerce.domain.usecase.category.CategoryUseCase;
import com.example.ecommerce.domain.usecase.product.GetAllProductsUseCase;
import com.example.ecommerce.domain.usecase.product.SearchProductUseCase;
import com.example.ecommerce.ui.uiData.ProductUiData;
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<GetAllProductsUseCase> getAllProductsUseCaseProvider;

  private final Provider<CategoryUseCase> categoryUseCaseProvider;

  private final Provider<SearchProductUseCase> searchProductUseCaseProvider;

  private final Provider<ProductListMapper<ProductEntity, ProductUiData>> mapperProvider;

  public HomeViewModel_Factory(Provider<GetAllProductsUseCase> getAllProductsUseCaseProvider,
      Provider<CategoryUseCase> categoryUseCaseProvider,
      Provider<SearchProductUseCase> searchProductUseCaseProvider,
      Provider<ProductListMapper<ProductEntity, ProductUiData>> mapperProvider) {
    this.getAllProductsUseCaseProvider = getAllProductsUseCaseProvider;
    this.categoryUseCaseProvider = categoryUseCaseProvider;
    this.searchProductUseCaseProvider = searchProductUseCaseProvider;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(getAllProductsUseCaseProvider.get(), categoryUseCaseProvider.get(), searchProductUseCaseProvider.get(), mapperProvider.get());
  }

  public static HomeViewModel_Factory create(
      Provider<GetAllProductsUseCase> getAllProductsUseCaseProvider,
      Provider<CategoryUseCase> categoryUseCaseProvider,
      Provider<SearchProductUseCase> searchProductUseCaseProvider,
      Provider<ProductListMapper<ProductEntity, ProductUiData>> mapperProvider) {
    return new HomeViewModel_Factory(getAllProductsUseCaseProvider, categoryUseCaseProvider, searchProductUseCaseProvider, mapperProvider);
  }

  public static HomeViewModel newInstance(GetAllProductsUseCase getAllProductsUseCase,
      CategoryUseCase categoryUseCase, SearchProductUseCase searchProductUseCase,
      ProductListMapper<ProductEntity, ProductUiData> mapper) {
    return new HomeViewModel(getAllProductsUseCase, categoryUseCase, searchProductUseCase, mapper);
  }
}
