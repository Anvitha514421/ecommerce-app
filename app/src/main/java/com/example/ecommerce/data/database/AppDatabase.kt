package com.example.ecommerce.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ecommerce.data.database.AppDao
import com.example.ecommerce.domain.entity.cart.UserCartEntity
import com.example.ecommerce.domain.entity.product.FavoriteProductEntity

@Database(entities = [UserCartEntity::class, FavoriteProductEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun appDao(): AppDao
}
