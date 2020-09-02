package com.testProject.giphy.Dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\'J\b\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\'J\u0016\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\'\u00a8\u0006\u0010"}, d2 = {"Lcom/testProject/giphy/Dao/WishListDao;", "", "GetAllGiphs", "Landroidx/paging/DataSource$Factory;", "", "Lcom/testProject/giphy/entity/WishGiph;", "deleteAll", "", "deleteById", "Id", "", "insert", "wishGiph", "insertAll", "posts", "", "app_debug"})
public abstract interface WishListDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM  wish")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.testProject.giphy.entity.WishGiph> GetAllGiphs();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.testProject.giphy.entity.WishGiph> posts);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.testProject.giphy.entity.WishGiph wishGiph);
    
    @androidx.room.Query(value = "DELETE FROM wish WHERE id = :Id")
    public abstract void deleteById(@org.jetbrains.annotations.NotNull()
    java.lang.String Id);
    
    @androidx.room.Query(value = "DELETE FROM wish")
    public abstract void deleteAll();
}