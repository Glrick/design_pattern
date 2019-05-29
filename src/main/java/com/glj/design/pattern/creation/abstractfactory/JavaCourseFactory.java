package com.glj.design.pattern.creation.abstractfactory;

public class JavaCourseFactory implements CourseFactory {
    public Vedio getVedio() {
        return new JavaVedio();
    }

    public Artical getArticl() {
        return new JavaArtical();
    }
}
