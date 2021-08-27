// Stack 클래스 사용법 - Iterator 사용
package com.eomcs.basic.ex05;

import java.util.Iterator;
import java.util.Stack;

public class Exam0170 {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

    // push() - 스택의 맨 마지막에 값을 추가한다.
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");

    Iterator<String> iterator = stack.iterator();

    // Stack도 Iterable 구현체이기 때문에
    // 다음과 같이 for( : ) 문을 사용할 수 있다.
    // => 내부적으로는 iterator()를 호출하여 iterator를 얻는 후에
    //    이 Iteratoer를 통해서 값을 꺼낸다,
    // => 결국 Exam0160 과 같다.
    //    즉 Exam0160 처럼 개발자가 직접 iterator() 를 호출하여 Iterator를 얻은 후에
    //    hasNext()와 next() 를 사용할 것인지,iterator
    for (String s : stack) {
      System.out.println(s);
    }

  }

}

