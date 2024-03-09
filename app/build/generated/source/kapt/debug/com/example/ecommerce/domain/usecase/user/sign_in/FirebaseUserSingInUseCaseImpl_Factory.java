package com.example.ecommerce.domain.usecase.user.sign_in;

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
public final class FirebaseUserSingInUseCaseImpl_Factory implements Factory<FirebaseUserSingInUseCaseImpl> {
  private final Provider<FirebaseRepository> firebaseRepositoryProvider;

  public FirebaseUserSingInUseCaseImpl_Factory(
      Provider<FirebaseRepository> firebaseRepositoryProvider) {
    this.firebaseRepositoryProvider = firebaseRepositoryProvider;
  }

  @Override
  public FirebaseUserSingInUseCaseImpl get() {
    return newInstance(firebaseRepositoryProvider.get());
  }

  public static FirebaseUserSingInUseCaseImpl_Factory create(
      Provider<FirebaseRepository> firebaseRepositoryProvider) {
    return new FirebaseUserSingInUseCaseImpl_Factory(firebaseRepositoryProvider);
  }

  public static FirebaseUserSingInUseCaseImpl newInstance(FirebaseRepository firebaseRepository) {
    return new FirebaseUserSingInUseCaseImpl(firebaseRepository);
  }
}
