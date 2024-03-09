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
public final class CartUiToEntityMapper_Factory implements Factory<CartUiToEntityMapper> {
  @Override
  public CartUiToEntityMapper get() {
    return newInstance();
  }

  public static CartUiToEntityMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CartUiToEntityMapper newInstance() {
    return new CartUiToEntityMapper();
  }

  private static final class InstanceHolder {
    private static final CartUiToEntityMapper_Factory INSTANCE = new CartUiToEntityMapper_Factory();
  }
}
