package com.mvp.jaki.responsivemode.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.mvp.jaki.responsivemode.base.BaseActivity;
import com.mvp.jaki.responsivemode.base.BasePresenter;
import com.mvp.jaki.responsivemode.base.BaseResponse;
import com.mvp.jaki.responsivemode.bean.UserBean;
import com.mvp.jaki.responsivemode.net.NetApi;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * Created by jaki on 2018/4/13.
 */

public class MainActivity extends BaseActivity {
    @Override
    protected BasePresenter initPresenter() {
        return new BasePresenter();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initLocalData() {

    }

    @Override
    protected void initNetData() {
        // https://www.apiopen.top/login?key=00d91e8e0cca2b76f515926a36db68f5&phone=13594347817&passwd=123456
        NetApi.login("00d91e8e0cca2b76f515926a36db68f5", "13594347817", "123456", new Observer<BaseResponse<UserBean>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                e("d = " +d + ",d.isDisposed = " +d.isDisposed());
            }

            @Override
            public void onNext(@NonNull BaseResponse<UserBean> userBeanBaseResponse) {
                e("userResponse = " +userBeanBaseResponse);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                e("e = " +e.getMessage());
            }

            @Override
            public void onComplete() {
                e("onComplete");
            }
        });
    }

    @Override
    protected void initListener() {

    }

    public void e(String content){
        Log.e(TAG,content);
    }
}
