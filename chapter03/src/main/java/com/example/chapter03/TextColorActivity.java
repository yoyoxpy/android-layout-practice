package com.example.chapter03;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TextColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_color);
        TextView tv_code_system=findViewById(R.id.tv_code_system);
        //文字颜色设置成系统自带的颜色（如绿色）
        tv_code_system.setTextColor(Color.GREEN);

        //用八位十六进制编码将文字颜色设置成不透明的绿色
        TextView tv_code_eight=findViewById(R.id.tv_code_eight);
        tv_code_eight.setTextColor(0xff00ff00);

        //用六位十六进制编码将文字颜色设置成透明的绿色，透明就是看不到
        TextView tv_code_six=findViewById(R.id.tv_code_six);
        tv_code_six.setTextColor(0x00ff00);

        //设置背景颜色（获取对应文字视图）
        TextView tv_code_background=findViewById(R.id.tv_code_background);
        tv_code_background.setBackgroundColor(Color.RED);
        //tv_code_background.setBackgroundResource(R.color.green);
    }
}