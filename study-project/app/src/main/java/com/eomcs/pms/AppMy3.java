package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class AppMy3 {

  public static void main(String[] args) {
    System.out.println("[작업]");

    Scanner keyboardScan = new Scanner(System.in);

    final int LENGTH = 100;

    int[] no = new int[LENGTH];
    String[] content = new String[LENGTH];
    Date[] deadline = new Date[LENGTH];
    String[] owner = new String[LENGTH];
    int[] status = new int[LENGTH];

    System.out.print("프로젝트? ");
    String project = keyboardScan.nextLine();
    System.out.println();

    int size = 0;

    for(int i = 0; i < LENGTH; i++) {

      System.out.println("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());

      System.out.println("내용? ");
      content[i] = keyboardScan.nextLine();

      System.out.println("마감일? ");
      deadline[i] = Date.valueOf(keyboardScan.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규 ");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.println("> ");
      status[i] = Integer.valueOf(keyboardScan.nextLine());

      System.out.println("담당자");
      owner[i] = keyboardScan.nextLine();

      size++;
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


    System.out.printf("[%s]\n", project);

    for(int i = 0; i < size; i++) {
      String stateLabel = null;
      switch (status[i]) {
        case 1 :
          stateLabel = "진행중"; break;
        case 2 :
          stateLabel = "완료"; break;
        default : 
          stateLabel = "신규";
      }

      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          no[i], content[i], deadline[i], stateLabel, owner[i]);
    }
  }
}
