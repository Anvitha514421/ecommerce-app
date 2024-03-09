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
public final class ProductEntityToUiMapper_Factory implements Factory<ProductEntityToUiMapper> {
  @Override
  public ProductEntityToUiMapper get() {
    return newInstance();
  }

  public static ProductEntityToUiMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ProductEntityToUiMapper newInstance() {
    return new ProductEntityToUiMapper();
  }

  private static final class InstanceHolder {
    private static final ProductEntityToUiMapper_Factory INSTANCE = new ProductEntityToUiMapper_Factory();
  }
}
