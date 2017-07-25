package com.example.lwj.layouttest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lwj on 2017/7/25.
 */

public class Teacher {

    /*
    * 什么属性
    *
    * */

    private String name;
    private String desc;
    private int imgId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    // 构造函数
    public Teacher(String name, String desc, int imgId){

        this.name = name;
        this.desc = desc;
        this.imgId = imgId;

    }

    /*获取teacher列表*/

    public  static List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<>();

        teachers.add(new Teacher("张三","中信银行,值得信懒",R.drawable.zhongxin));
        teachers.add(new Teacher("李四","要存钱,中国银行",R.drawable.zhongguo));
        teachers.add(new Teacher("王五","老百姓的潜在这里",R.drawable.nongye));

        return  teachers;
    }
//    public  static List<String> getAllTeachers() {
//        List<String> teachers = new ArrayList<>();
//
//        teachers.add("张三");
//        teachers.add("李四");
//        teachers.add("王五");
//
//        return  teachers;
//    }
}
