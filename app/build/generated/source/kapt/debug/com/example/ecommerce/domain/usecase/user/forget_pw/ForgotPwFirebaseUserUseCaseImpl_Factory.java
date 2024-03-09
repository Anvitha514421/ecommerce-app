package com.example.ecommerce.domain.usecase.user.forget_pw;

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
public final class ForgotPwFirebaseUserUseCaseImpl_Factory implements Factory<ForgotPwFirebaseUserUseCaseImpl> {
  private final Provider<FirebaseRepository> repositoryProvider;

  public ForgotPwFirebaseUserUseCaseImpl_Factory(Provider<FirebaseRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ForgotPwFirebaseUserUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static ForgotPwFirebaseUserUseCaseImpl_Factory create(
      Provider<FirebaseRepository> repositoryProvider) {
    return new ForgotPwFirebaseUserUseCaseImpl_Factory(repositoryProvider);
  }

  public static ForgotPwFirebaseUserUseCaseImpl newInstance(FirebaseRepository repository) {
    return new ForgotPwFirebaseUserUseCaseImpl(repository);
  }
}
