package com.example.mandirinews.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0016\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/mandirinews/ui/adapter/AllNewsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/mandirinews/ui/adapter/AllNewsAdapter$ViewHolder;", "()V", "newsEntity", "Ljava/util/ArrayList;", "Lcom/example/mandirinews/data/local/NewsEntity;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "data", "", "ViewHolder", "app_debug"})
public final class AllNewsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.mandirinews.ui.adapter.AllNewsAdapter.ViewHolder> {
    private final java.util.ArrayList<com.example.mandirinews.data.local.NewsEntity> newsEntity = null;
    
    public AllNewsAdapter() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.mandirinews.data.local.NewsEntity> data) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.mandirinews.ui.adapter.AllNewsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.mandirinews.ui.adapter.AllNewsAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/mandirinews/ui/adapter/AllNewsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/mandirinews/databinding/ListAllNewsBinding;", "(Lcom/example/mandirinews/ui/adapter/AllNewsAdapter;Lcom/example/mandirinews/databinding/ListAllNewsBinding;)V", "context", "Landroid/content/Context;", "bind", "", "data", "Lcom/example/mandirinews/data/local/NewsEntity;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.mandirinews.databinding.ListAllNewsBinding binding = null;
        private final android.content.Context context = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.example.mandirinews.databinding.ListAllNewsBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.mandirinews.data.local.NewsEntity data) {
        }
    }
}