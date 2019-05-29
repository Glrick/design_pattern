package com.glj.design.principle.openclose;

public class JavaCourse implements ICourse {
    String id;
    String name;
    double price;

    public JavaCourse(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
