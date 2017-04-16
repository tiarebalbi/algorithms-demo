package com.tiarebalbi.section_one.stack;

import com.tiarebalbi.section_one.Stack;

class LinkedStack<T> implements Stack<T> {

  private Node<T> first;

  private int counter = 0;

  @Override
  public void push(T item) {
    this.counter++;

    Node<T> oldFirst = first;
    first = new Node<>(item, oldFirst);
  }

  @Override
  public T pop() {
    this.counter--;

    T firstItem = first.getItem();
    this.first = first.getNext();

    return firstItem;
  }

  @Override
  public boolean isEmpty() {
    return this.first == null;
  }

  @Override
  public int size() {
    return this.counter;
  }

}