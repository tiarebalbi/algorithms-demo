package com.tiarebalbi.part1;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LinkedStackTest {

  private Stack<Integer> stack;

  @Before
  public void setUp() throws Exception {
    this.stack = new LinkedStack<>();
  }

  @Test
  public void shouldAddOneElementToTheStack() {
    stack.push(1);
    stack.push(2);
    stack.push(3);

    assertThat(stack.pop()).isEqualTo(3);
    assertThat(stack.pop()).isEqualTo(2);
    assertThat(stack.pop()).isEqualTo(1);

    assertThat(stack.size()).isEqualTo(0);
  }

  @Test
  public void shouldCheckStackSize() {
    stack.push(2);
    stack.push(4);
    stack.push(6);

    assertThat(this.stack.size()).isEqualTo(3);

    assertThat(stack.pop()).isEqualTo(6);
    assertThat(stack.pop()).isEqualTo(4);

    assertThat(this.stack.size()).isEqualTo(1);

  }

  @Test
  public void shouldCheckIfStackIsEmpty() {
    assertThat(this.stack.isEmpty()).isTrue();
  }

  @Test
  public void shouldCheckIfStackIsNotEmpty() {
    stack.push(3);

    assertThat(this.stack.isEmpty()).isFalse();
  }

}