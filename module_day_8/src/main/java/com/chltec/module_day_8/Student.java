package com.chltec.module_day_8;

import com.rairmmd.andsqlite.anno.PrimaryKey;
import com.rairmmd.andsqlite.anno.Table;
import com.rairmmd.andsqlite.enums.AssignType;

/**
 * @author Rair
 * @date 2019/7/25
 * <p>
 * desc:
 */
@Table("student")
public class Student {

    @PrimaryKey(AssignType.AUTO_INCREMENT)
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

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
