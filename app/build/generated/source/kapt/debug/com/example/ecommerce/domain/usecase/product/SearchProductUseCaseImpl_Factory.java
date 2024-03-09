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
public final class SearchProductUseCaseImpl_Factory implements Factory<SearchProductUseCaseImpl> {
  private final Provider<RemoteRepository> repositoryProvider;

  public SearchProductUseCaseImpl_Factory(Provider<RemoteRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SearchProductUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static SearchProductUseCaseImpl_Factory create(
      Provider<RemoteRepository> repositoryProvider) {
    return new SearchProductUseCaseImpl_Factory(repositoryProvider);
  }

  public static SearchProductUseCaseImpl newInstance(RemoteRepository repository) {
    return new SearchProductUseCaseImpl(repository);
  }
}
