package com.eomcs.oop.ex08.b;

public class X {
  private int privateVar;
  int defaultVar;
  protected int protectedVar;
  public int publicVar;

  private void privateMeththod() {}
  void defaultMeththod() {}
  protected void protectedMeththod() {}
  public void protectedMeththod() {}

  public void test() {
    // 같은 클래스의 멤버인 경우 제한없이 모든 멤베에 접근할 수 있다.
    this.privateVar = 100;
    this.defaultVar = 100;
    this.protectedVar = 100;
    this.publicVar = 100;

    this.privateMeththod();
    this.defaultMeththod();
    this.protectedMeththod();
    this.protectedMeththod();

  }