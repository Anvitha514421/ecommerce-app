package com.example.ecommerce.domain.usecase.user.read_user

import com.example.ecommerce.domain.entity.user.UserInformationEntity

interface ReadFirebaseUserInfosUseCase {
    operator fun invoke(
        userId: String,
        onSuccess: (UserInformationEntity) -> Unit,
        onFailure: (String) -> Unit,
    )
}
