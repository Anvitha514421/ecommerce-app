package com.example.ecommerce.di.repository

import com.example.ecommerce.domain.repository.FirebaseRepository
import com.example.ecommerce.domain.repository.LocalRepository
import com.example.ecommerce.domain.repository.RemoteRepository
import com.example.ecommerce.data.repository.FirebaseRepositoryImpl
import com.example.ecommerce.data.repository.LocalRepositoryImpl
import com.example.ecommerce.data.repository.RemoteRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    @ViewModelScoped
    abstract fun bindRemoteRepository(
        repository: RemoteRepositoryImpl,
    ): RemoteRepository

    @Binds
    @ViewModelScoped
    abstract fun bindLocalRepository(
        repository: LocalRepositoryImpl,
    ): LocalRepository

    @Binds
    @ViewModelScoped
    abstract fun bindFirebaseRepository(
        repository: FirebaseRepositoryImpl,
    ): FirebaseRepository
}
