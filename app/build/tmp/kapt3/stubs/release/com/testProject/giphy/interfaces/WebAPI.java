package com.testProject.giphy.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001JG\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010\u000bJ_\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/testProject/giphy/interfaces/WebAPI;", "", "getAllGiphs", "Lretrofit2/Call;", "Lcom/testProject/giphy/modals/ServerResponse;", "api_key", "", "limit", "", "offset", "rating", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lretrofit2/Call;", "serach", "q", "lang", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;", "app_release"})
public abstract interface WebAPI {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "http://api.giphy.com/v1/gifs/trending")
    public abstract retrofit2.Call<com.testProject.giphy.modals.ServerResponse> getAllGiphs(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "limit")
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "offset")
    java.lang.Integer offset, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "rating")
    java.lang.String rating);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "http://api.giphy.com/v1/gifs/search")
    public abstract retrofit2.Call<com.testProject.giphy.modals.ServerResponse> serach(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "limit")
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "offset")
    java.lang.Integer offset, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "rating")
    java.lang.String rating, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "q")
    java.lang.String q, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "lang")
    java.lang.String lang);
}