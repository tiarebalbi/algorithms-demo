package com.tiarebalbi.part1;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayStackTest {

  private Stack<String> stack;

  @Before
  public void setUp() throws Exception {
    this.stack = new ArrayStack(10);
  }

  @Test
  public void shouldAddOneElementToTheStack() {
    stack.push("A");
    stack.push("B");
    stack.push("C");

    assertThat(stack.pop()).isEqualTo("C");
    assertThat(stack.pop()).isEqualTo("B");
    assertThat(stack.pop()).isEqualTo("A");

    assertThat(stack.size()).isEqualTo(0);
  }

  @Test
  public void shouldCheckStackSize() {
    stack.push("Z");
    stack.push("F");
    stack.push("P");

    assertThat(this.stack.size()).isEqualTo(3);

    assertThat(stack.pop()).isEqualTo("P");
    assertThat(stack.pop()).isEqualTo("F");

    assertThat(this.stack.size()).isEqualTo(1);

  }

  @Test
  public void shouldCheckIfStackIsEmpty() {
    assertThat(this.stack.isEmpty()).isTrue();
  }

  @Test
  public void shouldCheckIfStackIsNotEmpty() {
    stack.push("AB");

    assertThat(this.stack.isEmpty()).isFalse();
  }

}