package com.glj.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Teamleader {
    public  void countNumOfCourse(){
        List<Course> list = new ArrayList<Course>();
        for(int i = 0; i < 20; i++){
            list.add(new Course());
        }
        System.out.println("The nums of course is: " + list.size());
    }
}
