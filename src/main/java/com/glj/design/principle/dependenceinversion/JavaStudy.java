package com.glj.design.principle.dependenceinversion;

public class JavaStudy implements StudyClass {
    public void studying() {
        System.out.println("正在学习java");
    }
    public void studying(String name) {
        System.out.println(name + " 正在学习 Java");
    }
}
