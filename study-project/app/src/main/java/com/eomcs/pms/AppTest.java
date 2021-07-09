package com.eomcs.pms;
import java.util.Scanner;

public class AppTest {

  public static void main(String[] args) {

    Scanner Keyboard = new Scanner(System.in);

    System.out.println("[회원]");

    System.out.println("번호? 101");
    int number = Keyboard.nextInt();
    Keyboard.nextLine();

    System.out.println("이름? 홍길동");
    String name = Keyboard.nextLine();

    System.out.println("이메일? hong@test.com");
    String mail = Keyboard.nextLine();

    System.out.println("암호? 1111");
    int code = Keyboard.nextInt();
    Keyboard.nextLine();

    System.out.println("사진? hong.png");
    String photo = Keyboard.nextLine();

    System.out.println("전화? 010-1111-2222");
    String phone = Keyboard.nextLine();



  }
}
//System.out.println("계속 입력하시겠습니까?(y/N) y");


//번호? 102
//이름? 임꺽정
//이메일? leem@test.com
//암호? 1111
//사진? leem.png
//전화? 010-1111-3333
//
//계속 입력하시겠습니까?(y/N) y
//
//번호? 103
//이름? 이순신
//이메일? lee@test.com
//암호? 1111
//사진? lee.png
//전화? 010-1111-4444
//
//계속 입력하시겠습니까?(y/N)