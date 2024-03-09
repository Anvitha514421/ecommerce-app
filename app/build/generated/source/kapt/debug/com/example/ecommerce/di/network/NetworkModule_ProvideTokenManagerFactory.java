package com.example.ecommerce.di.network;

import android.content.SharedPreferences;
import com.example.ecommerce.common.TokenManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class NetworkModule_ProvideTokenManagerFactory implements Factory<TokenManager> {
  private final Provider<SharedPreferences> sharedPrefProvider;

  public NetworkModule_ProvideTokenManagerFactory(Provider<SharedPreferences> sharedPrefProvider) {
    this.sharedPrefProvider = sharedPrefProvider;
  }

  @Override
  public TokenManager get() {
    return provideTokenManager(sharedPrefProvider.get());
  }

  public static NetworkModule_ProvideTokenManagerFactory create(
      Provider<SharedPreferences> sharedPrefProvider) {
    return new NetworkModule_ProvideTokenManagerFactory(sharedPrefProvider);
  }

  public static TokenManager provideTokenManager(SharedPreferences sharedPref) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideTokenManager(sharedPref));
  }
}
