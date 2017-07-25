package com.example.lwj.layouttest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Lwj on 2017/7/25.
 */

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        // 从Intent获取数据
        int imageId = getIntent().getIntExtra("teacher_image", 0);
        String desc = getIntent().getStringExtra("teacher_desc");

        // 获取特定的视图
        ImageView imageView = (ImageView) findViewById(R.id.teacher_large_imageView);
        TextView textView = (TextView) findViewById(R.id.teacher_desc_textView);

        // 根据数据设置视图展现
        imageView.setImageResource(imageId);
        textView.setText(desc);
    }
}
