package com.eomcs.pms;

import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.BoardHandlerMy;
import com.eomcs.pms.handler.MemberHandlerMy;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.ProjectHandlerMy;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.Prompt;

public class AppMy {

  public static void main(String[] args) {

    // 각 게시판의 게시글을 담을 메모리(boards 레퍼런스 배열과 size)를 준비한다.
    // new BoardHandler()
    //   - BoardHandler가 작업할 때 사용할 변수를 준비한다. 
    //   - BoardHandler는 게시글을 다루는 작업을 한다.
    BoardHandlerMy boardHandler = new BoardHandlerMy();
    BoardHandlerMy boardHandler2 = new BoardHandlerMy();
    BoardHandlerMy boardHandler3 = new BoardHandlerMy();
    BoardHandlerMy boardHandler4 = new BoardHandlerMy();
    BoardHandlerMy boardHandler5 = new BoardHandlerMy();
    BoardHandlerMy boardHandler6 = new BoardHandlerMy();

    MemberHandlerMy memberHandler = new MemberHandlerMy();

    ProjectHandler projectHandler = new ProjectHandler();

    TaskHandler taskHandler = new TaskHandler();

    while (true) {
      String input = Prompt.inputString("명령> ");

      if (input.equals("exit") || input.equals("quit")) {
        System.out.println("안녕!");
        break;
      } else if (input.equals("/member/add")) {
        MemberHandlerMy.add();

      } else if (input.equals("/member/list")) {
        MemberHandlerMy.list();

      }  else if (input.equals("/project/add")) {
        ProjectHandlerMy.add();

      }  else if (input.equals("/project/list")) {
        ProjectHandler.list();

      }  else if (input.equals("/task/add")) {
        TaskHandler.add();

      }  else if (input.equals("/task/list")) {
        TaskHandler.list();

      }  else if (input.equals("/board/add")) {
        BoardHandler.add();

      }  else if (input.equals("/board/list")) {
        BoardHandler.list();

      }  else if (input.equals("/board2/add")) {
        BoardHandler.add();

      }  else if (input.equals("/board2/list")) {
        BoardHandler.list();

      }  else if (input.equals("/board3/add")) {
        BoardHandler.add();

      }  else if (input.equals("/board3/list")) {
        BoardHandler.list();

      }  else if (input.equals("/board4/add")) {
        BoardHandler.add();

      }  else if (input.equals("/board4/list")) {
        BoardHandler.list();

      }  else if (input.equals("/board5/add")) {
        BoardHandler.add();

      }  else if (input.equals("/board5/list")) {
        BoardHandler.list();

      }  else if (input.equals("/board6/add")) {
        BoardHandler.add();

      }  else if (input.equals("/board6/list")) {
        BoardHandler.list();

      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }
      System.out.println();
    }

    // Prompt 가 소유하고 관리하고 있는 자원을 닫으라고 명령한다. 
    Prompt.close();
  }
}












