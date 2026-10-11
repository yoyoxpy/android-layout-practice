package com.example.chapter03.util;

import android.content.Context;

public class Utils {
    public static int dip2px(Context context, float dpValue){
        //获取当前手机像素密度（1dp对应几个px）
        float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dpValue * scale + 0.5f);//四舍五入取整
    }
}
