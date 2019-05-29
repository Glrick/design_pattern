package com.glj.design.pattern.creation.builder;

public class Coach {
    CourseBuilder courseBuilder ;
    public Coach(CourseRealBuilder courseRealBuilder){
        this.courseBuilder = courseRealBuilder;
    }
    public Course makeCourse(String courseName,String courseVedio,
                           String coursePPT,String courseArticle,
                           String courseQA){
        Course course = courseBuilder.makeCourse();
        course.setCourseQA(courseQA);
        course.setCourseVideo(courseVedio);
        course.setCourseArticle(courseArticle);
        course.setCourseName(courseName);
        course.setCoursePPT(coursePPT);
        return course;
    }
}
