package edu.alenasoft;

import static org.junit.Assert.*;

import org.junit.Test;

public class FooTest {

  @Test
  public void testGetTrueAnswer() {
    Foo foo = new Foo();
    assertTrue(foo.getTrueAnswer());
  }

}