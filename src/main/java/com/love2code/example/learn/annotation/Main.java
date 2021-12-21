package com.love2code.example.learn.annotation;


public class Main {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes();
        BMW bmw = new BMW();
        Class<? extends Mercedes> mercedesClass = mercedes.getClass();
        Class<? extends BMW> bmwClass = bmw.getClass();

        CarAnnotation mercedesClassAnnotation = mercedesClass.getAnnotation(CarAnnotation.class);
        CarAnnotation bmwClassAnnotation = bmwClass.getAnnotation(CarAnnotation.class);
        System.out.println(mercedesClassAnnotation.model());
        System.out.println(bmwClassAnnotation.model());
    }
}
