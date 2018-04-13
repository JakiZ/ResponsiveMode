package com.mvp.jaki.responsivemode.base;

import android.app.Fragment;
import android.os.Bundle;

/**
 * presenter的生命周期管理接口，兼顾activity 和 fragment
 * Created by jaki on 2018/4/13.
 */

public interface Presenter<V extends BaseView>{
    /**
     * presenter绑定view
     * @param view                  要绑定的师徒
     * @param savedInstanceState    缓存的数据
     */
    void onPresenterAttachView(V view, Bundle savedInstanceState);

    void onPresenterCreate();

    void onPresenterRestart();

    void onPresenterStart();

    void onPresenterResume();

    void onPresenterPause();

    void onRresenterStop();

    void onPresenterDetachView(boolean retainInstance);

    void onPresenterDestory();

    void onPresenterSaveInstanceState(Bundle savedInstanceState);

}
