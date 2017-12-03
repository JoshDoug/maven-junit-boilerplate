package com.joshuastringfellow.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * The static import allows unqualified access to assertEquals
 * This means the method can be used as `assertEquals` instead
 * of `Assertions.assertEquals`
*/
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Calculator Test Class")
class CalculatorTest {

  @Test
  @DisplayName("Basic Unit Test")
  void basicTest() {
    assertEquals(1, 1);
  }

  @Test
  @DisplayName("Basic Unit Test for Calculator add method")
  void addTest() {
    Calculator calculator = new Calculator();
    assertEquals(2, calculator.add(1, 1));
  }
}