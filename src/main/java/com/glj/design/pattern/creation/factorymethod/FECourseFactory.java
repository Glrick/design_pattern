package com.glj.design.pattern.creation.factorymethod;

public class FECourseFactory extends CourseFactory {
    public Course getCourse() {
        return new FECourse();
    }
}
