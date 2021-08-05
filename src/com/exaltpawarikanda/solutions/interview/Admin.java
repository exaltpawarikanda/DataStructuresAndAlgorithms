package com.exaltpawarikanda.solutions.interview;

import java.io.Serializable;

/**
 * Created by Exalt Pawarikanda on 8/5/21
 */
public class Admin extends BaseUser implements Cloneable, Serializable {
    private String name;
    private int age;
    private volatile String password;


    public Admin() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
