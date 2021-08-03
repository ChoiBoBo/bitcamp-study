// 캡슐화(encapsulation) 응용 - 생성자를 private 으로 막기
package com.eomcs.oop.ex08.b;

class Car2 {
  String model;
  String maker;
  int cc;
  int valve;
}

class CarFactory{

  // 생성자를 private으로 선언하면 외부에서 이 클래스의 인스턴스를 생성하는 것을 막을 수 있다.
  private CarFactory() {}


  //    예2) 인스턴스를 오직 한 개만 생성해야 할 경우
  //    - 인스턴스를 여러 개 생성할 필요가 없는 경우에 생성자를 private으로 막는다.
  //    - getInstance() 같은 스태틱 메서드를 통해 인스턴스를 한 개만 만들어 사용한다.
  //    이러한 설계 기법을 "singletone" 패턴이라 부른다.

  public static CarFactory() {
    return new CarFactory();
  }

  // 다음은 CarFactory를 통해 자동차를 생성할 때 호출할 메서드이다
  // 
  public static Car2 create(String name) {

    Car2 c = new Car2(); // private은 클래스 안에서 사용할 수 있다.

    switch (name) {
      case "티코":
        c.model = "티코";
        c.maker = "대우";
        c.cc = 800;
        c.valve = 16;
        break;
      case "소나타":
        c.model = "소나타";
        c.maker = "현대자동차";
        c.cc = 1980;
        c.valve = 16;
        break;
      default:
        c.model = "모델S";
        c.maker = "테슬라";
        c.cc = 0;
        c.valve = 0;
    }
    return c;
  }
}

public class Exam0222 {

  public static void main(String[] args) {

    //자동차 공장 객체를 먼저 만든다
    //    CarFactory factory = new CarFactory();
    CarFactory factory = CarFactory.getInstance();

    Car2 c = factory.create("티코");

    System.out.printf("%s,%s,%d,%d\n",
        c.model, c.maker, c.cc, c.valve);

  }
}







