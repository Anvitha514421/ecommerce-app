package com.example.ecommerce.domain.usecase.user.forget_pw

import com.example.ecommerce.domain.repository.FirebaseRepository
import javax.inject.Inject

class ForgotPwFirebaseUserUseCaseImpl @Inject constructor(
    private val repository: FirebaseRepository,
): ForgotPwFirebaseUserUseCase {
    override fun invoke(email: String, onSuccess: (String) -> Unit, onFailure: (String) -> Unit) {
        repository.forgotPassword(
            email,
            onSuccess = {
                onSuccess("Success")
            },
            onFailure = {
                onFailure(it)
            },
        )
    }

}