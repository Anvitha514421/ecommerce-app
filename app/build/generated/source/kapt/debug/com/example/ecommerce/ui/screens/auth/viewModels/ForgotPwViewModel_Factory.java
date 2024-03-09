package com.example.ecommerce.ui.screens.auth.viewModels;

import com.example.ecommerce.domain.usecase.user.forget_pw.ForgotPwFirebaseUserUseCase;
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
public final class ForgotPwViewModel_Factory implements Factory<ForgotPwViewModel> {
  private final Provider<ForgotPwFirebaseUserUseCase> useCaseProvider;

  public ForgotPwViewModel_Factory(Provider<ForgotPwFirebaseUserUseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public ForgotPwViewModel get() {
    return newInstance(useCaseProvider.get());
  }

  public static ForgotPwViewModel_Factory create(
      Provider<ForgotPwFirebaseUserUseCase> useCaseProvider) {
    return new ForgotPwViewModel_Factory(useCaseProvider);
  }

  public static ForgotPwViewModel newInstance(ForgotPwFirebaseUserUseCase useCase) {
    return new ForgotPwViewModel(useCase);
  }
}
