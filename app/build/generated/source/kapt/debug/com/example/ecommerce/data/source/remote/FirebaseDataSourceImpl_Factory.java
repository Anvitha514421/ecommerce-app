package com.example.ecommerce.data.source.remote;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
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
public final class FirebaseDataSourceImpl_Factory implements Factory<FirebaseDataSourceImpl> {
  private final Provider<FirebaseAuth> firebaseAuthProvider;

  private final Provider<FirebaseFirestore> firestoreProvider;

  public FirebaseDataSourceImpl_Factory(Provider<FirebaseAuth> firebaseAuthProvider,
      Provider<FirebaseFirestore> firestoreProvider) {
    this.firebaseAuthProvider = firebaseAuthProvider;
    this.firestoreProvider = firestoreProvider;
  }

  @Override
  public FirebaseDataSourceImpl get() {
    return newInstance(firebaseAuthProvider.get(), firestoreProvider.get());
  }

  public static FirebaseDataSourceImpl_Factory create(Provider<FirebaseAuth> firebaseAuthProvider,
      Provider<FirebaseFirestore> firestoreProvider) {
    return new FirebaseDataSourceImpl_Factory(firebaseAuthProvider, firestoreProvider);
  }

  public static FirebaseDataSourceImpl newInstance(FirebaseAuth firebaseAuth,
      FirebaseFirestore firestore) {
    return new FirebaseDataSourceImpl(firebaseAuth, firestore);
  }
}
