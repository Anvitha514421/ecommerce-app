package com.example.ecommerce.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile AppDao _appDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user_carts` (`userId` TEXT NOT NULL, `product_id` INTEGER NOT NULL, `product_price` INTEGER NOT NULL, `product_quantity` INTEGER NOT NULL, `product_title` TEXT NOT NULL, `product_image` TEXT NOT NULL, PRIMARY KEY(`product_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `favorite_items` (`userId` TEXT NOT NULL, `product_id` INTEGER NOT NULL, `product_price` INTEGER NOT NULL, `product_quantity` INTEGER NOT NULL, `product_title` TEXT NOT NULL, `product_image` TEXT NOT NULL, PRIMARY KEY(`product_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f62cda01d21f4cf8581988c65c4b1771')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `user_carts`");
        _db.execSQL("DROP TABLE IF EXISTS `favorite_items`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUserCarts = new HashMap<String, TableInfo.Column>(6);
        _columnsUserCarts.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserCarts.put("product_id", new TableInfo.Column("product_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserCarts.put("product_price", new TableInfo.Column("product_price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserCarts.put("product_quantity", new TableInfo.Column("product_quantity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserCarts.put("product_title", new TableInfo.Column("product_title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserCarts.put("product_image", new TableInfo.Column("product_image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserCarts = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserCarts = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserCarts = new TableInfo("user_carts", _columnsUserCarts, _foreignKeysUserCarts, _indicesUserCarts);
        final TableInfo _existingUserCarts = TableInfo.read(_db, "user_carts");
        if (! _infoUserCarts.equals(_existingUserCarts)) {
          return new RoomOpenHelper.ValidationResult(false, "user_carts(com.example.ecommerce.domain.entity.cart.UserCartEntity).\n"
                  + " Expected:\n" + _infoUserCarts + "\n"
                  + " Found:\n" + _existingUserCarts);
        }
        final HashMap<String, TableInfo.Column> _columnsFavoriteItems = new HashMap<String, TableInfo.Column>(6);
        _columnsFavoriteItems.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteItems.put("product_id", new TableInfo.Column("product_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteItems.put("product_price", new TableInfo.Column("product_price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteItems.put("product_quantity", new TableInfo.Column("product_quantity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteItems.put("product_title", new TableInfo.Column("product_title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteItems.put("product_image", new TableInfo.Column("product_image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavoriteItems = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavoriteItems = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavoriteItems = new TableInfo("favorite_items", _columnsFavoriteItems, _foreignKeysFavoriteItems, _indicesFavoriteItems);
        final TableInfo _existingFavoriteItems = TableInfo.read(_db, "favorite_items");
        if (! _infoFavoriteItems.equals(_existingFavoriteItems)) {
          return new RoomOpenHelper.ValidationResult(false, "favorite_items(com.example.ecommerce.domain.entity.product.FavoriteProductEntity).\n"
                  + " Expected:\n" + _infoFavoriteItems + "\n"
                  + " Found:\n" + _existingFavoriteItems);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "f62cda01d21f4cf8581988c65c4b1771", "3061941402914d7b1544f57c8c6e0c7c");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "user_carts","favorite_items");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `user_carts`");
      _db.execSQL("DELETE FROM `favorite_items`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(AppDao.class, AppDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public AppDao appDao() {
    if (_appDao != null) {
      return _appDao;
    } else {
      synchronized(this) {
        if(_appDao == null) {
          _appDao = new AppDao_Impl(this);
        }
        return _appDao;
      }
    }
  }
}
