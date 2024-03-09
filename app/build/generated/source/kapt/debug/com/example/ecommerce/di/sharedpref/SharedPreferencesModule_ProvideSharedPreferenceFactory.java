package com.example.ecommerce.di.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class SharedPreferencesModule_ProvideSharedPreferenceFactory implements Factory<SharedPreferences> {
  private final Provider<Context> contextProvider;

  public SharedPreferencesModule_ProvideSharedPreferenceFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideSharedPreference(contextProvider.get());
  }

  public static SharedPreferencesModule_ProvideSharedPreferenceFactory create(
      Provider<Context> contextProvider) {
    return new SharedPreferencesModule_ProvideSharedPreferenceFactory(contextProvider);
  }

  public static SharedPreferences provideSharedPreference(Context context) {
    return Preconditions.checkNotNullFromProvides(SharedPreferencesModule.INSTANCE.provideSharedPreference(context));
  }
}
