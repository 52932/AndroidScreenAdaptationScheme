package com.example.layout.layoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.layout.layoutdemo.utils.IntentServerDemo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = new Intent(MainActivity.this, IntentServerDemo.class);
//        intent.putExtra("action","TASK1");
//// 开启第一个服务
//        startService(intent);
//        intent.putExtra("action","TASK2");
//// 开启第二个服务
//        startService(intent);
//        intent.putExtra("action","TASK3");
//// 开启第三个服务
//        startService(intent);
    }

    public void clic1(View view){
        Intent intent=new Intent(MainActivity.this,PageActivity.class);
        startActivity(intent);
    }

    public void clic2(View view){
        Intent intent=new Intent(MainActivity.this,PageActivity.class);
        startActivity(intent);
    }
}
