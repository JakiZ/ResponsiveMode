package com.mvp.jaki.responsivemode.base;

import android.os.Bundle;

import java.lang.ref.WeakReference;

/**
 * 表示器基类
 * Created by jaki on 2018/4/13.
 */

public class BasePresenter<V extends BaseView> implements Presenter{
    private WeakReference<V> viewRef;

    protected V getView(){
        if (isViewAttached()){
            return viewRef.get();
        }else {
            return null;
        }

    }

    protected boolean isViewAttached(){
        return viewRef != null && viewRef.get() != null;
    }

    @Override
    public void onPresenterAttachView(BaseView view, Bundle savedInstanceState) {
        if (!isViewAttached()){
            viewRef = new WeakReference<V>((V)view);
        }
    }

    @Override
    public void onPresenterCreate() {

    }

    @Override
    public void onPresenterRestart() {

    }

    @Override
    public void onPresenterStart() {

    }

    @Override
    public void onPresenterResume() {

    }

    @Override
    public void onPresenterPause() {

    }

    @Override
    public void onRresenterStop() {

    }

    @Override
    public void onPresenterDetachView(boolean retainInstance) {
        if (viewRef != null){
            viewRef.clear();
            viewRef = null;
        }

    }

    @Override
    public void onPresenterDestory() {

    }

    @Override
    public void onPresenterSaveInstanceState(Bundle savedInstanceState) {

    }
}
