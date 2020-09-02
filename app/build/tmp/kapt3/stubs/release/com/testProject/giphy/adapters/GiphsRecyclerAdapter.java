package com.testProject.giphy.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/testProject/giphy/adapters/GiphsRecyclerAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/testProject/giphy/entity/Giph;", "Lcom/testProject/giphy/viewHolders/GiphViewHolder;", "()V", "onItemLongClickListener", "Lcom/testProject/giphy/adapters/GiphsRecyclerAdapter$OnItemLongClickListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemLongClickListener", "itemLongClickListener", "Companion", "OnItemLongClickListener", "app_release"})
public final class GiphsRecyclerAdapter extends androidx.paging.PagedListAdapter<com.testProject.giphy.entity.Giph, com.testProject.giphy.viewHolders.GiphViewHolder> {
    private com.testProject.giphy.adapters.GiphsRecyclerAdapter.OnItemLongClickListener onItemLongClickListener;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.testProject.giphy.entity.Giph> diffCallback = null;
    public static final com.testProject.giphy.adapters.GiphsRecyclerAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.testProject.giphy.viewHolders.GiphViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.testProject.giphy.viewHolders.GiphViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void setOnItemLongClickListener(@org.jetbrains.annotations.Nullable()
    com.testProject.giphy.adapters.GiphsRecyclerAdapter.OnItemLongClickListener itemLongClickListener) {
    }
    
    public GiphsRecyclerAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/testProject/giphy/adapters/GiphsRecyclerAdapter$OnItemLongClickListener;", "", "onItemLongClicked", "", "giph", "Lcom/testProject/giphy/entity/Giph;", "position", "", "app_release"})
    public static abstract interface OnItemLongClickListener {
        
        public abstract void onItemLongClicked(@org.jetbrains.annotations.Nullable()
        com.testProject.giphy.entity.Giph giph, int position);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/testProject/giphy/adapters/GiphsRecyclerAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/testProject/giphy/entity/Giph;", "getDiffCallback", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.testProject.giphy.entity.Giph> getDiffCallback() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}