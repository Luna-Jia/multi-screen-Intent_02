package com.example.a07_intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;

public class MySecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_second);

        // 3 approaches https://medium.com/@sivakumarpurushothaman/android-adding-back-button-in-toolbar-70fdedd31296
        if (getIntent() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            //getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle("Back to First");
        }
		// Method 2
        Button vvBtnTo1 = findViewById(R.id.vv_btnTo1);
        vvBtnTo1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent lv_it = new Intent(MySecondActivity.this, MainActivity.class);
                        startActivity(lv_it);
                    }
                });
    }
    // Method 1
    // https://www.geeksforgeeks.org/how-to-add-and-customize-back-button-of-action-bar-in-android/
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent lv_it = new Intent(MySecondActivity.this, MainActivity.class);
                startActivity(lv_it);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}