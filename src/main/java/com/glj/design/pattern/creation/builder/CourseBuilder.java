package com.glj.design.pattern.creation.builder;

public abstract class CourseBuilder {
//    private String courseName;
//    private String coursePPT;
//    private String courseArticle;
//    private String courseVideo;
//    private String courseQA;
    public abstract void setCourseName(String courseName);
    public abstract void setCoursePPT(String coursePPT);
    public abstract void setCourseArticle(String courseArticle);
    public abstract void setCourseVideo(String courseVideo);
    public abstract void setCourseQA(String courseQA);
    public abstract Course makeCourse();
}
