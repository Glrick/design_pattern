package com.glj.design.principle.demeter;

public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Teamleader teamleader = new Teamleader();
        boss.countNumsOfCourse(teamleader);
    }
}
