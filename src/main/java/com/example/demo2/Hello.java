package com.example.demo2;


import java.lang.reflect.Method;

@MyAnnotation2(className = "com.example.demo2.Demo",method = "show")
public class Hello {

    public static void main(String[] agr) throws Exception {
        //获取注解定义位置的对象
        Class<Hello> c = (Class<Hello>) Class.forName("com.example.demo2.Hello");
        //获取注解类(注解接口生成的对象)
        MyAnnotation2 annotation =c.getAnnotation(MyAnnotation2.class);
        //获取注解的属性
        String className = annotation.className();
        String method = annotation.method();
        System.out.println(className);
        System.out.println(method);

        //根据注解反射调用方法
        Class demoClass = Class.forName(className);
        Demo demo = (Demo)demoClass.newInstance();
        Method show = demoClass.getMethod(method);
        String result = show.invoke(demo).toString();
        System.out.println(result);
    }
}
