package com.example.ecommerce.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.ecommerce.domain.entity.cart.UserCartEntity;
import com.example.ecommerce.domain.entity.product.FavoriteProductEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDao_Impl implements AppDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserCartEntity> __insertionAdapterOfUserCartEntity;

  private final EntityInsertionAdapter<FavoriteProductEntity> __insertionAdapterOfFavoriteProductEntity;

  private final EntityDeletionOrUpdateAdapter<UserCartEntity> __deletionAdapterOfUserCartEntity;

  private final EntityDeletionOrUpdateAdapter<FavoriteProductEntity> __deletionAdapterOfFavoriteProductEntity;

  private final EntityDeletionOrUpdateAdapter<UserCartEntity> __updateAdapterOfUserCartEntity;

  public AppDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserCartEntity = new EntityInsertionAdapter<UserCartEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user_carts` (`userId`,`product_id`,`product_price`,`product_quantity`,`product_title`,`product_image`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserCartEntity value) {
        if (value.getUserId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUserId());
        }
        stmt.bindLong(2, value.getProductId());
        stmt.bindLong(3, value.getPrice());
        stmt.bindLong(4, value.getQuantity());
        if (value.getTitle() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTitle());
        }
        if (value.getImage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getImage());
        }
      }
    };
    this.__insertionAdapterOfFavoriteProductEntity = new EntityInsertionAdapter<FavoriteProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `favorite_items` (`userId`,`product_id`,`product_price`,`product_quantity`,`product_title`,`product_image`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoriteProductEntity value) {
        if (value.getUserId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUserId());
        }
        stmt.bindLong(2, value.getProductId());
        stmt.bindLong(3, value.getPrice());
        stmt.bindLong(4, value.getQuantity());
        if (value.getTitle() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTitle());
        }
        if (value.getImage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getImage());
        }
      }
    };
    this.__deletionAdapterOfUserCartEntity = new EntityDeletionOrUpdateAdapter<UserCartEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `user_carts` WHERE `product_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserCartEntity value) {
        stmt.bindLong(1, value.getProductId());
      }
    };
    this.__deletionAdapterOfFavoriteProductEntity = new EntityDeletionOrUpdateAdapter<FavoriteProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `favorite_items` WHERE `product_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoriteProductEntity value) {
        stmt.bindLong(1, value.getProductId());
      }
    };
    this.__updateAdapterOfUserCartEntity = new EntityDeletionOrUpdateAdapter<UserCartEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `user_carts` SET `userId` = ?,`product_id` = ?,`product_price` = ?,`product_quantity` = ?,`product_title` = ?,`product_image` = ? WHERE `product_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserCartEntity value) {
        if (value.getUserId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUserId());
        }
        stmt.bindLong(2, value.getProductId());
        stmt.bindLong(3, value.getPrice());
        stmt.bindLong(4, value.getQuantity());
        if (value.getTitle() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTitle());
        }
        if (value.getImage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getImage());
        }
        stmt.bindLong(7, value.getProductId());
      }
    };
  }

  @Override
  public Object insertUserCart(final UserCartEntity userCartEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserCartEntity.insert(userCartEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertFavoriteItem(final FavoriteProductEntity favoriteProductEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFavoriteProductEntity.insert(favoriteProductEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteUserCartItem(final UserCartEntity userCartEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfUserCartEntity.handle(userCartEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteFavoriteItem(final FavoriteProductEntity favoriteProductEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFavoriteProductEntity.handle(favoriteProductEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateUserCartItem(final UserCartEntity userCartEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfUserCartEntity.handle(userCartEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getCartByUserId(final String userId,
      final Continuation<? super List<UserCartEntity>> continuation) {
    final String _sql = "SELECT * FROM user_carts WHERE userId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<UserCartEntity>>() {
      @Override
      public List<UserCartEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "product_price");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "product_quantity");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "product_title");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image");
          final List<UserCartEntity> _result = new ArrayList<UserCartEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UserCartEntity _item;
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            final int _tmpProductId;
            _tmpProductId = _cursor.getInt(_cursorIndexOfProductId);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final int _tmpQuantity;
            _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            _item = new UserCartEntity(_tmpUserId,_tmpProductId,_tmpPrice,_tmpQuantity,_tmpTitle,_tmpImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getFavoriteProducts(final String userId,
      final Continuation<? super List<FavoriteProductEntity>> continuation) {
    final String _sql = "SELECT * FROM favorite_items WHERE userId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<FavoriteProductEntity>>() {
      @Override
      public List<FavoriteProductEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "product_price");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "product_quantity");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "product_title");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image");
          final List<FavoriteProductEntity> _result = new ArrayList<FavoriteProductEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FavoriteProductEntity _item;
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            final int _tmpProductId;
            _tmpProductId = _cursor.getInt(_cursorIndexOfProductId);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final int _tmpQuantity;
            _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            _item = new FavoriteProductEntity(_tmpUserId,_tmpProductId,_tmpPrice,_tmpQuantity,_tmpTitle,_tmpImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getBadgeCount(final String userId,
      final Continuation<? super Integer> continuation) {
    final String _sql = "SELECT COUNT(*) FROM user_carts WHERE userId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
