package com.testProject.giphy.BoundaryCallbacks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/testProject/giphy/BoundaryCallbacks/GiphBoundaryCallback;", "Landroidx/paging/PagedList$BoundaryCallback;", "Lcom/testProject/giphy/entity/Giph;", "giphDao", "Lcom/testProject/giphy/Dao/GiphDao;", "getAllGiphsViewModel", "Lcom/testProject/giphy/viewModels/GetAllGiphsViewModel;", "(Lcom/testProject/giphy/Dao/GiphDao;Lcom/testProject/giphy/viewModels/GetAllGiphsViewModel;)V", "getGetAllGiphsViewModel", "()Lcom/testProject/giphy/viewModels/GetAllGiphsViewModel;", "offset", "", "getOffset", "()I", "setOffset", "(I)V", "onItemAtEndLoaded", "", "itemAtEnd", "onItemAtFrontLoaded", "itemAtFront", "onZeroItemsLoaded", "app_debug"})
public final class GiphBoundaryCallback extends androidx.paging.PagedList.BoundaryCallback<com.testProject.giphy.entity.Giph> {
    private int offset = 0;
    private final com.testProject.giphy.Dao.GiphDao giphDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.testProject.giphy.viewModels.GetAllGiphsViewModel getAllGiphsViewModel = null;
    
    public final int getOffset() {
        return 0;
    }
    
    public final void setOffset(int p0) {
    }
    
    @java.lang.Override()
    public void onZeroItemsLoaded() {
    }
    
    @java.lang.Override()
    public void onItemAtFrontLoaded(@org.jetbrains.annotations.NotNull()
    com.testProject.giphy.entity.Giph itemAtFront) {
    }
    
    @java.lang.Override()
    public void onItemAtEndLoaded(@org.jetbrains.annotations.NotNull()
    com.testProject.giphy.entity.Giph itemAtEnd) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.testProject.giphy.viewModels.GetAllGiphsViewModel getGetAllGiphsViewModel() {
        return null;
    }
    
    public GiphBoundaryCallback(@org.jetbrains.annotations.Nullable()
    com.testProject.giphy.Dao.GiphDao giphDao, @org.jetbrains.annotations.NotNull()
    com.testProject.giphy.viewModels.GetAllGiphsViewModel getAllGiphsViewModel) {
        super();
    }
}