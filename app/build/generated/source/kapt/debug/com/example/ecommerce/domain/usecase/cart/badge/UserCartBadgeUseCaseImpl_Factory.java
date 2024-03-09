package com.example.ecommerce.domain.usecase.cart.badge;

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
public final class UserCartBadgeUseCaseImpl_Factory implements Factory<UserCartBadgeUseCaseImpl> {
  private final Provider<LocalRepository> repositoryProvider;

  public UserCartBadgeUseCaseImpl_Factory(Provider<LocalRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public UserCartBadgeUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static UserCartBadgeUseCaseImpl_Factory create(
      Provider<LocalRepository> repositoryProvider) {
    return new UserCartBadgeUseCaseImpl_Factory(repositoryProvider);
  }

  public static UserCartBadgeUseCaseImpl newInstance(LocalRepository repository) {
    return new UserCartBadgeUseCaseImpl(repository);
  }
}
