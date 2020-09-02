package com.testProject.giphy.Dao;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.paging.DataSource.Factory;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.testProject.giphy.entity.WishGiph;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WishListDao_Impl implements WishListDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WishGiph> __insertionAdapterOfWishGiph;

  private final SharedSQLiteStatement __preparedStmtOfDeleteById;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public WishListDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWishGiph = new EntityInsertionAdapter<WishGiph>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `wish` (`id`,`type`,`url`,`embed_url`,`title`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WishGiph value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getType());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUrl());
        }
        if (value.getEmbed_url() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmbed_url());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTitle());
        }
      }
    };
    this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM wish WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM wish";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final List<WishGiph> posts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWishGiph.insert(posts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final WishGiph wishGiph) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWishGiph.insert(wishGiph);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteById(final String Id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteById.acquire();
    int _argIndex = 1;
    if (Id == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, Id);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteById.release(_stmt);
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public DataSource.Factory<Integer, WishGiph> GetAllGiphs() {
    final String _sql = "SELECT `wish`.`id` AS `id`, `wish`.`type` AS `type`, `wish`.`url` AS `url`, `wish`.`embed_url` AS `embed_url`, `wish`.`title` AS `title` FROM  wish";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, WishGiph>() {
      @Override
      public LimitOffsetDataSource<WishGiph> create() {
        return new LimitOffsetDataSource<WishGiph>(__db, _statement, false , "wish") {
          @Override
          protected List<WishGiph> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(cursor, "type");
            final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(cursor, "url");
            final int _cursorIndexOfEmbedUrl = CursorUtil.getColumnIndexOrThrow(cursor, "embed_url");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(cursor, "title");
            final List<WishGiph> _res = new ArrayList<WishGiph>(cursor.getCount());
            while(cursor.moveToNext()) {
              final WishGiph _item;
              final String _tmpId;
              _tmpId = cursor.getString(_cursorIndexOfId);
              final String _tmpType;
              _tmpType = cursor.getString(_cursorIndexOfType);
              final String _tmpUrl;
              _tmpUrl = cursor.getString(_cursorIndexOfUrl);
              final String _tmpEmbed_url;
              _tmpEmbed_url = cursor.getString(_cursorIndexOfEmbedUrl);
              final String _tmpTitle;
              _tmpTitle = cursor.getString(_cursorIndexOfTitle);
              _item = new WishGiph(_tmpId,_tmpType,_tmpUrl,_tmpEmbed_url,_tmpTitle);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }
}
