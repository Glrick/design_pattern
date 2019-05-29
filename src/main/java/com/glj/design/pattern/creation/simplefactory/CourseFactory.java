package com.glj.design.pattern.creation.simplefactory;

import java.lang.reflect.InvocationTargetException;

public class CourseFactory {
    public static Course getCourse(Class clazz){
        //会违背开闭原则，如果要加入新的类，则需要修改CourseFactory的代码
//        if("java".equalsIgnoreCase(type)){
//            return new JavaCourse();
//        }else if("python".equalsIgnoreCase(type)){
//            return new PythonCourse();
//        }
//        return null;


        //利用反射可以解决开闭原则
        Course course = null;
        try {
             course =  (Course)Class.forName(clazz.getName()).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return course;
    }
}
