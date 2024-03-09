package com.example.ecommerce.data.repository;

import com.example.ecommerce.common.TokenManager;
import com.example.ecommerce.data.source.remote.FirebaseDataSource;
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
public final class FirebaseRepositoryImpl_Factory implements Factory<FirebaseRepositoryImpl> {
  private final Provider<FirebaseDataSource> firebaseDataSourceProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  public FirebaseRepositoryImpl_Factory(Provider<FirebaseDataSource> firebaseDataSourceProvider,
      Provider<TokenManager> tokenManagerProvider) {
    this.firebaseDataSourceProvider = firebaseDataSourceProvider;
    this.tokenManagerProvider = tokenManagerProvider;
  }

  @Override
  public FirebaseRepositoryImpl get() {
    return newInstance(firebaseDataSourceProvider.get(), tokenManagerProvider.get());
  }

  public static FirebaseRepositoryImpl_Factory create(
      Provider<FirebaseDataSource> firebaseDataSourceProvider,
      Provider<TokenManager> tokenManagerProvider) {
    return new FirebaseRepositoryImpl_Factory(firebaseDataSourceProvider, tokenManagerProvider);
  }

  public static FirebaseRepositoryImpl newInstance(FirebaseDataSource firebaseDataSource,
      TokenManager tokenManager) {
    return new FirebaseRepositoryImpl(firebaseDataSource, tokenManager);
  }
}
