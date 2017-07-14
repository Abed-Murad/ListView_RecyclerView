package com.abdallahmurad.listview_recyclerview;

/**
 * Created by AbdallahMurad on 7/13/2017.
 */

public class Employee {

    private String name;
    private String age;
    private int imgId;


    public Employee(String name, String age, int imgId) {
        this.name = name;
        this.age = age;
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Employee setAge(String age) {
        this.age = age;
        return this;
    }

    public int getImgId() {
        return imgId;
    }

    public Employee setImgId(int imgId) {
        this.imgId = imgId;
        return this;
    }
}
