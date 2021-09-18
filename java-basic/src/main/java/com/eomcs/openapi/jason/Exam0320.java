// 문자열 --> 객체 : json 문자열을 해석하여 객체를 생성하기
package com.eomcs.openapi.jason;

import java.lang.reflect.Type;
import java.util.Collection;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class Exam0320 {
  public static void main(String[] args) {

    String jsonStr = "[{\"no\":101,\"name\":\"홍길동\",{\"no\":102,\"name\":\"임꺽정\"},{\"no\":102,\"name\":\"안창호\"}]";

    //1) 컬력센의 타입을 설정한다.
    //    Type collectionType = new TypeToken<Collection<Integer>>(){}.getType();

    // 위 문장을 풀어서 보면,
    // 1) TypeToken 클래스를 상속 받아서 Type 인터페이스의 구현체를 만든다.
    class MyTypeToken<T> extends TypeToken<T> {
      // TypeToken 클래스에서 이미 Type 인터페이스를 구현했기 때문에
      // 서브 클래스에서 따로 뭔가를 추가할 필요는 없다.
      // 단지 타입 파라미터 T에 타입 이름을 전달하기 위해 만든 클래스이다.
    }
    //2)
    MyTypeToken typeToken = new MyTypeToken();

    //3)
    Type collectionType = typeToken.getType();

    //4)
    Collection<Member>list = new Gson().fromJson(jsonStr, collectionType);

    for(Member m : list) {
      System.out.println(m);
    }
  }
}

//JSON 형식 - { 객체 정보 }
// => { "프로퍼티명" : 값, "프로퍼티명": 값, ...}
