package com.eomcs.pms.handler;

public abstract class AbstractList implements List {
  protected int size; // 기본은 package private 이다.(이는 default다. 즉 안붙인다)

  @Override
  public int size() {
    return this.size;
  }
}
