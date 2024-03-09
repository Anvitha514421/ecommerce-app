package com.example.ecommerce.ui.screens.auth.viewModels;

import com.example.ecommerce.domain.entity.user.UserInformationEntity;
import com.example.ecommerce.domain.mapper.ProductBaseMapper;
import com.example.ecommerce.domain.usecase.user.sign_up.FirebaseUserSignUpUseCase;
import com.example.ecommerce.domain.usecase.user.write_user.WriteFirebaseUserInfosUseCase;
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
public final class SignUpViewModel_Factory implements Factory<SignUpViewModel> {
  private final Provider<FirebaseUserSignUpUseCase> signUpUseCaseProvider;

  private final Provider<WriteFirebaseUserInfosUseCase> writeFirebaseUserInfosUseCaseProvider;

  private final Provider<ProductBaseMapper<UserInformationUiData, UserInformationEntity>> userInfoToEntityProvider;

  public SignUpViewModel_Factory(Provider<FirebaseUserSignUpUseCase> signUpUseCaseProvider,
      Provider<WriteFirebaseUserInfosUseCase> writeFirebaseUserInfosUseCaseProvider,
      Provider<ProductBaseMapper<UserInformationUiData, UserInformationEntity>> userInfoToEntityProvider) {
    this.signUpUseCaseProvider = signUpUseCaseProvider;
    this.writeFirebaseUserInfosUseCaseProvider = writeFirebaseUserInfosUseCaseProvider;
    this.userInfoToEntityProvider = userInfoToEntityProvider;
  }

  @Override
  public SignUpViewModel get() {
    return newInstance(signUpUseCaseProvider.get(), writeFirebaseUserInfosUseCaseProvider.get(), userInfoToEntityProvider.get());
  }

  public static SignUpViewModel_Factory create(
      Provider<FirebaseUserSignUpUseCase> signUpUseCaseProvider,
      Provider<WriteFirebaseUserInfosUseCase> writeFirebaseUserInfosUseCaseProvider,
      Provider<ProductBaseMapper<UserInformationUiData, UserInformationEntity>> userInfoToEntityProvider) {
    return new SignUpViewModel_Factory(signUpUseCaseProvider, writeFirebaseUserInfosUseCaseProvider, userInfoToEntityProvider);
  }

  public static SignUpViewModel newInstance(FirebaseUserSignUpUseCase signUpUseCase,
      WriteFirebaseUserInfosUseCase writeFirebaseUserInfosUseCase,
      ProductBaseMapper<UserInformationUiData, UserInformationEntity> userInfoToEntity) {
    return new SignUpViewModel(signUpUseCase, writeFirebaseUserInfosUseCase, userInfoToEntity);
  }
}
