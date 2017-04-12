package com.tiarebalbi.part1;

class ArrayStack implements Stack<String> {

  private String[] items;
  private int N = 0;

  public ArrayStack(int capacity) {
    this.items = new String[capacity];
  }

  @Override
  public void push(String item) {
    this.items[N++] = item;
  }

  @Override
  public String pop() {
    return this.items[--N];
  }

  @Override
  public boolean isEmpty() {
    return N == 0;
  }

  @Override
  public int size() {
    return N;
  }
}
