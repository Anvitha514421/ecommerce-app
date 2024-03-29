package com.example.ecommerce.di.firebase;

import com.google.firebase.firestore.FirebaseFirestore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class FirebaseModule_ProvideFireStoreInstanceFactory implements Factory<FirebaseFirestore> {
  @Override
  public FirebaseFirestore get() {
    return provideFireStoreInstance();
  }

  public static FirebaseModule_ProvideFireStoreInstanceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FirebaseFirestore provideFireStoreInstance() {
    return Preconditions.checkNotNullFromProvides(FirebaseModule.INSTANCE.provideFireStoreInstance());
  }

  private static final class InstanceHolder {
    private static final FirebaseModule_ProvideFireStoreInstanceFactory INSTANCE = new FirebaseModule_ProvideFireStoreInstanceFactory();
  }
}
