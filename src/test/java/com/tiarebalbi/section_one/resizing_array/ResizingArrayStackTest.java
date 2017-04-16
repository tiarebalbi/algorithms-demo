package com.tiarebalbi.section_one.resizing_array;

import com.tiarebalbi.section_one.Stack;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResizingArrayStackTest {

  private Stack<String> stack;

  @Before
  public void setUp() throws Exception {
    this.stack = new ResizingArrayStack();
  }

  @Test
  public void shouldAddOneElementToTheStack() {
    stack.push("X");
    stack.push("D");
    stack.push("C");

    assertThat(stack.pop()).isEqualTo("C");
    assertThat(stack.pop()).isEqualTo("D");
    assertThat(stack.pop()).isEqualTo("X");

    assertThat(stack.size()).isEqualTo(0);
  }

  @Test
  public void shouldCheckStackSize() {
    stack.push("Z1");
    stack.push("F1");
    stack.push("P1");

    assertThat(this.stack.size()).isEqualTo(3);

    assertThat(stack.pop()).isEqualTo("P1");
    assertThat(stack.pop()).isEqualTo("F1");

    assertThat(this.stack.size()).isEqualTo(1);

  }

  @Test
  public void shouldCheckIfStackIsEmpty() {
    assertThat(this.stack.isEmpty()).isTrue();
  }

  @Test
  public void shouldCheckIfStackIsNotEmpty() {
    stack.push("ABC");

    assertThat(this.stack.isEmpty()).isFalse();
  }
}