package com.example.ecommerce.data.source.remote;

import com.example.ecommerce.data.api.ApiService;
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
public final class RemoteDataSourceImpl_Factory implements Factory<RemoteDataSourceImpl> {
  private final Provider<ApiService> apiServiceProvider;

  public RemoteDataSourceImpl_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public RemoteDataSourceImpl get() {
    return newInstance(apiServiceProvider.get());
  }

  public static RemoteDataSourceImpl_Factory create(Provider<ApiService> apiServiceProvider) {
    return new RemoteDataSourceImpl_Factory(apiServiceProvider);
  }

  public static RemoteDataSourceImpl newInstance(ApiService apiService) {
    return new RemoteDataSourceImpl(apiService);
  }
}
