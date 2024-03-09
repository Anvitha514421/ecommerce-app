package com.example.ecommerce.domain.usecase.favorite;

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
public final class DeleteFavoriteUseCaseImpl_Factory implements Factory<DeleteFavoriteUseCaseImpl> {
  private final Provider<LocalRepository> repositoryProvider;

  public DeleteFavoriteUseCaseImpl_Factory(Provider<LocalRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DeleteFavoriteUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static DeleteFavoriteUseCaseImpl_Factory create(
      Provider<LocalRepository> repositoryProvider) {
    return new DeleteFavoriteUseCaseImpl_Factory(repositoryProvider);
  }

  public static DeleteFavoriteUseCaseImpl newInstance(LocalRepository repository) {
    return new DeleteFavoriteUseCaseImpl(repository);
  }
}
