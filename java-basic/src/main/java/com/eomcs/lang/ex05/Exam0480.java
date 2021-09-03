package com.eomcs.lang.ex05;

//# 비트 연산자 : 응용 III
//
public class Exam0480 {
  public static void main(String[] args) {

    final int LOGOUT = 0x01;
    final int GENERAL = 0x02;
    final int ADMIN = 0x04;


    int menu1 = LOGOUT;
    int menu2 = GENERAL;
    int menu3 = ADMIN;
    int menu4 = LOGOUT | GENERAL | ADMIN;


    System.out.println((menu1 & LOGOUT) > 0);
    //계산 원리

    System.out.println((menu1 & GENERAL) > 0);


    System.out.println((menu1 & ADMIN) > 0);
  }
}
