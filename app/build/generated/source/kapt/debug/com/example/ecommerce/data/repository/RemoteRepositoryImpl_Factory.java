package com.example.ecommerce.data.repository;

import com.example.ecommerce.data.dto.Product;
import com.example.ecommerce.data.source.remote.RemoteDataSource;
import com.example.ecommerce.domain.entity.product.DetailProductEntity;
import com.example.ecommerce.domain.entity.product.ProductEntity;
import com.example.ecommerce.domain.mapper.ProductBaseMapper;
import com.example.ecommerce.domain.mapper.ProductListMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@QualifierMetadata("com.example.ecommerce.di.coroutine.IoDispatcher")
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
public final class RemoteRepositoryImpl_Factory implements Factory<RemoteRepositoryImpl> {
  private final Provider<RemoteDataSource> remoteDataSourceProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  private final Provider<ProductListMapper<Product, ProductEntity>> allProductsMapperProvider;

  private final Provider<ProductBaseMapper<Product, DetailProductEntity>> singleProductMapperProvider;

  public RemoteRepositoryImpl_Factory(Provider<RemoteDataSource> remoteDataSourceProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<ProductListMapper<Product, ProductEntity>> allProductsMapperProvider,
      Provider<ProductBaseMapper<Product, DetailProductEntity>> singleProductMapperProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
    this.allProductsMapperProvider = allProductsMapperProvider;
    this.singleProductMapperProvider = singleProductMapperProvider;
  }

  @Override
  public RemoteRepositoryImpl get() {
    return newInstance(remoteDataSourceProvider.get(), ioDispatcherProvider.get(), allProductsMapperProvider.get(), singleProductMapperProvider.get());
  }

  public static RemoteRepositoryImpl_Factory create(
      Provider<RemoteDataSource> remoteDataSourceProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<ProductListMapper<Product, ProductEntity>> allProductsMapperProvider,
      Provider<ProductBaseMapper<Product, DetailProductEntity>> singleProductMapperProvider) {
    return new RemoteRepositoryImpl_Factory(remoteDataSourceProvider, ioDispatcherProvider, allProductsMapperProvider, singleProductMapperProvider);
  }

  public static RemoteRepositoryImpl newInstance(RemoteDataSource remoteDataSource,
      CoroutineDispatcher ioDispatcher, ProductListMapper<Product, ProductEntity> allProductsMapper,
      ProductBaseMapper<Product, DetailProductEntity> singleProductMapper) {
    return new RemoteRepositoryImpl(remoteDataSource, ioDispatcher, allProductsMapper, singleProductMapper);
  }
}
