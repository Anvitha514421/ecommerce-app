package com.example.ecommerce.data.repository;

import com.example.ecommerce.data.source.local.LocalDataSource;
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
public final class LocalRepositoryImpl_Factory implements Factory<LocalRepositoryImpl> {
  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  private final Provider<LocalDataSource> localDataSourceProvider;

  public LocalRepositoryImpl_Factory(Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<LocalDataSource> localDataSourceProvider) {
    this.ioDispatcherProvider = ioDispatcherProvider;
    this.localDataSourceProvider = localDataSourceProvider;
  }

  @Override
  public LocalRepositoryImpl get() {
    return newInstance(ioDispatcherProvider.get(), localDataSourceProvider.get());
  }

  public static LocalRepositoryImpl_Factory create(
      Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<LocalDataSource> localDataSourceProvider) {
    return new LocalRepositoryImpl_Factory(ioDispatcherProvider, localDataSourceProvider);
  }

  public static LocalRepositoryImpl newInstance(CoroutineDispatcher ioDispatcher,
      LocalDataSource localDataSource) {
    return new LocalRepositoryImpl(ioDispatcher, localDataSource);
  }
}
