package com.glj.design.pattern.creation.builder.list_build;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildeCourseName("Java课程").buildeCourseArticle("Java手记").build();
        System.out.println(course.toString());
    }
}
