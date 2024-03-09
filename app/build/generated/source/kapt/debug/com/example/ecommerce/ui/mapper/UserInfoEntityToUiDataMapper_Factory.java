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
public final class UserInfoEntityToUiDataMapper_Factory implements Factory<UserInfoEntityToUiDataMapper> {
  @Override
  public UserInfoEntityToUiDataMapper get() {
    return newInstance();
  }

  public static UserInfoEntityToUiDataMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static UserInfoEntityToUiDataMapper newInstance() {
    return new UserInfoEntityToUiDataMapper();
  }

  private static final class InstanceHolder {
    private static final UserInfoEntityToUiDataMapper_Factory INSTANCE = new UserInfoEntityToUiDataMapper_Factory();
  }
}
