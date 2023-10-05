package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void summ() {
        Calculator calculator = new Calculator();
        int result = calculator.summ(10,3);
    }

    @Test
    void subtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(25,5);
    }

    @Test
    void division() {
        Calculator calculator = new Calculator();
        int result = calculator.division(9,3);
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        int result = calculator.division(6,6);
    }
}