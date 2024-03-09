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
public final class FavoriteUseCaseImpl_Factory implements Factory<FavoriteUseCaseImpl> {
  private final Provider<LocalRepository> repositoryProvider;

  public FavoriteUseCaseImpl_Factory(Provider<LocalRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public FavoriteUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static FavoriteUseCaseImpl_Factory create(Provider<LocalRepository> repositoryProvider) {
    return new FavoriteUseCaseImpl_Factory(repositoryProvider);
  }

  public static FavoriteUseCaseImpl newInstance(LocalRepository repository) {
    return new FavoriteUseCaseImpl(repository);
  }
}
