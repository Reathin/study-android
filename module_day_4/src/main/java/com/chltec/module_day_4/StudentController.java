package com.chltec.module_day_4;

/**
 * @author Rair
 * @date 2019/7/4
 * <p>
 * desc:
 */
public class StudentController {

    private static StudentController instance;
    private Student student;

    private StudentController() {

    }
    public static StudentController getInstance() {
        if (instance == null) {
            instance = new StudentController();
        }
        return instance;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}
