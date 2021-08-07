package com.eomcs.pms.handler;









// 갹체 사용 규칙을 정의할 때 사용하는 문법

public interface List {
  // => 즉 추상 메서드로 선언한다.
  void add(Object item);
  // 인터페
  Object[] toArray();
  boolean remove(Object obj);
}
