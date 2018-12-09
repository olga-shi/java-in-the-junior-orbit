package org.kosmocourses.junior.lesson2;

public class MyClass2 {

    public static void main(String[] args) {
        int i = 1;
        Object obj = new Object();
        MyClass2 myClass = new MyClass2();
        myClass.someMethod(obj);
    }

    private void someMethod(Object param) {
        String str = param.toString();
        System.out.println(str);
    }
}

