package com.example.demo1;

public @interface MyAnnotation {

    public int age() default 20;

    public String name();
}

