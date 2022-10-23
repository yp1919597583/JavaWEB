package com.zhibo.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UserServletTest {
    public  void login () {
        System.out.println("调研login");
    }
    public  void update () {
        System.out.println("调研update");
    }
    public  void adduser () {
        System.out.println("调研adduser");
    }
    public  void deleteuser () {
        System.out.println("调研deleteuser");
    }
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String name = "login";
     //   Method method = UserServletTest.class.getMethod(name);
        //  System.out.println(method);
        Method declaredMethod = UserServletTest.class.getDeclaredMethod(name);
        System.out.println(declaredMethod);
        declaredMethod.invoke(new UserServletTest());
    }


}
