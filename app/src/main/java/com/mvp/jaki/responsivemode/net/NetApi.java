package com.mvp.jaki.responsivemode.net;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.mvp.jaki.responsivemode.base.BaseResponse;
import com.mvp.jaki.responsivemode.bean.UserBean;
import io.reactivex.Observer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 网络请求接口
 * Created by jaki on 2018/4/13.
 */

public class NetApi  {
    private static final String URL_BASE = "https://www.apiopen.top/";
    private static Gson mGson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss SSS").serializeNulls().create();
    private static Retrofit mRetrofit = new Retrofit.Builder()
            .baseUrl(URL_BASE)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(mGson))
            .build();

    /**
     * 登录
     * @param key
     * @param phone
     * @param passwd
     * @param callback
     */
    public static void login(String key,String phone,String passwd,Observer<BaseResponse<UserBean>> callback){
        NetInterface.LoginApi loginApi = mRetrofit.create(NetInterface.LoginApi.class);
        loginApi.login(key, phone, passwd)
                .subscribeOn(Schedulers.io())
                .subscribe(callback);
    }
}
