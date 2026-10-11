package com.example.chapter03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTextColor = findViewById(R.id.btn_text_color);
        Button btnTextSize = findViewById(R.id.btn_text_size);
        Button btnTextView = findViewById(R.id.btn_text_view);
        Button btnViewBorder = findViewById(R.id.btn_view_border);
        Button btnViewGravity = findViewById(R.id.btn_view_gravity);
        Button btnViewMargin = findViewById(R.id.btn_view_margin);

        btnTextColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TextColorActivity.class));
            }
        });

        btnTextSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TextSizeActivity.class));
            }
        });

        btnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TextViewActivity.class));
            }
        });

        btnViewBorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ViewBorderActivity.class));
            }
        });

        btnViewGravity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ViewGravityActivity.class));
            }
        });

        btnViewMargin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ViewMarginActivity.class));
            }
        });
    }
}