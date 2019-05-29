package com.glj.design.principle.dependenceinversion;

public class PythonStudy implements StudyClass {
    public void studying() {
        System.out.println("Rick 正在学习 python");
    }

    public void studying(String name) {
        System.out.println( name + " 正在学习 python");
    }
}
