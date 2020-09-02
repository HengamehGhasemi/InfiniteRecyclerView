package com.testProject.giphy.Db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.testProject.giphy.Dao.GiphDao;
import com.testProject.giphy.Dao.GiphDao_Impl;
import com.testProject.giphy.Dao.WishListDao;
import com.testProject.giphy.Dao.WishListDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GiphDb_Impl extends GiphDb {
  private volatile WishListDao _wishListDao;

  private volatile GiphDao _giphDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `giph_table` (`type` TEXT, `url` TEXT, `embed_url` TEXT, `title` TEXT, `id` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `wish` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `url` TEXT NOT NULL, `embed_url` TEXT NOT NULL, `title` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fd760fdc99d090b2db24cc0f38ab3495')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `giph_table`");
        _db.execSQL("DROP TABLE IF EXISTS `wish`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
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
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsGiphTable = new HashMap<String, TableInfo.Column>(5);
        _columnsGiphTable.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGiphTable.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGiphTable.put("embed_url", new TableInfo.Column("embed_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGiphTable.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGiphTable.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGiphTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGiphTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGiphTable = new TableInfo("giph_table", _columnsGiphTable, _foreignKeysGiphTable, _indicesGiphTable);
        final TableInfo _existingGiphTable = TableInfo.read(_db, "giph_table");
        if (! _infoGiphTable.equals(_existingGiphTable)) {
          return new RoomOpenHelper.ValidationResult(false, "giph_table(com.testProject.giphy.entity.Giph).\n"
                  + " Expected:\n" + _infoGiphTable + "\n"
                  + " Found:\n" + _existingGiphTable);
        }
        final HashMap<String, TableInfo.Column> _columnsWish = new HashMap<String, TableInfo.Column>(5);
        _columnsWish.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWish.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWish.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWish.put("embed_url", new TableInfo.Column("embed_url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWish.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWish = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWish = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWish = new TableInfo("wish", _columnsWish, _foreignKeysWish, _indicesWish);
        final TableInfo _existingWish = TableInfo.read(_db, "wish");
        if (! _infoWish.equals(_existingWish)) {
          return new RoomOpenHelper.ValidationResult(false, "wish(com.testProject.giphy.entity.WishGiph).\n"
                  + " Expected:\n" + _infoWish + "\n"
                  + " Found:\n" + _existingWish);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "fd760fdc99d090b2db24cc0f38ab3495", "52c29ef6da9ab8ab4718d955d79c1c5d");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "giph_table","wish");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `giph_table`");
      _db.execSQL("DELETE FROM `wish`");
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
  public WishListDao wishDado() {
    if (_wishListDao != null) {
      return _wishListDao;
    } else {
      synchronized(this) {
        if(_wishListDao == null) {
          _wishListDao = new WishListDao_Impl(this);
        }
        return _wishListDao;
      }
    }
  }

  @Override
  public GiphDao gapeDado() {
    if (_giphDao != null) {
      return _giphDao;
    } else {
      synchronized(this) {
        if(_giphDao == null) {
          _giphDao = new GiphDao_Impl(this);
        }
        return _giphDao;
      }
    }
  }
}
