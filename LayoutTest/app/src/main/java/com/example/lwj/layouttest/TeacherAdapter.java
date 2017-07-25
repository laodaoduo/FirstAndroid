package com.example.lwj.layouttest;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lwj on 2017/7/25.
 */

public class TeacherAdapter extends ArrayAdapter {

    public TeacherAdapter(Context context, int resource, List<Teacher> objects) {
        super(context, resource, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent){

        final Teacher teacher = (Teacher) getItem(position);

        // 创建布局
        View oneTeacherView = LayoutInflater.from(getContext()).inflate(R.layout.view_teacher, parent, false);

        // 获取ImageView和TextView
        ImageView imageView = (ImageView) oneTeacherView.findViewById(R.id.imageView);
        TextView textView = (TextView) oneTeacherView.findViewById(R.id.textView2);

        // 根据老师数据设置ImageView和TextView的展现
        imageView.setImageResource(teacher.getImgId());
        textView.setText(teacher.getName());

        oneTeacherView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  初始化一个准备跳转到TeacherDetailActivity的Intent
                Intent intent = new Intent(getContext(), DetailActivity.class);
                // 准备跳转
                // 往Intent中传入Teacher相关的数据，供TeacherDetailActivity使用
                intent.putExtra("teacher_image", teacher.getImgId());
                intent.putExtra("teacher_desc", teacher.getDesc());
                getContext().startActivity(intent);
            }
        });

        return oneTeacherView;
    }

}
