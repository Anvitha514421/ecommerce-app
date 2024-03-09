package com.example.ecommerce.di.database;

import com.example.ecommerce.data.database.AppDao;
import com.example.ecommerce.data.database.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_ProvideAppDaoFactory implements Factory<AppDao> {
  private final Provider<AppDatabase> appDatabaseProvider;

  public DatabaseModule_ProvideAppDaoFactory(Provider<AppDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public AppDao get() {
    return provideAppDao(appDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideAppDaoFactory create(
      Provider<AppDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvideAppDaoFactory(appDatabaseProvider);
  }

  public static AppDao provideAppDao(AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideAppDao(appDatabase));
  }
}
