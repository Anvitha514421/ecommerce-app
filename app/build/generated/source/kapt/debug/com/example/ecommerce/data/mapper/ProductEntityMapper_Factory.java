package com.example.ecommerce.data.mapper;

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
public final class ProductEntityMapper_Factory implements Factory<ProductEntityMapper> {
  @Override
  public ProductEntityMapper get() {
    return newInstance();
  }

  public static ProductEntityMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ProductEntityMapper newInstance() {
    return new ProductEntityMapper();
  }

  private static final class InstanceHolder {
    private static final ProductEntityMapper_Factory INSTANCE = new ProductEntityMapper_Factory();
  }
}
