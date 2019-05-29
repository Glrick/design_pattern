package com.glj.design.pattern.creation.abstractfactory;

public class PythonCourseFactory implements CourseFactory {
    public Vedio getVedio() {
        return new PythonVedio();
    }

    public Artical getArticl() {
        return new PythonArtical();
    }
}
