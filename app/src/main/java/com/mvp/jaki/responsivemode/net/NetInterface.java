package com.mvp.jaki.responsivemode.net;

import com.mvp.jaki.responsivemode.base.BaseResponse;
import com.mvp.jaki.responsivemode.bean.UserBean;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 网络请求接口
 * Created by jaki on 2018/4/13.
 */

public class NetInterface {

    // https://www.apiopen.top/login?key=00d91e8e0cca2b76f515926a36db68f5&phone=13594347817&passwd=123456
    public interface LoginApi{
        @GET("login")
        Observable<BaseResponse<UserBean>> login(@Query("key") String key, @Query("phone") String phone, @Query("passwd") String passwd);
    }
}
