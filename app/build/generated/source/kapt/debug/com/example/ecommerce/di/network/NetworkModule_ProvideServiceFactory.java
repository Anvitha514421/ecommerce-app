package com.example.ecommerce.di.network;

import com.example.ecommerce.data.api.ApiService;
import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

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
public final class NetworkModule_ProvideServiceFactory implements Factory<ApiService> {
  private final Provider<Moshi> moshiProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetworkModule_ProvideServiceFactory(Provider<Moshi> moshiProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.moshiProvider = moshiProvider;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public ApiService get() {
    return provideService(moshiProvider.get(), okHttpClientProvider.get());
  }

  public static NetworkModule_ProvideServiceFactory create(Provider<Moshi> moshiProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new NetworkModule_ProvideServiceFactory(moshiProvider, okHttpClientProvider);
  }

  public static ApiService provideService(Moshi moshi, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideService(moshi, okHttpClient));
  }
}
