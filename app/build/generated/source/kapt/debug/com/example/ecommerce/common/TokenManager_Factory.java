package com.example.ecommerce.common;

import android.content.SharedPreferences;
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
public final class TokenManager_Factory implements Factory<TokenManager> {
  private final Provider<SharedPreferences> sharedPrefProvider;

  public TokenManager_Factory(Provider<SharedPreferences> sharedPrefProvider) {
    this.sharedPrefProvider = sharedPrefProvider;
  }

  @Override
  public TokenManager get() {
    return newInstance(sharedPrefProvider.get());
  }

  public static TokenManager_Factory create(Provider<SharedPreferences> sharedPrefProvider) {
    return new TokenManager_Factory(sharedPrefProvider);
  }

  public static TokenManager newInstance(SharedPreferences sharedPref) {
    return new TokenManager(sharedPref);
  }
}
