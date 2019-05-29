package com.glj.design.pattern.creation.factorymethod;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        CourseFactory courseFactory1 = new PythonCourseFactory();
        Course course = courseFactory.getCourse();
        course.product();
    }
}
