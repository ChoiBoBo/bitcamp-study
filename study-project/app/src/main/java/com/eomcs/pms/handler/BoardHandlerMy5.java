package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.BoardMy;
import com.eomcs.util.Prompt;

public class BoardHandlerMy5 {

  static final int MAX_LENGTH = 5;

  static BoardMy[] boards = new BoardMy[MAX_LENGTH];
  static int size = 0;

  public static void add() {
    System.out.println("[새 게시글5]");

    BoardMy board = new BoardMy();

    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("제목? ");
    board.content = Prompt.inputString("내용? ");
    board.writer = Prompt.inputString("작성자? ");
    board.registeredDate = new Date(System.currentTimeMillis());

    boards[size++] = board;
  }

  public static void list() {
    System.out.println("[게시글 목록5]");
    for(int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %d\n",
          boards[i].no,
          boards[i].title,
          boards[i].writer,
          boards[i].registeredDate,
          boards[i].viewCount,
          boards[i].like);


    }
  }

}
