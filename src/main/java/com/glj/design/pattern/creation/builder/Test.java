package com.glj.design.pattern.creation.builder;

public class Test {
    public static void main(String[] args) {
        CourseRealBuilder courseRealBuilder = new CourseRealBuilder();
        Coach coach = new Coach(courseRealBuilder);
        Course course = coach.makeCourse("Java教程", "Java视频", "JavaPPt", "Java手记", "Java问答");
        System.out.println(course.toString());
    }
}
