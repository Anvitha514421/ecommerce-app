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
public final class CartEntityToFavoriteEntityMapper_Factory implements Factory<CartEntityToFavoriteEntityMapper> {
  @Override
  public CartEntityToFavoriteEntityMapper get() {
    return newInstance();
  }

  public static CartEntityToFavoriteEntityMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CartEntityToFavoriteEntityMapper newInstance() {
    return new CartEntityToFavoriteEntityMapper();
  }

  private static final class InstanceHolder {
    private static final CartEntityToFavoriteEntityMapper_Factory INSTANCE = new CartEntityToFavoriteEntityMapper_Factory();
  }
}
