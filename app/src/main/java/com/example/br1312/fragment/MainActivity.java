package com.example.br1312.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {
    /**
     * 1.定义Fragment的子类 并加载一个布局文件
     * 2.在布局文件中通过<fragment>指定自定义Fragment
     * 3.我们的Activity必须继承于FragmentActivity
     *
     *  Fragment本质上都会生成一个FrameLayout 它加载的布局为其子布局
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ahahhhahahhahaahhaahh  EEE

    }
}
