package com.example.ecommerce.ui.screens.auth.viewModels

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ecommerce.common.Constants.PREF_FIREBASE_USERID_KEY
import com.example.ecommerce.common.ScreenState
import com.example.ecommerce.domain.entity.user.FirebaseSignInUserEntity
import com.example.ecommerce.domain.entity.user.UserInformationEntity
import com.example.ecommerce.domain.mapper.ProductBaseMapper
import com.example.ecommerce.domain.usecase.user.sign_in.FirebaseUserSingInUseCase
import com.example.ecommerce.ui.uiData.UserInformationUiData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SigInViewModel @Inject constructor(
    private val firebaseUserSingInUseCase: FirebaseUserSingInUseCase,
    private val firebaseUserInfoToUiData: ProductBaseMapper<UserInformationEntity, UserInformationUiData>,
    private val sharedPreferences: SharedPreferences,
) : ViewModel() {

    private val _firebaseLoginState = MutableLiveData<ScreenState<UserInformationUiData>>()
    val firebaseLoginState: LiveData<ScreenState<UserInformationUiData>> get() = _firebaseLoginState

    fun loginWithFirebase(user: FirebaseSignInUserEntity) {
        viewModelScope.launch {
            _firebaseLoginState.postValue(ScreenState.Loading)
            firebaseUserSingInUseCase.invoke(
                user,
                onSuccess = {
                    _firebaseLoginState.postValue(
                        ScreenState.Success(
                            firebaseUserInfoToUiData.map(
                                it,
                            ),
                        ),
                    )
                    saveUserIdToSharedPref(it.id)
                },
            ) {
                _firebaseLoginState.postValue(ScreenState.Error(it))
            }
        }
    }

    private fun saveUserIdToSharedPref(id: String) {
        sharedPreferences.edit()
            .putString(PREF_FIREBASE_USERID_KEY, id)
            .apply()
    }
}
