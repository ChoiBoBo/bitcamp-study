package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

public class AppMy2 {

  public static void main(String[] args) {
    System.out.println("[프로젝트]");

    Scanner keyboardScan = new Scanner(System.in);

    final int LENGTH = 100;

    int[] no = new int[LENGTH];
    String[] title = new String[LENGTH];
    String[] content = new String[LENGTH];
    Date[] startDate = new Date[LENGTH];
    Date[] endDate = new Date[LENGTH];
    String[] owner = new String[LENGTH];
    String[] members = new String[LENGTH];

    int size = 0;

    for (int i = 0; i < LENGTH; i++) {
      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());
      System.out.print("프로젝트명? ");
      title[i] = keyboardScan.nextLine();
      System.out.print("내용? ");
      content[i] = keyboardScan.nextLine();
      System.out.print("시작일? ");
      startDate[i] = java.sql.Date.valueOf(keyboardScan.nextLine());
      System.out.print("종료일? ");
      endDate[i] = java.sql.Date.valueOf(keyboardScan.nextLine());
      System.out.print("만든이? ");
      owner[i] = keyboardScan.nextLine();
      System.out.print("팀원? ");
      members[i] = keyboardScan.nextLine();

      size = size + 1;
      System.out.println();

      System.out.print("계속 입력하시겠습니까? (y/N) ");
      String input = keyboardScan.nextLine();
      if (input.equalsIgnoreCase("N") || input.equals("")) {
        break;
      }
      System.out.println();
    }

    keyboardScan.close(); // 데이터 입출력이 끝났으면 도구를 닫는다.

    System.out.println("--------------------------------");

    for (int i = 0; i < size; i++)
      // 번호, 프로젝트명, 시작일, 종료일, 만든이
    {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          no[i],
          title[i],
          startDate[i],
          endDate[i],
          owner[i]);
    }
  }
}
