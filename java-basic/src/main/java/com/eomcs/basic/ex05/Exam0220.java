// Stack의 Iterator 와 Deque의 Iterator 차이점   
package com.eomcs.basic.ex05;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Exam0220 {

  public static void main(String[] args) {

    // Dequeue 인터페이스
    // - "Double ended queue"의 약자이다,
    //    즉 앞, 뒤 모두 양방향에서 값을 넣고 꺼낼 수 있다.
    //    그래서 큐로도 사용할 수 있고 스택으로도 사용할 수 있다.  
    // -큐, 스택 둘 다 사용할 수 있도록 queue와 stack 사용법을 모두 정의한 인터페이스다.

    // 
    ArrayDeque<String> stack = new ArrayDeque<>();

    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");


    Iterator<String> iterator = stack.iterator();

    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }



  }

}

