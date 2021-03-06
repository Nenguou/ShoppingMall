package com.learnandroid.shoppingmall.type.fragment;


import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.learnandroid.shoppingmall.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class TypeFragment extends BaseFragment {

    private static final String TAG = TypeFragment.class.getSimpleName();
    private TextView textView;

    public TypeFragment() {

    }

    @Override
    public View initView() {
        Log.d(TAG, "分类视图被初始化了");
        textView = new TextView(mContext);
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(25);
        textView.setGravity(Gravity.CENTER);
        return textView;
    }


    @Override
    public void initData() {
        super.initData();
        Log.d(TAG, "分类页面数据被初始化了");
        textView.setText("分类");
    }
}
