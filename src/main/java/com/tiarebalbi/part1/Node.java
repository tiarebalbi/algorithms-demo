package com.tiarebalbi.part1;

public class Node<T> {
  private T item;
  private Node<T> next;

  public Node(T item, Node<T> next) {
    this.item = item;
    this.next = next;
  }

  public T getItem() {
    return item;
  }

  public Node<T> getNext() {
    return next;
  }
}
