package com.testProject.giphy.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010&\u001a\u00020\'J\u0010\u0010(\u001a\u00020\'2\b\u0010)\u001a\u0004\u0018\u00010\u0014J\u0016\u0010*\u001a\u00020\'2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010+R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140!\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006,"}, d2 = {"Lcom/testProject/giphy/viewModels/GetAllGiphsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "callback", "Lcom/testProject/giphy/BoundaryCallbacks/GiphBoundaryCallback;", "getCallback", "()Lcom/testProject/giphy/BoundaryCallbacks/GiphBoundaryCallback;", "setCallback", "(Lcom/testProject/giphy/BoundaryCallbacks/GiphBoundaryCallback;)V", "config", "Landroidx/paging/PagedList$Config;", "getConfig", "()Landroidx/paging/PagedList$Config;", "setConfig", "(Landroidx/paging/PagedList$Config;)V", "factory", "Landroidx/paging/DataSource$Factory;", "", "Lcom/testProject/giphy/entity/Giph;", "getFactory", "()Landroidx/paging/DataSource$Factory;", "setFactory", "(Landroidx/paging/DataSource$Factory;)V", "giphDao", "Lcom/testProject/giphy/Dao/GiphDao;", "getGiphDao", "()Lcom/testProject/giphy/Dao/GiphDao;", "setGiphDao", "(Lcom/testProject/giphy/Dao/GiphDao;)V", "giphyes", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "getGiphyes", "()Landroidx/lifecycle/LiveData;", "setGiphyes", "(Landroidx/lifecycle/LiveData;)V", "DeletAllData", "", "insertAData", "giphs", "insertData", "", "app_debug"})
public final class GetAllGiphsViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.Nullable()
    private com.testProject.giphy.Dao.GiphDao giphDao;
    @org.jetbrains.annotations.Nullable()
    private com.testProject.giphy.BoundaryCallbacks.GiphBoundaryCallback callback;
    @org.jetbrains.annotations.Nullable()
    private androidx.paging.DataSource.Factory<java.lang.Integer, com.testProject.giphy.entity.Giph> factory;
    @org.jetbrains.annotations.Nullable()
    private androidx.paging.PagedList.Config config;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<androidx.paging.PagedList<com.testProject.giphy.entity.Giph>> giphyes;
    
    @org.jetbrains.annotations.Nullable()
    public final com.testProject.giphy.Dao.GiphDao getGiphDao() {
        return null;
    }
    
    public final void setGiphDao(@org.jetbrains.annotations.Nullable()
    com.testProject.giphy.Dao.GiphDao p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.testProject.giphy.BoundaryCallbacks.GiphBoundaryCallback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    com.testProject.giphy.BoundaryCallbacks.GiphBoundaryCallback p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.paging.DataSource.Factory<java.lang.Integer, com.testProject.giphy.entity.Giph> getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.Nullable()
    androidx.paging.DataSource.Factory<java.lang.Integer, com.testProject.giphy.entity.Giph> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.paging.PagedList.Config getConfig() {
        return null;
    }
    
    public final void setConfig(@org.jetbrains.annotations.Nullable()
    androidx.paging.PagedList.Config p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.testProject.giphy.entity.Giph>> getGiphyes() {
        return null;
    }
    
    public final void setGiphyes(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<androidx.paging.PagedList<com.testProject.giphy.entity.Giph>> p0) {
    }
    
    public final void insertData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.testProject.giphy.entity.Giph> giphs) {
    }
    
    public final void insertAData(@org.jetbrains.annotations.Nullable()
    com.testProject.giphy.entity.Giph giphs) {
    }
    
    public final void DeletAllData() {
    }
    
    public GetAllGiphsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}