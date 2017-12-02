package com.joshuastringfellow.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

  @Test
  void addTest(TestInfo testInfo) {
    Calculator calculator = new Calculator();
    assertEquals(2, calculator.add(1, 1));
  }
}