package com.example.ecommerce.domain.usecase.user.write_user

import com.example.ecommerce.domain.entity.user.UserInformationEntity

interface WriteFirebaseUserInfosUseCase {
    operator fun invoke(
        user: UserInformationEntity,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit,
    )
}
