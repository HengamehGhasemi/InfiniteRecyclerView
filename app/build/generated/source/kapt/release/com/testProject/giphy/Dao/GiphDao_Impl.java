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
import com.testProject.giphy.entity.Giph;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GiphDao_Impl implements GiphDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Giph> __insertionAdapterOfGiph;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public GiphDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGiph = new EntityInsertionAdapter<Giph>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `giph_table` (`type`,`url`,`embed_url`,`title`,`id`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Giph value) {
        if (value.getType() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getType());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
        if (value.getEmbed_url() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmbed_url());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
        if (value.getId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE  FROM giph_table";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final List<Giph> posts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfGiph.insert(posts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final Giph giph) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfGiph.insert(giph);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
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
  public DataSource.Factory<Integer, Giph> GetAllGiphs() {
    final String _sql = "SELECT `giph_table`.`type` AS `type`, `giph_table`.`url` AS `url`, `giph_table`.`embed_url` AS `embed_url`, `giph_table`.`title` AS `title`, `giph_table`.`id` AS `id` FROM  giph_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, Giph>() {
      @Override
      public LimitOffsetDataSource<Giph> create() {
        return new LimitOffsetDataSource<Giph>(__db, _statement, false , "giph_table") {
          @Override
          protected List<Giph> convertRows(Cursor cursor) {
            final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(cursor, "type");
            final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(cursor, "url");
            final int _cursorIndexOfEmbedUrl = CursorUtil.getColumnIndexOrThrow(cursor, "embed_url");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(cursor, "title");
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final List<Giph> _res = new ArrayList<Giph>(cursor.getCount());
            while(cursor.moveToNext()) {
              final Giph _item;
              final String _tmpType;
              _tmpType = cursor.getString(_cursorIndexOfType);
              final String _tmpUrl;
              _tmpUrl = cursor.getString(_cursorIndexOfUrl);
              final String _tmpEmbed_url;
              _tmpEmbed_url = cursor.getString(_cursorIndexOfEmbedUrl);
              final String _tmpTitle;
              _tmpTitle = cursor.getString(_cursorIndexOfTitle);
              final String _tmpId;
              _tmpId = cursor.getString(_cursorIndexOfId);
              _item = new Giph(_tmpType,_tmpUrl,_tmpEmbed_url,_tmpTitle,_tmpId);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }
}
