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
public final class CartEntityToUiMapper_Factory implements Factory<CartEntityToUiMapper> {
  @Override
  public CartEntityToUiMapper get() {
    return newInstance();
  }

  public static CartEntityToUiMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CartEntityToUiMapper newInstance() {
    return new CartEntityToUiMapper();
  }

  private static final class InstanceHolder {
    private static final CartEntityToUiMapper_Factory INSTANCE = new CartEntityToUiMapper_Factory();
  }
}
