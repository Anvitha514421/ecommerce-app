package com.example.ecommerce.domain.usecase.cart;

import com.example.ecommerce.domain.repository.LocalRepository;
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
public final class CartUseCaseImpl_Factory implements Factory<CartUseCaseImpl> {
  private final Provider<LocalRepository> repositoryProvider;

  public CartUseCaseImpl_Factory(Provider<LocalRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CartUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static CartUseCaseImpl_Factory create(Provider<LocalRepository> repositoryProvider) {
    return new CartUseCaseImpl_Factory(repositoryProvider);
  }

  public static CartUseCaseImpl newInstance(LocalRepository repository) {
    return new CartUseCaseImpl(repository);
  }
}
