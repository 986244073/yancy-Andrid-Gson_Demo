package com.android.gson_demo;

import com.google.gson.annotations.SerializedName;

/**
 * @Authur : Yancy
 * @E-mail : 986244073@qq.com
 * @Create : 2019/6/11
 * @Desc :
 */

public class Employee {
    @SerializedName("firstName")
    private String firstName;
    private int age;
    private String mail;

    public Employee(String firstName, int age, String mail) {
        this.firstName = firstName;
        this.age = age;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                '}';
    }
}
