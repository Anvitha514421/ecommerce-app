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
public final class DetailProductEntityToUiMapper_Factory implements Factory<DetailProductEntityToUiMapper> {
  @Override
  public DetailProductEntityToUiMapper get() {
    return newInstance();
  }

  public static DetailProductEntityToUiMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DetailProductEntityToUiMapper newInstance() {
    return new DetailProductEntityToUiMapper();
  }

  private static final class InstanceHolder {
    private static final DetailProductEntityToUiMapper_Factory INSTANCE = new DetailProductEntityToUiMapper_Factory();
  }
}
