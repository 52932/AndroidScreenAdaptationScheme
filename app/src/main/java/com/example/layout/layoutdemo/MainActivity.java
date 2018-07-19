package com.example.layout.layoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
