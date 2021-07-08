package com.eomcs.pms;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner keyboardScan = new Scanner(System.in);
    System.out.println("[프로젝트]");

    System.out.print("번호? ");
    int no = keyboardScan.nextInt();
    keyboardScan.nextLine();

    //    System.out.print("프로젝트명? ");
    //    String name = keyboardScan.nextLine(); 

    System.out.print("내용? ");
    String text = keyboardScan.nextLine();

    System.out.print("완료일 ");
    java.sql.Date startDate = java.sql.Date.valueOf(keyboardScan.nextLine());

    System.out.println("상태?");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    int status = Integer.valueOf(keyboardScan.nextLine());

    //    System.out.print("종료일? ");
    //    java.sql.Date endDate = java.sql.Date.valueOf(keyboardScan.nextLine());

    System.out.print("담당자? ");
    String owner = keyboardScan.nextLine();

    //    System.out.print("팀원? ");
    //    String member = keyboardScan.nextLine();

    keyboardScan.close();

    System.out.println("--------------------");

    System.out.printf("번호 : %d\n",no);
    //    System.out.printf("프로젝트명 : %s\n",name);
    System.out.printf("내용 : %s\n",text);
    System.out.printf("완료일 : %s\n",startDate);
    //    System.out.printf("종료일 : %s\n",endDate);

    if(status == 1) {
      System.out.println("상태: 진행중");
    } else if(status == 2) {
      System.out.println("상태: 완료");
    } else {
      System.out.println("상태: 신규");
    }


    System.out.printf("담당자 : %s\n",owner);
    //    System.out.printf("팀원 : %s\n",member);

  }
}
