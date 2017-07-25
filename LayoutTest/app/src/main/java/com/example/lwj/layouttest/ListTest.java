package com.example.lwj.layouttest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

/**
 * Created by Lwj on 2017/7/25.
 */

public class ListTest extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

//        ArrayAdapter<String> techerAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Teacher.getAllTeachers());
        TeacherAdapter teacherAdapter = new TeacherAdapter(this, R.layout.view_teacher, Teacher.getAllTeachers());

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(teacherAdapter);

    }
}
