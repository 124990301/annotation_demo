package com.example.demo2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//加载在类上
@Target(ElementType.TYPE)
//注解会保留到字节码中，在运行时被jvm读到
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {

    String className();
    String method();
}
