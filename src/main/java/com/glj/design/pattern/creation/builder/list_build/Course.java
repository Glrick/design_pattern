package com.glj.design.pattern.creation.builder.list_build;

/**
 *
 * 一种链式的建造者模式（建造者模式的深入）
 * 采用内部类的方法，将建造工厂实现在类的内部
 *
 */

public class Course {
    private String courseName;
    private String coursePPT;
    private String courseArticle;
    private String courseVideo;
    private String courseQA;


    public Course(CourseBuilder courseBuilder){
        this.courseName = courseBuilder.courseName;
        this.courseArticle = courseBuilder.courseArticle;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseQA = courseBuilder.courseQA;
        this.courseVideo = courseBuilder.courseVideo;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    public static class CourseBuilder{
        private String courseName;
        private String coursePPT;
        private String courseArticle;
        private String courseVideo;
        private String courseQA;
        public CourseBuilder buildeCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }
        public CourseBuilder buildeCoursePPT(String coursePPT){
            this.coursePPT = coursePPT;
            return this;
        }
        public CourseBuilder buildeCourseArticle(String courseArticle){
            this.courseArticle = courseArticle;
            return this;
        }
        public CourseBuilder buildeCourseVideo(String courseVideo){
            this.courseVideo = courseVideo;
            return this;
        }
        public CourseBuilder buildeCourseQA(String courseQA){
            this.courseQA = courseQA;
            return this;
        }

        public Course build(){
            return new Course(this);
        }
    }


}
