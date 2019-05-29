package com.glj.design.principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {
        Rick rick =  new Rick();
        rick.setStudyClass(new JavaStudy());
        rick.study();
        rick.setStudyClass(new PythonStudy());
        rick.study();
    }
}
