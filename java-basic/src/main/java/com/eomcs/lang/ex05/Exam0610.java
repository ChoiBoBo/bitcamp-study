package com.eomcs.lang.ex05;

//# 증감 연산자 : 후위(post-fix) 증가 연산자
//
public class Exam0610 {
  public static void main(String[] args) {
    int i = 2;

    // 증감 연산자가 없다면,
    // 기존 변수의 값을 1증가시키기 위해 다음과 같이 코딩해야 한다.
    //i = i + 1;

    // 증감 연산자를 사용하면 다음과 같이 간략하게 작성할 수 있다.
    i++; // i => 3
    // 현재 위치에 i 메모리에 들어 있는 값(2)을 꺼내 놓는다.
    // 그런 다음에 i 메모리의 값을 1 증가시킨다.

    i++; // i => 4

    System.out.println(i); //4

    System.out.println(i++); //4
    //    위의 코드는 컴파일 할 때 다음의 코드로 바뀐다.

    //    int temp = i;
    // i = i +1;
    //    System.out.println(temp);
    System.out.println(i); //5
    //    결국!! 중요!!
    //    우리는 현재 i값 넣는다. 그리고 증가된다. 실행한다. 그 전에 넣은 것 프린터된다.
  }
}
