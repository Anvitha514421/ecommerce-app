package com.example.ecommerce.domain.usecase.user.write_user

import com.example.ecommerce.domain.entity.user.UserInformationEntity
import com.example.ecommerce.domain.repository.FirebaseRepository
import javax.inject.Inject

class WriteFirebaseUserInfosCaseImpl @Inject constructor(
    private val repository: FirebaseRepository,
) : WriteFirebaseUserInfosUseCase {
    override fun invoke(
        user: UserInformationEntity,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit,
    ) {
        repository.writeNewUserToFirebaseDatabase(user, onSuccess, onFailure)
    }
}
