package com.eomcs.lang.ex05;

//# 비트 연산자 & 를 이용하여 % 연산 구현하기 응용 I
//
public class Exam0352 {
  public static void main(String[] args) {
    // % 연산자를 이용하여 짝수/홀수 알아내기
    System.out.println(57 % 2 == 0 ? "짝수" : "홀수");

    // & 연산자를 이용하여 짝수/홀수 알아내기
    //57에 2진수로 바꿔서 끝에서 1이면 홀수 그렇지 않으면 짝수
    // 2진수를 10진수 (0x1)로 변경해서 사용함
    //현업에서는 이거로 사용함
    //훨씬 더 빨라서.. 숙어처럼 외워라
    System.out.println((57 & 0x1) == 0 ? "짝수" : "홀수");

  }
}

