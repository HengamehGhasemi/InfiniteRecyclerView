package com.testProject.giphy.Dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\'J\b\u0010\u0006\u001a\u00020\u0007H\'J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\'J\u0018\u0010\n\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/testProject/giphy/Dao/GiphDao;", "", "GetAllGiphs", "Landroidx/paging/DataSource$Factory;", "", "Lcom/testProject/giphy/entity/Giph;", "deleteAll", "", "insert", "giph", "insertAll", "posts", "", "app_release"})
public abstract interface GiphDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM  giph_table")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.testProject.giphy.entity.Giph> GetAllGiphs();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.Nullable()
    java.util.List<com.testProject.giphy.entity.Giph> posts);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.Nullable()
    com.testProject.giphy.entity.Giph giph);
    
    @androidx.room.Query(value = "DELETE  FROM giph_table")
    public abstract void deleteAll();
}