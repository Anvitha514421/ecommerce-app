package com.example.ecommerce.domain.usecase.product;

import com.example.ecommerce.domain.repository.RemoteRepository;
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
public final class GetAllProductsUseCaseImpl_Factory implements Factory<GetAllProductsUseCaseImpl> {
  private final Provider<RemoteRepository> repositoryProvider;

  public GetAllProductsUseCaseImpl_Factory(Provider<RemoteRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetAllProductsUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetAllProductsUseCaseImpl_Factory create(
      Provider<RemoteRepository> repositoryProvider) {
    return new GetAllProductsUseCaseImpl_Factory(repositoryProvider);
  }

  public static GetAllProductsUseCaseImpl newInstance(RemoteRepository repository) {
    return new GetAllProductsUseCaseImpl(repository);
  }
}
