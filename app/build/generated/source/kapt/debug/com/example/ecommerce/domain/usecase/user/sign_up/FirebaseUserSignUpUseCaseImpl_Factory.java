package com.example.ecommerce.domain.usecase.user.sign_up;

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
public final class FirebaseUserSignUpUseCaseImpl_Factory implements Factory<FirebaseUserSignUpUseCaseImpl> {
  private final Provider<FirebaseRepository> firebaseRepositoryProvider;

  public FirebaseUserSignUpUseCaseImpl_Factory(
      Provider<FirebaseRepository> firebaseRepositoryProvider) {
    this.firebaseRepositoryProvider = firebaseRepositoryProvider;
  }

  @Override
  public FirebaseUserSignUpUseCaseImpl get() {
    return newInstance(firebaseRepositoryProvider.get());
  }

  public static FirebaseUserSignUpUseCaseImpl_Factory create(
      Provider<FirebaseRepository> firebaseRepositoryProvider) {
    return new FirebaseUserSignUpUseCaseImpl_Factory(firebaseRepositoryProvider);
  }

  public static FirebaseUserSignUpUseCaseImpl newInstance(FirebaseRepository firebaseRepository) {
    return new FirebaseUserSignUpUseCaseImpl(firebaseRepository);
  }
}
