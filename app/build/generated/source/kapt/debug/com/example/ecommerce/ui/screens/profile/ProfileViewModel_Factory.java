package com.example.ecommerce.ui.screens.profile;

import android.content.SharedPreferences;
import com.example.ecommerce.domain.entity.user.UserInformationEntity;
import com.example.ecommerce.domain.mapper.ProductBaseMapper;
import com.example.ecommerce.domain.usecase.user.read_user.ReadFirebaseUserInfosUseCase;
import com.example.ecommerce.ui.uiData.UserInformationUiData;
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
public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
  private final Provider<ReadFirebaseUserInfosUseCase> readFirebaseUserInfosUseCaseProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<ProductBaseMapper<UserInformationEntity, UserInformationUiData>> firebaseUserInfoToUiDataProvider;

  public ProfileViewModel_Factory(
      Provider<ReadFirebaseUserInfosUseCase> readFirebaseUserInfosUseCaseProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<ProductBaseMapper<UserInformationEntity, UserInformationUiData>> firebaseUserInfoToUiDataProvider) {
    this.readFirebaseUserInfosUseCaseProvider = readFirebaseUserInfosUseCaseProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.firebaseUserInfoToUiDataProvider = firebaseUserInfoToUiDataProvider;
  }

  @Override
  public ProfileViewModel get() {
    return newInstance(readFirebaseUserInfosUseCaseProvider.get(), sharedPreferencesProvider.get(), firebaseUserInfoToUiDataProvider.get());
  }

  public static ProfileViewModel_Factory create(
      Provider<ReadFirebaseUserInfosUseCase> readFirebaseUserInfosUseCaseProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<ProductBaseMapper<UserInformationEntity, UserInformationUiData>> firebaseUserInfoToUiDataProvider) {
    return new ProfileViewModel_Factory(readFirebaseUserInfosUseCaseProvider, sharedPreferencesProvider, firebaseUserInfoToUiDataProvider);
  }

  public static ProfileViewModel newInstance(
      ReadFirebaseUserInfosUseCase readFirebaseUserInfosUseCase,
      SharedPreferences sharedPreferences,
      ProductBaseMapper<UserInformationEntity, UserInformationUiData> firebaseUserInfoToUiData) {
    return new ProfileViewModel(readFirebaseUserInfosUseCase, sharedPreferences, firebaseUserInfoToUiData);
  }
}
