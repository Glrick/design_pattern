package com.glj.design.pattern.creation.abstractfactory;


public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Vedio vedio = courseFactory.getVedio();
        Artical artical = courseFactory.getArticl();

        vedio.product();
        artical.product();
    }
}
