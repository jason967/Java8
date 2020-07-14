package com.example.java8toall;

public class Foo {
    public static void main(String[] args) {
        //익명 내부 클래스 anonymous inner class
        RunSomething runSomething = () -> System.out.println("hello");
    }
}
