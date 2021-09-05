package com.eomcs.pms;

import java.sql.Date;

public class ProjectHandlerMy {

  // 프로젝트 정보
  static final int PROJECT_LENGTH = 1000;
  static int[] pNo = new int[PROJECT_LENGTH];
  static String[] pTitle = new String[PROJECT_LENGTH];
  static String[] pContent = new String[PROJECT_LENGTH];
  static Date[] pStartDate = new Date[PROJECT_LENGTH];
  static Date[] pEndDate = new Date[PROJECT_LENGTH];
  static String[] pOwner = new String[PROJECT_LENGTH];
  static String[] pMembers = new String[PROJECT_LENGTH];
  static int pSize = 0;


  static void add() {
    System.out.println("[프로젝트 등록]");

    pNo[pSize] = PromptMy.inputtInt("번호? ");
    pTitle[pSize] = PromptMy.inputString("프로젝트명? ");
    pContent[pSize] = PromptMy.inputString("내용? ");
    pStartDate[pSize] = PromptMy.inputtDate("시작일? ");
    pEndDate[pSize] = PromptMy.inputtDate("종료일? ");
    pOwner[pSize] = PromptMy.inputString("만든이? ");
    pMembers[pSize] = PromptMy.inputString("팀원? ");

    pSize++;
  }

  static void list() {
    System.out.println("[프로젝트 목록]");
    for (int i = 0; i < pSize; i++) {
      // 번호, 프로젝트명, 시작일, 종료일, 만든이
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          pNo[i], pTitle[i], pStartDate[i], pEndDate[i], pOwner[i]);
    }
  }

}
