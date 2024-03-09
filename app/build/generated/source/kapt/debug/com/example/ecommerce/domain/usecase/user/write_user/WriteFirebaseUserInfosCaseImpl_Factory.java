package com.example.ecommerce.domain.usecase.user.write_user;

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
public final class WriteFirebaseUserInfosCaseImpl_Factory implements Factory<WriteFirebaseUserInfosCaseImpl> {
  private final Provider<FirebaseRepository> repositoryProvider;

  public WriteFirebaseUserInfosCaseImpl_Factory(Provider<FirebaseRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public WriteFirebaseUserInfosCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static WriteFirebaseUserInfosCaseImpl_Factory create(
      Provider<FirebaseRepository> repositoryProvider) {
    return new WriteFirebaseUserInfosCaseImpl_Factory(repositoryProvider);
  }

  public static WriteFirebaseUserInfosCaseImpl newInstance(FirebaseRepository repository) {
    return new WriteFirebaseUserInfosCaseImpl(repository);
  }
}
