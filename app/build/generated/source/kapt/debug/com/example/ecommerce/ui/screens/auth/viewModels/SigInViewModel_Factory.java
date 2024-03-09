package com.example.ecommerce.ui.screens.auth.viewModels;

import android.content.SharedPreferences;
import com.example.ecommerce.domain.entity.user.UserInformationEntity;
import com.example.ecommerce.domain.mapper.ProductBaseMapper;
import com.example.ecommerce.domain.usecase.user.sign_in.FirebaseUserSingInUseCase;
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
public final class SigInViewModel_Factory implements Factory<SigInViewModel> {
  private final Provider<FirebaseUserSingInUseCase> firebaseUserSingInUseCaseProvider;

  private final Provider<ProductBaseMapper<UserInformationEntity, UserInformationUiData>> firebaseUserInfoToUiDataProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public SigInViewModel_Factory(
      Provider<FirebaseUserSingInUseCase> firebaseUserSingInUseCaseProvider,
      Provider<ProductBaseMapper<UserInformationEntity, UserInformationUiData>> firebaseUserInfoToUiDataProvider,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.firebaseUserSingInUseCaseProvider = firebaseUserSingInUseCaseProvider;
    this.firebaseUserInfoToUiDataProvider = firebaseUserInfoToUiDataProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public SigInViewModel get() {
    return newInstance(firebaseUserSingInUseCaseProvider.get(), firebaseUserInfoToUiDataProvider.get(), sharedPreferencesProvider.get());
  }

  public static SigInViewModel_Factory create(
      Provider<FirebaseUserSingInUseCase> firebaseUserSingInUseCaseProvider,
      Provider<ProductBaseMapper<UserInformationEntity, UserInformationUiData>> firebaseUserInfoToUiDataProvider,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new SigInViewModel_Factory(firebaseUserSingInUseCaseProvider, firebaseUserInfoToUiDataProvider, sharedPreferencesProvider);
  }

  public static SigInViewModel newInstance(FirebaseUserSingInUseCase firebaseUserSingInUseCase,
      ProductBaseMapper<UserInformationEntity, UserInformationUiData> firebaseUserInfoToUiData,
      SharedPreferences sharedPreferences) {
    return new SigInViewModel(firebaseUserSingInUseCase, firebaseUserInfoToUiData, sharedPreferences);
  }
}
