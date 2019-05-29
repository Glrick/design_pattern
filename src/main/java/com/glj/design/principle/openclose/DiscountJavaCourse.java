package com.glj.design.principle.openclose;

import java.math.BigDecimal;

public class DiscountJavaCourse extends JavaCourse {
    public DiscountJavaCourse(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double getPrice() {
        BigDecimal originPrice = new BigDecimal(super.getPrice());
        BigDecimal discount = new BigDecimal(0.8);
        return originPrice.multiply(discount).doubleValue();
    }

    public double getOriginalPrice(){
        return super.getPrice();
    }
}
