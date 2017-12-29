package com.wyj.cn.whiteboarddemo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.yinghe.whiteboardlib.ui.WhiteBoardFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private WhiteBoardFragment whiteBoardFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //6.0读写权限
        if (Build.VERSION.SDK_INT >= 23) {
            String[] permissions = {

                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_EXTERNAL_STORAGE

            };
            ActivityCompat.requestPermissions(this,permissions,123);

            if (checkSelfPermission(permissions[0]) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(permissions, 0);

            }
        }

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

    @Override   //其中123是requestcode，可以根据这个code判断，用户是否同意了授权。
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.e("tag","requestCode****"+requestCode);
    }


}
