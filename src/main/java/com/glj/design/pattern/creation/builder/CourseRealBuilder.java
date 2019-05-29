package com.glj.design.pattern.creation.builder;

public class CourseRealBuilder extends CourseBuilder {
    Course course = new Course();
    public void setCourseName(String courseName) {
        this.course.setCourseName(courseName);
    }

    public void setCoursePPT(String coursePPT) {
        this.course.setCoursePPT(coursePPT);
    }

    public void setCourseArticle(String courseArticle) {
        this.course.setCourseArticle(courseArticle);
    }

    public void setCourseVideo(String courseVideo) {
        this.course.setCourseVideo(courseVideo);
    }

    public void setCourseQA(String courseQA) {
        this.course.setCourseQA(courseQA);
    }

    public Course makeCourse() {
        return course;
    }
}
