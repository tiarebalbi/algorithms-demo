package com.tiarebalbi.section_one.resizing_array;

import com.tiarebalbi.section_one.Stack;

class ResizingArrayStack implements Stack<String> {

  private static final int DEFAULT_CAPACITY = 1;

  private int n = 0;

  private String[] items = new String[DEFAULT_CAPACITY];

  @Override
  public void push(String item) {
    if (n == items.length) {
      resize(items.length * 2);
    }

    items[n++] = item;
  }

  @Override
  public String pop() {
    String item = items[--n];
    items[n] = null;

    if (n > 0 && n == items.length / 4) {
      resize(items.length / 2);
    }
    return item;
  }

  @Override
  public boolean isEmpty() {
    return n == 0;
  }

  @Override
  public int size() {
    return n;
  }

  private void resize(int capacity) {
    String[] temp = new String[capacity];
    for (int i = 0; i < n; i++) {
      temp[i] = items[i];
    }

    items = temp;
  }
}