package com.example.ecommerce.ui.mapper;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class FavoriteEntityToUiMapper_Factory implements Factory<FavoriteEntityToUiMapper> {
  @Override
  public FavoriteEntityToUiMapper get() {
    return newInstance();
  }

  public static FavoriteEntityToUiMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FavoriteEntityToUiMapper newInstance() {
    return new FavoriteEntityToUiMapper();
  }

  private static final class InstanceHolder {
    private static final FavoriteEntityToUiMapper_Factory INSTANCE = new FavoriteEntityToUiMapper_Factory();
  }
}
