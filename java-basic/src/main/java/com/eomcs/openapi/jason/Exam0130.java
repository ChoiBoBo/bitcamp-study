// 문자열 --> 객체 : JSON 문자열에는 클래스 정보가 없다.
package com.eomcs.openapi.jason;

import com.google.gson.Gson;

public class Exam0130 {
  public static void main(String[] args) {

    //1) JSON 문자열 준비
    String jsonStr = "{\"no\":100,\"name\":\"홍길동\",\"email\":\"hong@test.com\",\"password\":\"1111\",\"photo\":\"hong.gif\",\"tel\":\"010-1111-2222\",\"registeredDate\":\"9월 16, 2021\"}";


    //2) JSON 처리 객체 준비
    Gson gson = new Gson();

    // 3) 객체의 값을 JSON 문자열로 얻기



    Board b = gson.fromJson(jsonStr, Board.class);

    System.out.println(b);
  }
}
