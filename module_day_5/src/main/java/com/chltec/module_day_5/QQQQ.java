package com.chltec.module_day_5;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Rair
 * @date 2019/7/8
 * <p>
 * desc:
 */
public class QQQQ {

    /**
     * name : 小明
     * age : 14
     * gender : true
     * height : 1.65
     * grade : null
     * middle-school : "W3C" Middle School
     * skills : ["JavaScript","Java","Python","Lisp"]
     */
    @SerializedName("name")
    private String name;
    @SerializedName("age")
    private int age;
    @SerializedName("gender")
    private boolean gender;
    @SerializedName("height")
    private double height;
    @SerializedName("grade")
    private Object grade;
    @SerializedName("middle-school")
    private String middleschool;
    @SerializedName("skills")
    private List<String> skills;

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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Object getGrade() {
        return grade;
    }

    public void setGrade(Object grade) {
        this.grade = grade;
    }

    public String getMiddleschool() {
        return middleschool;
    }

    public void setMiddleschool(String middleschool) {
        this.middleschool = middleschool;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
