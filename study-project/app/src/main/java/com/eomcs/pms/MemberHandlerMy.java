package com.eomcs.pms;

import java.sql.Date;

public class MemberHandlerMy {

  static final int MAX_LENGTH = 5;

  static MemberMy[] members = new MemberMy[MAX_LENGTH];
  static int size = 0;

  static void add() {
    System.out.println("[회원 등록]");

    // 새 회원 정보를 담을 변수를 준비.
    // 낱 개의 변수가 아니라 MemberMy에 정의된 대로 묶음 변수를 만든다.
    MemberMy member = new MemberMy();

    member.no= Prompt.inputInt("번호? ");
    member.name = Prompt.inputString("이름? ");
    member.email = Prompt.inputString("이메일? ");
    member.password = Prompt.inputString("암호? ");
    member.photo = Prompt.inputString("사진? ");
    member.tel = Prompt.inputString("전화? ");
    member.registeredDate = new Date(System.currentTimeMillis());

    members[size++] = member;
  }

  static void list() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          members[i].no,
          members[i].name,
          members[i].email, 
          members[i].tel, 
          members[i].registeredDate);
    }
  }
}
