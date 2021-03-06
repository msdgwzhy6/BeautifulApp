package com.jogger.beautifulapp.function.presenter;

import com.jogger.beautifulapp.base.BasePresenter;
import com.jogger.beautifulapp.entity.AppCategoryData;
import com.jogger.beautifulapp.function.contract.CategoryContract;
import com.jogger.beautifulapp.function.model.CategoryModel;
import com.jogger.beautifulapp.http.listener.OnHttpRequestListener;

/**
 * Created by Jogger on 2018/6/17.
 */

public class CategoryPresenter extends BasePresenter<CategoryContract.View, CategoryContract
        .Model> implements CategoryContract.Presenter {

    @Override
    public CategoryContract.Model attachModel() {
        return new CategoryModel();
    }

    @Override
    public void getCategoryDatas() {
        mModle.getCategoryDatas(new OnHttpRequestListener<AppCategoryData>() {
            @Override
            public void onFailure(int errorCode) {

            }

            @Override
            public void onSuccess(AppCategoryData appCategoryData) {
                if (mView == null) return;
                mView.getCategoryDatasSuccess(appCategoryData);
            }
        });
    }
}
