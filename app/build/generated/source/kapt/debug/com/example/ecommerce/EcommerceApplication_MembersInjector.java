package com.example.ecommerce;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class EcommerceApplication_MembersInjector implements MembersInjector<EcommerceApplication> {
  private final Provider<SharedPreferences> sharedPrefsProvider;

  public EcommerceApplication_MembersInjector(Provider<SharedPreferences> sharedPrefsProvider) {
    this.sharedPrefsProvider = sharedPrefsProvider;
  }

  public static MembersInjector<EcommerceApplication> create(
      Provider<SharedPreferences> sharedPrefsProvider) {
    return new EcommerceApplication_MembersInjector(sharedPrefsProvider);
  }

  @Override
  public void injectMembers(EcommerceApplication instance) {
    injectSharedPrefs(instance, sharedPrefsProvider.get());
  }

  @InjectedFieldSignature("com.example.ecommerce.EcommerceApplication.sharedPrefs")
  public static void injectSharedPrefs(EcommerceApplication instance,
      SharedPreferences sharedPrefs) {
    instance.sharedPrefs = sharedPrefs;
  }
}
