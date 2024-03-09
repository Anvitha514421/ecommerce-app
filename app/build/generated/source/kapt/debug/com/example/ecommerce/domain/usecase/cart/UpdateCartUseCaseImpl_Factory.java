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
public final class UpdateCartUseCaseImpl_Factory implements Factory<UpdateCartUseCaseImpl> {
  private final Provider<LocalRepository> repositoryProvider;

  public UpdateCartUseCaseImpl_Factory(Provider<LocalRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public UpdateCartUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static UpdateCartUseCaseImpl_Factory create(Provider<LocalRepository> repositoryProvider) {
    return new UpdateCartUseCaseImpl_Factory(repositoryProvider);
  }

  public static UpdateCartUseCaseImpl newInstance(LocalRepository repository) {
    return new UpdateCartUseCaseImpl(repository);
  }
}
