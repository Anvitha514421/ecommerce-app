package com.example.ecommerce.domain.usecase.user.read_user;

import com.example.ecommerce.domain.repository.FirebaseRepository;
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
public final class ReadFirebaseUserInfosUseCaseImpl_Factory implements Factory<ReadFirebaseUserInfosUseCaseImpl> {
  private final Provider<FirebaseRepository> repositoryProvider;

  public ReadFirebaseUserInfosUseCaseImpl_Factory(Provider<FirebaseRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ReadFirebaseUserInfosUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static ReadFirebaseUserInfosUseCaseImpl_Factory create(
      Provider<FirebaseRepository> repositoryProvider) {
    return new ReadFirebaseUserInfosUseCaseImpl_Factory(repositoryProvider);
  }

  public static ReadFirebaseUserInfosUseCaseImpl newInstance(FirebaseRepository repository) {
    return new ReadFirebaseUserInfosUseCaseImpl(repository);
  }
}
