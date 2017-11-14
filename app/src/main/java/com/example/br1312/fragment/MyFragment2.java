package com.example.br1312.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by BR1312 on 2017/10/16.
 */

public class MyFragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       //加载布局得到View对象并返回

        //创建一个视图对象， 设置数据并返回
        TextView textView = new TextView(getActivity());
        textView.setText("Fragment2222");
        textView.setBackgroundColor(Color.BLUE);

        return textView;
    }
}
