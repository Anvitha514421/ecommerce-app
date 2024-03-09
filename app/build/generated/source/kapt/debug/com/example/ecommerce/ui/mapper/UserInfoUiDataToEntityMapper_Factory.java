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
public final class UserInfoUiDataToEntityMapper_Factory implements Factory<UserInfoUiDataToEntityMapper> {
  @Override
  public UserInfoUiDataToEntityMapper get() {
    return newInstance();
  }

  public static UserInfoUiDataToEntityMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static UserInfoUiDataToEntityMapper newInstance() {
    return new UserInfoUiDataToEntityMapper();
  }

  private static final class InstanceHolder {
    private static final UserInfoUiDataToEntityMapper_Factory INSTANCE = new UserInfoUiDataToEntityMapper_Factory();
  }
}
