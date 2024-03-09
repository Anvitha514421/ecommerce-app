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
public final class DeleteUserCartUseCaseImpl_Factory implements Factory<DeleteUserCartUseCaseImpl> {
  private final Provider<LocalRepository> repositoryProvider;

  public DeleteUserCartUseCaseImpl_Factory(Provider<LocalRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DeleteUserCartUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static DeleteUserCartUseCaseImpl_Factory create(
      Provider<LocalRepository> repositoryProvider) {
    return new DeleteUserCartUseCaseImpl_Factory(repositoryProvider);
  }

  public static DeleteUserCartUseCaseImpl newInstance(LocalRepository repository) {
    return new DeleteUserCartUseCaseImpl(repository);
  }
}
