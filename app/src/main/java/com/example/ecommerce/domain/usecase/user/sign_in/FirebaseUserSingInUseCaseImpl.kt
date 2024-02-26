package com.example.ecommerce.domain.usecase.user.sign_in

import com.example.ecommerce.domain.entity.user.FirebaseSignInUserEntity
import com.example.ecommerce.domain.entity.user.UserInformationEntity
import com.example.ecommerce.domain.repository.FirebaseRepository
import javax.inject.Inject

class FirebaseUserSingInUseCaseImpl @Inject constructor(
    private val firebaseRepository: FirebaseRepository
): FirebaseUserSingInUseCase {
    override fun invoke(user: FirebaseSignInUserEntity, onSuccess: (UserInformationEntity) -> Unit, onFailure: (String) -> Unit) {
        firebaseRepository.signInWithFirebase(user, onSuccess, onFailure)
    }
}