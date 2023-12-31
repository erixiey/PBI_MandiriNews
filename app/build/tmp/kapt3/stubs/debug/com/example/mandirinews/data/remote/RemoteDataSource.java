package com.example.mandirinews.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0003\t\n\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b\u00a8\u0006\f"}, d2 = {"Lcom/example/mandirinews/data/remote/RemoteDataSource;", "", "()V", "getAllNews", "", "callback", "Lcom/example/mandirinews/data/remote/RemoteDataSource$LoadAllNews;", "getHeadlineNews", "Lcom/example/mandirinews/data/remote/RemoteDataSource$LoadHeadlineNews;", "Companion", "LoadAllNews", "LoadHeadlineNews", "app_debug"})
public final class RemoteDataSource {
    @org.jetbrains.annotations.NotNull
    public static final com.example.mandirinews.data.remote.RemoteDataSource.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.example.mandirinews.data.remote.RemoteDataSource instance;
    
    public RemoteDataSource() {
        super();
    }
    
    public final void getHeadlineNews(@org.jetbrains.annotations.NotNull
    com.example.mandirinews.data.remote.RemoteDataSource.LoadHeadlineNews callback) {
    }
    
    public final void getAllNews(@org.jetbrains.annotations.NotNull
    com.example.mandirinews.data.remote.RemoteDataSource.LoadAllNews callback) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/mandirinews/data/remote/RemoteDataSource$LoadHeadlineNews;", "", "onHeadlineNews", "", "newsResponse", "", "Lcom/example/mandirinews/data/response/NewsResponse;", "app_debug"})
    public static abstract interface LoadHeadlineNews {
        
        public abstract void onHeadlineNews(@org.jetbrains.annotations.NotNull
        java.util.List<com.example.mandirinews.data.response.NewsResponse> newsResponse);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/mandirinews/data/remote/RemoteDataSource$LoadAllNews;", "", "onAllNews", "", "newsResponse", "", "Lcom/example/mandirinews/data/response/NewsResponse;", "app_debug"})
    public static abstract interface LoadAllNews {
        
        public abstract void onAllNews(@org.jetbrains.annotations.NotNull
        java.util.List<com.example.mandirinews.data.response.NewsResponse> newsResponse);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/mandirinews/data/remote/RemoteDataSource$Companion;", "", "()V", "instance", "Lcom/example/mandirinews/data/remote/RemoteDataSource;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.mandirinews.data.remote.RemoteDataSource getInstance() {
            return null;
        }
    }
}