package com.eomcs.lang.ex05;

//# 비트 연산자 : 응용 III
//
public class Exam0481 {
  public static void main(String[] args) {

    final int LOGOUT = 0x01;
    final int GENERAL = 0x02;
    final int ADMIN = 0x04;


    int menu1 = LOGOUT;
    int menu2 = GENERAL;
    int menu3 = ADMIN;
    int menu4 = LOGOUT | GENERAL | ADMIN;
    int menu5 = GENERAL | ADMIN; //로그인 한 사용자만 접근 가능한 메뉴


    System.out.println((menu2 & LOGOUT) > 0);
    System.out.println((menu2 & GENERAL) > 0);
    System.out.println((menu2 & ADMIN) > 0);

    System.out.println("-------------------------------------------");
    System.out.println((menu3 & LOGOUT) > 0);
    System.out.println((menu3 & GENERAL) > 0);
    System.out.println((menu3 & ADMIN) > 0);

    System.out.println("-------------------------------------------");
    System.out.println((menu4 & LOGOUT) > 0);
    System.out.println((menu4 & GENERAL) > 0);
    System.out.println((menu4 & ADMIN) > 0);

    System.out.println("-------------------------------------------");
    System.out.println((menu5 & LOGOUT) > 0);
    System.out.println((menu5 & GENERAL) > 0);
    System.out.println((menu5 & ADMIN) > 0);


  }
}
