package com.utouu.cc.fixbugtest;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private TestApplication mApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                //添加新补丁文件接口
                mApplication = (TestApplication) getApplication();
                File patch = new File(Environment.getExternalStorageDirectory(),"patch.jar");
                Log.d("file", patch.exists() + "");
                mApplication.mFixBugManage.addPatch(patch.getAbsolutePath());
            }
        });

        findViewById(R.id.btn_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //修复这里的bug
//                Toast.makeText(MainActivity.this,"...bug...",Toast.LENGTH_SHORT).show();

                //修复
                Toast.makeText(MainActivity.this,"...fix...bug...",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mApplication.mFixBugManage.removeAllPatch();
    }
}
