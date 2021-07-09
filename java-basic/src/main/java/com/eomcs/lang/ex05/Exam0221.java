// 관계 연산자 : 부동소수점 비교 
package com.eomcs.lang.ex05;

public class Exam0221 {
  public static void main(String[] args) {
    float f1 = 0.1f;
    float f2 = 0.1f;

    System.out.println(f1 * f2 == 0.01f); // false

    // 이유?
    System.out.println(f1 * f2); // 0.010000001 결과 값 뒤에 0.000000001 오차 발생!

    // 해결책?
    // => 오차를 제거한 후 비교
    // => 다만 계산 결과를 절대값으로 만든 후에 오차 이하의 값인지 비교하라!
    float r = f1 * f2 - 0.01f; //0.01f는 내가 예상하는 값을 뺀다

    //abs절댓값으로 함.음수일 경우도 있어서 // POSITIVE_IN.. 이거는 자바에서 제공하는 무시해도 되는 숫자 (0220)의 EPSILON의 역할
    System.out.println(Math.abs(r) <= Float.POSITIVE_INFINITY);
  }
}
