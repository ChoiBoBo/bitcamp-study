package com.eomcs.pms;

import java.sql.Date;

public class MemberHandlerMy {

  //회원 정보
  static final int LENGTH = 100;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tel = new String[LENGTH];
  static Date[] registeredDate = new Date[LENGTH];
  static int size = 0;


  static void add() {
    System.out.println("[회원 등록]");

    no[size] = PromptMy.inputtInt("번호? ");
    name[size] = PromptMy.inputString("이름? ");
    email[size] = PromptMy.inputString("이메일? ");
    password[size] = PromptMy.inputString("암호? ");
    photo[size] = PromptMy.inputString("사진? ");
    tel[size] = PromptMy.inputString("전화? ");
    registeredDate[size] = new Date(System.currentTimeMillis());

    size++;
  }

  static void list() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < size; i++) {
      // 번호, 이름, 이메일, 전화, 가입일
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          no[i], name[i], email[i], tel[i], registeredDate[i]);
    }
  }
}
