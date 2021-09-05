package com.eomcs.pms;

//1)
//2)
//3)
//4)
//5)
public class AppMy {



  public static void main(String[] args) {

    while (true) {
      String input = PromptMy.inputString("명령> ");

      if (input.equals("exit") || input.equals("quit")) {
        System.out.println("안녕!");
        break;
      } else if (input.equals("/member/add")) {
        // 메서드로 분리한 코드를 실행하기(메서드 호출)
        // => 메서드명();
        MemberHandlerMy.add();

      } else if (input.equals("/member/list")) {
        MemberHandlerMy.list();

      }  else if (input.equals("/project/add")) {
        ProjectHandlerMy.add();

      }  else if (input.equals("/project/list")) {
        ProjectHandlerMy.list();

      }  else if (input.equals("/task/add")) {
        TaskHandlerMy.add();

      }  else if (input.equals("/task/list")) {
        TaskHandlerMy.list();

      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }
      System.out.println();
    }

    PromptMy.close();
  }
}












