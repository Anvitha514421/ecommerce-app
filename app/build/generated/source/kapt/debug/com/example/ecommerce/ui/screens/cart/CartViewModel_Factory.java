package com.example.ecommerce.ui.screens.cart;

import android.content.SharedPreferences;
import com.example.ecommerce.domain.entity.cart.UserCartEntity;
import com.example.ecommerce.domain.mapper.ProductBaseMapper;
import com.example.ecommerce.domain.mapper.ProductListMapper;
import com.example.ecommerce.domain.usecase.cart.CartUseCase;
import com.example.ecommerce.domain.usecase.cart.DeleteUserCartUseCase;
import com.example.ecommerce.domain.usecase.cart.UpdateCartUseCase;
import com.example.ecommerce.domain.usecase.cart.badge.UserCartBadgeUseCase;
import com.example.ecommerce.ui.uiData.UserCartUiData;
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
public final class CartViewModel_Factory implements Factory<CartViewModel> {
  private final Provider<CartUseCase> cartUseCaseProvider;

  private final Provider<UpdateCartUseCase> updateCartUseCaseProvider;

  private final Provider<DeleteUserCartUseCase> deleteCartUseCaseProvider;

  private final Provider<ProductListMapper<UserCartEntity, UserCartUiData>> mapperProvider;

  private final Provider<ProductBaseMapper<UserCartUiData, UserCartEntity>> singleMapperProvider;

  private final Provider<UserCartBadgeUseCase> badgeUseCaseProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public CartViewModel_Factory(Provider<CartUseCase> cartUseCaseProvider,
      Provider<UpdateCartUseCase> updateCartUseCaseProvider,
      Provider<DeleteUserCartUseCase> deleteCartUseCaseProvider,
      Provider<ProductListMapper<UserCartEntity, UserCartUiData>> mapperProvider,
      Provider<ProductBaseMapper<UserCartUiData, UserCartEntity>> singleMapperProvider,
      Provider<UserCartBadgeUseCase> badgeUseCaseProvider,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.cartUseCaseProvider = cartUseCaseProvider;
    this.updateCartUseCaseProvider = updateCartUseCaseProvider;
    this.deleteCartUseCaseProvider = deleteCartUseCaseProvider;
    this.mapperProvider = mapperProvider;
    this.singleMapperProvider = singleMapperProvider;
    this.badgeUseCaseProvider = badgeUseCaseProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public CartViewModel get() {
    return newInstance(cartUseCaseProvider.get(), updateCartUseCaseProvider.get(), deleteCartUseCaseProvider.get(), mapperProvider.get(), singleMapperProvider.get(), badgeUseCaseProvider.get(), sharedPreferencesProvider.get());
  }

  public static CartViewModel_Factory create(Provider<CartUseCase> cartUseCaseProvider,
      Provider<UpdateCartUseCase> updateCartUseCaseProvider,
      Provider<DeleteUserCartUseCase> deleteCartUseCaseProvider,
      Provider<ProductListMapper<UserCartEntity, UserCartUiData>> mapperProvider,
      Provider<ProductBaseMapper<UserCartUiData, UserCartEntity>> singleMapperProvider,
      Provider<UserCartBadgeUseCase> badgeUseCaseProvider,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new CartViewModel_Factory(cartUseCaseProvider, updateCartUseCaseProvider, deleteCartUseCaseProvider, mapperProvider, singleMapperProvider, badgeUseCaseProvider, sharedPreferencesProvider);
  }

  public static CartViewModel newInstance(CartUseCase cartUseCase,
      UpdateCartUseCase updateCartUseCase, DeleteUserCartUseCase deleteCartUseCase,
      ProductListMapper<UserCartEntity, UserCartUiData> mapper,
      ProductBaseMapper<UserCartUiData, UserCartEntity> singleMapper,
      UserCartBadgeUseCase badgeUseCase, SharedPreferences sharedPreferences) {
    return new CartViewModel(cartUseCase, updateCartUseCase, deleteCartUseCase, mapper, singleMapper, badgeUseCase, sharedPreferences);
  }
}
