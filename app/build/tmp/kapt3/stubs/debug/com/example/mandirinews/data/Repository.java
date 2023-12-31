package com.example.mandirinews.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/mandirinews/data/Repository;", "Lcom/example/mandirinews/data/DataSource;", "remoteDataSource", "Lcom/example/mandirinews/data/remote/RemoteDataSource;", "(Lcom/example/mandirinews/data/remote/RemoteDataSource;)V", "getAllNews", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/mandirinews/data/local/NewsEntity;", "getHeadlineNews", "Companion", "app_debug"})
public final class Repository implements com.example.mandirinews.data.DataSource {
    private final com.example.mandirinews.data.remote.RemoteDataSource remoteDataSource = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.mandirinews.data.Repository.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.example.mandirinews.data.Repository instance;
    
    public Repository(@org.jetbrains.annotations.NotNull
    com.example.mandirinews.data.remote.RemoteDataSource remoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<java.util.List<com.example.mandirinews.data.local.NewsEntity>> getHeadlineNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<java.util.List<com.example.mandirinews.data.local.NewsEntity>> getAllNews() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/mandirinews/data/Repository$Companion;", "", "()V", "instance", "Lcom/example/mandirinews/data/Repository;", "getInstance", "remoteData", "Lcom/example/mandirinews/data/remote/RemoteDataSource;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.mandirinews.data.Repository getInstance(@org.jetbrains.annotations.NotNull
        com.example.mandirinews.data.remote.RemoteDataSource remoteData) {
            return null;
        }
    }
}