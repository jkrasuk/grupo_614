package com.jk.sismos.main.data.remote;

import androidx.annotation.NonNull;

import com.jk.sismos.main.data.model.user.UserPost;

import okhttp3.ResponseBody;

public interface RequestCallbacks {
    void onSuccess(@NonNull UserPost value);

    void onError(@NonNull Throwable throwable);

    void onErrorBody(@NonNull ResponseBody errorBody);
}
