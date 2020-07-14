package com.example.java8toall;

@FunctionalInterface
public interface RunSomething
{
    //추상 메서드가 딱 하나만 있다면 -> 함수형 인터페이스
    abstract void doIt();
    //2개가 있으면 안됍니다. abstract는 생략이 가능하다.

    //어노테이션 추가하면 오류 발생
    //void go();

    static void printName()
    {
        System.out.println("Woong");
    }
    default void printAge()
    {
        System.out.println("30?");
    }
}
