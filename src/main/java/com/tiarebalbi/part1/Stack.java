package com.tiarebalbi.part1;

public interface Stack<T> {

  /**
   * Insert a new item onto stack
   *
   * @param item item to be inserted
   */
  void push(T item);

  /**
   * Remove and return the item most recently added
   *
   * @return most recently item added
   */
  T pop();

  /**
   * Check if stack is empty or not
   *
   * @return {@code false} if empty and {@code true} if is not empty
   */
  boolean isEmpty();

  /**
   * Number of items on the stack
   *
   * @return total of elements in the stack
   */
  int size();
}
