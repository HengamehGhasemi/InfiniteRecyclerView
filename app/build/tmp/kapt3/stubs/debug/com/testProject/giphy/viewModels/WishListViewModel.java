package com.testProject.giphy.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010#\u001a\u00020!J\u0010\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010&\u001a\u00020!2\u000e\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010(R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006)"}, d2 = {"Lcom/testProject/giphy/viewModels/WishListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "config", "Landroidx/paging/PagedList$Config;", "getConfig", "()Landroidx/paging/PagedList$Config;", "setConfig", "(Landroidx/paging/PagedList$Config;)V", "factory", "Landroidx/paging/DataSource$Factory;", "", "Lcom/testProject/giphy/entity/WishGiph;", "getFactory", "()Landroidx/paging/DataSource$Factory;", "setFactory", "(Landroidx/paging/DataSource$Factory;)V", "wishList", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "getWishList", "()Landroidx/lifecycle/LiveData;", "setWishList", "(Landroidx/lifecycle/LiveData;)V", "wishListDao", "Lcom/testProject/giphy/Dao/WishListDao;", "getWishListDao", "()Lcom/testProject/giphy/Dao/WishListDao;", "setWishListDao", "(Lcom/testProject/giphy/Dao/WishListDao;)V", "DeletAData", "", "giph", "DeletData", "insertAData", "giphs", "insertData", "wishGips", "", "app_debug"})
public final class WishListViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.Nullable()
    private com.testProject.giphy.Dao.WishListDao wishListDao;
    @org.jetbrains.annotations.Nullable()
    private androidx.paging.DataSource.Factory<java.lang.Integer, com.testProject.giphy.entity.WishGiph> factory;
    @org.jetbrains.annotations.Nullable()
    private androidx.paging.PagedList.Config config;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<androidx.paging.PagedList<com.testProject.giphy.entity.WishGiph>> wishList;
    
    @org.jetbrains.annotations.Nullable()
    public final com.testProject.giphy.Dao.WishListDao getWishListDao() {
        return null;
    }
    
    public final void setWishListDao(@org.jetbrains.annotations.Nullable()
    com.testProject.giphy.Dao.WishListDao p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.paging.DataSource.Factory<java.lang.Integer, com.testProject.giphy.entity.WishGiph> getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.Nullable()
    androidx.paging.DataSource.Factory<java.lang.Integer, com.testProject.giphy.entity.WishGiph> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.paging.PagedList.Config getConfig() {
        return null;
    }
    
    public final void setConfig(@org.jetbrains.annotations.Nullable()
    androidx.paging.PagedList.Config p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.testProject.giphy.entity.WishGiph>> getWishList() {
        return null;
    }
    
    public final void setWishList(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<androidx.paging.PagedList<com.testProject.giphy.entity.WishGiph>> p0) {
    }
    
    public final void insertData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.testProject.giphy.entity.WishGiph> wishGips) {
    }
    
    public final void insertAData(@org.jetbrains.annotations.Nullable()
    com.testProject.giphy.entity.WishGiph giphs) {
    }
    
    public final void DeletData() {
    }
    
    public final void DeletAData(@org.jetbrains.annotations.Nullable()
    com.testProject.giphy.entity.WishGiph giph) {
    }
    
    public WishListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}