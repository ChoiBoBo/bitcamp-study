// 문자열 --> 객체 : json 문자열을 해석하여 객체를 생성하기
package com.eomcs.openapi.jason;

import com.google.gson.Gson;

public class Exam0220 {
  public static void main(String[] args) {

    //1) JSON 문자열 준비
    String jsonStr = "[{\"no\":101,\"name\":\"홍길동\",{\"no\":102,\"name\":\"임꺽정\"},{\"no\":102,\"name\":\"안창호\"}]";


    Member[] members = new Gson().fromJson(jsonStr, Member[].class);

    for(Member m : members) {
      System.out.println(m);
    }
  }
}

//JSON 형식 - { 객체 정보 }
// => { "프로퍼티명" : 값, "프로퍼티명": 값, ...}
