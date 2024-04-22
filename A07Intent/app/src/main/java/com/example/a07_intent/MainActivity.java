package com.example.a07_intent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// ver01 simplest intent, just goes to 2nd
// https://www.vogella.com/tutorials/AndroidIntent/article.html Also Chapter 53
// ver02 back button by ActionBar and Menu

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button vvBtnTo2 = findViewById(R.id.vv_btnTo2);
        vvBtnTo2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ////Context ctx =  MainActivity.this;
                        // need MainActivity.this since 'this' is new OnclickListener
                        Intent lv_it = new Intent(MainActivity.this, MySecondActivity.class);
                        startActivity(lv_it);
                    }
                });
    }
}