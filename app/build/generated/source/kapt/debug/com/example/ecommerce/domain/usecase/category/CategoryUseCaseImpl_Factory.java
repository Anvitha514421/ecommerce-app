package com.example.ecommerce.domain.usecase.category;

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
public final class CategoryUseCaseImpl_Factory implements Factory<CategoryUseCaseImpl> {
  private final Provider<RemoteRepository> repositoryProvider;

  public CategoryUseCaseImpl_Factory(Provider<RemoteRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CategoryUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static CategoryUseCaseImpl_Factory create(Provider<RemoteRepository> repositoryProvider) {
    return new CategoryUseCaseImpl_Factory(repositoryProvider);
  }

  public static CategoryUseCaseImpl newInstance(RemoteRepository repository) {
    return new CategoryUseCaseImpl(repository);
  }
}
