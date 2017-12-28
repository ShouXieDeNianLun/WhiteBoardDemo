package com.wyj.cn.whiteboarddemo;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yinghe.whiteboardlib.fragment.WhiteBoardFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private WhiteBoardFragment whiteBoardFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();
    }
    private void initview() {

        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        //获取WhiteBoardFragment实例
        whiteBoardFragment = WhiteBoardFragment.newInstance();
        transaction.add(R.id.controlLayout, whiteBoardFragment,"wb").commit();


    }


    @Override
    public void onClick(View v) {

    }
}
