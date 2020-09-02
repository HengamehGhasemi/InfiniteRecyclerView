package com.testProject.giphy.Db;

import java.lang.System;

@androidx.room.Database(entities = {com.testProject.giphy.entity.Giph.class, com.testProject.giphy.entity.WishGiph.class}, version = 2, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/testProject/giphy/Db/GiphDb;", "Landroidx/room/RoomDatabase;", "()V", "gapeDado", "Lcom/testProject/giphy/Dao/GiphDao;", "wishDado", "Lcom/testProject/giphy/Dao/WishListDao;", "Companion", "app_release"})
public abstract class GiphDb extends androidx.room.RoomDatabase {
    private static com.testProject.giphy.Db.GiphDb instance;
    public static final com.testProject.giphy.Db.GiphDb.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.testProject.giphy.Dao.WishListDao wishDado();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.testProject.giphy.Dao.GiphDao gapeDado();
    
    public GiphDb() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/testProject/giphy/Db/GiphDb$Companion;", "", "()V", "instance", "Lcom/testProject/giphy/Db/GiphDb;", "get", "context", "Landroid/content/Context;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final synchronized com.testProject.giphy.Db.GiphDb get(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}