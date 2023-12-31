package com.example.mandirinews.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/mandirinews/ui/viewmodel/AllNewsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/mandirinews/data/Repository;", "(Lcom/example/mandirinews/data/Repository;)V", "getAllNews", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/mandirinews/data/local/NewsEntity;", "app_debug"})
public final class AllNewsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.mandirinews.data.Repository repository = null;
    
    public AllNewsViewModel(@org.jetbrains.annotations.NotNull
    com.example.mandirinews.data.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mandirinews.data.local.NewsEntity>> getAllNews() {
        return null;
    }
}