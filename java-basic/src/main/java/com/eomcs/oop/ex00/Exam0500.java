package com.eomcs.oop.ex00;

public class Exam0500 {


  class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  Score s1, s2, s3;

  s1 = new Score();
  s2 = new Score();
  s3 = new Score();

  s.name = "홍길동";
  s.kor = 100;
  s.eng = 90;
  s.math = 80;


  public static void main(String[] args) {
    Score s = createScore("홍길동", 100, 100, 100);

    printScore(s);
  }

  static void printScore(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3;
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", 
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }

  static Score createScore(String name, int kor, int eng, int math) {

    Score s = new Score ();



    return s;
  }
}

