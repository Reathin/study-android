package com.chltec.module_day_5;

/**
 * @author Rair
 * @date 2019/7/8
 * <p>
 * desc:
 */
public class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }
}
