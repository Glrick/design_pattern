package com.glj.design.pattern.creation.simplefactory;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        CourseFactory factory = new CourseFactory();
//        Course course = factory.getCourse("python");
//
//        course.product();
        Course course = CourseFactory.getCourse(JavaCourse.class);
        ArrayList<String> list = new ArrayList<String>();
        course.product();
    }
}
