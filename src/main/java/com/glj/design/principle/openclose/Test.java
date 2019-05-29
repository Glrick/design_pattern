package com.glj.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new DiscountJavaCourse("111","实战项目",300);
        DiscountJavaCourse discountJavaCourse = (DiscountJavaCourse) iCourse;
        System.out.println("id:" + discountJavaCourse.getId() + " Name:" + discountJavaCourse.getName() + " OriginalPrice:" + discountJavaCourse.getOriginalPrice() + " dicountPrice" + discountJavaCourse.getPrice());
    }
}
