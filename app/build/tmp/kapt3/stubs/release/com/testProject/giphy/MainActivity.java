package com.testProject.giphy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016J\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006%"}, d2 = {"Lcom/testProject/giphy/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/testProject/giphy/adapters/GiphsRecyclerAdapter;", "myViewModel", "Lcom/testProject/giphy/viewModels/GetAllGiphsViewModel;", "getMyViewModel", "()Lcom/testProject/giphy/viewModels/GetAllGiphsViewModel;", "myViewModel$delegate", "Lkotlin/Lazy;", "searchString", "", "getSearchString", "()Ljava/lang/String;", "setSearchString", "(Ljava/lang/String;)V", "wishViewModel", "Lcom/testProject/giphy/viewModels/WishListViewModel;", "getWishViewModel", "()Lcom/testProject/giphy/viewModels/WishListViewModel;", "wishViewModel$delegate", "dismissKeyboard", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "toast", "context", "Landroid/content/Context;", "app_release"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.testProject.giphy.adapters.GiphsRecyclerAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy myViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy wishViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String searchString;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.testProject.giphy.viewModels.GetAllGiphsViewModel getMyViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.testProject.giphy.viewModels.WishListViewModel getWishViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSearchString() {
        return null;
    }
    
    public final void setSearchString(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void dismissKeyboard() {
    }
    
    public final void toast(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public MainActivity() {
        super();
    }
}