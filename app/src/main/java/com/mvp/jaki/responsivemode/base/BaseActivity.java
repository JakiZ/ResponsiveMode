package com.mvp.jaki.responsivemode.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Activity基类
 * Created by jaki on 2018/4/13.
 */

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements BaseView {
    protected final String TAG = this.getClass().getSimpleName();
    protected P mPresenter;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPresenter = initPresenter();
        if (mPresenter == null){
            throw new NullPointerException("you need keep the presenter is not null in class " +TAG);
        }
        if (mPresenter != null){
            mPresenter.onPresenterAttachView(this,savedInstanceState);
            mPresenter.onPresenterCreate();
        }


        initView();
        initLocalData();
        initNetData();
        initListener();

    }

    /**
     * 初始化presenter
     * @return
     */
    protected  abstract  P initPresenter();

    /**
     * 初始化组件
     * 使用butterknife等控件，可以不写这个方法
     */
    protected abstract void initView();

    /**
     * 初始化本地数据
     */
    protected abstract void initLocalData();

    /**
     * 初始化网络数据
     */
    protected abstract void initNetData();

    /**
     * 初始化监听器
     */
    protected abstract void initListener();

    @Override
    protected void onRestart() {
        super.onRestart();
        if (mPresenter != null){
            mPresenter.onPresenterRestart();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mPresenter != null){
            mPresenter.onPresenterStart();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mPresenter != null){
            mPresenter.onPresenterResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mPresenter != null){
            mPresenter.onPresenterPause();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mPresenter != null){
            mPresenter.onRresenterStop();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null){
            mPresenter.onPresenterDetachView(true);
            mPresenter.onPresenterDestory();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mPresenter != null){
            mPresenter.onPresenterSaveInstanceState(outState);
        }
    }
}
