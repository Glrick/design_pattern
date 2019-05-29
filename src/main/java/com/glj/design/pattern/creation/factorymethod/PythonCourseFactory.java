package com.glj.design.pattern.creation.factorymethod;

public class PythonCourseFactory extends CourseFactory {
    public Course getCourse() {
        return new PythonCourse();
    }
}
