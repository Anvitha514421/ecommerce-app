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
public final class GetSingleProductUseCaseImpl_Factory implements Factory<GetSingleProductUseCaseImpl> {
  private final Provider<RemoteRepository> repositoryProvider;

  public GetSingleProductUseCaseImpl_Factory(Provider<RemoteRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetSingleProductUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetSingleProductUseCaseImpl_Factory create(
      Provider<RemoteRepository> repositoryProvider) {
    return new GetSingleProductUseCaseImpl_Factory(repositoryProvider);
  }

  public static GetSingleProductUseCaseImpl newInstance(RemoteRepository repository) {
    return new GetSingleProductUseCaseImpl(repository);
  }
}
