package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class userpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userpage);

    }

    public void resultpref(View v){
        Intent intent = new Intent(getApplicationContext(), resultprefselect.class);
        startActivity(intent);
    }

    public void my_s_p(View v){
        Intent intent = new Intent(getApplicationContext(), my_s_read.class);
        startActivity(intent);
        }

}
