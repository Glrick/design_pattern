package com.glj.design.pattern.creation.factorymethod;

public class JavaCourseFactory extends CourseFactory {

    public Course getCourse() {
        return new JavaCourse();
    }
}
