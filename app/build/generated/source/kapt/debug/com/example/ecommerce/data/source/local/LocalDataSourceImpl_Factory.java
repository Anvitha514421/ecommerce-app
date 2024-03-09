package com.example.ecommerce.data.source.local;

import com.example.ecommerce.data.database.AppDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class LocalDataSourceImpl_Factory implements Factory<LocalDataSourceImpl> {
  private final Provider<AppDao> appDaoProvider;

  public LocalDataSourceImpl_Factory(Provider<AppDao> appDaoProvider) {
    this.appDaoProvider = appDaoProvider;
  }

  @Override
  public LocalDataSourceImpl get() {
    return newInstance(appDaoProvider.get());
  }

  public static LocalDataSourceImpl_Factory create(Provider<AppDao> appDaoProvider) {
    return new LocalDataSourceImpl_Factory(appDaoProvider);
  }

  public static LocalDataSourceImpl newInstance(AppDao appDao) {
    return new LocalDataSourceImpl(appDao);
  }
}
