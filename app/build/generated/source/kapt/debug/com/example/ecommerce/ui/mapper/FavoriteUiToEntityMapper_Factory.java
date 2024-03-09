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
public final class FavoriteUiToEntityMapper_Factory implements Factory<FavoriteUiToEntityMapper> {
  @Override
  public FavoriteUiToEntityMapper get() {
    return newInstance();
  }

  public static FavoriteUiToEntityMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FavoriteUiToEntityMapper newInstance() {
    return new FavoriteUiToEntityMapper();
  }

  private static final class InstanceHolder {
    private static final FavoriteUiToEntityMapper_Factory INSTANCE = new FavoriteUiToEntityMapper_Factory();
  }
}
