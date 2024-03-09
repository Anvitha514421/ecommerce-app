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
public final class SingleProductEntityMapper_Factory implements Factory<SingleProductEntityMapper> {
  @Override
  public SingleProductEntityMapper get() {
    return newInstance();
  }

  public static SingleProductEntityMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SingleProductEntityMapper newInstance() {
    return new SingleProductEntityMapper();
  }

  private static final class InstanceHolder {
    private static final SingleProductEntityMapper_Factory INSTANCE = new SingleProductEntityMapper_Factory();
  }
}
