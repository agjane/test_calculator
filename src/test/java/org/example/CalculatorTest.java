package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.printf("Тестирование калькулятора началось \n");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("Тест математической операции начался");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Тест математической операции закончился \n");
    }

    @AfterAll
    public static void afterAll() {
        System.out.printf("Тестирование калькулятора закончилось");
    }

    @ParameterizedTest(name = "#{index} - Сумма {0} и {1} равна {2}")
    @CsvSource({"-1, -1, -2", "0, 0, 0", "-1, 2, 1", "1, 1, 2","10, 5, 15"})
    @Tag("Сумма")
    @DisplayName("Проверка суммирования")
    void summ(int a, int b, int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.summ(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "#{index} - Разница между {0} и {1} равна {2}")
    @CsvSource({"-10, -5, -5", "0, 0, 0", "-10, 5, -15", "10, 5, 5","20, 5, 15"})
    @Tag("Вычитание")
    @DisplayName("Проверка вычитания")
    void subtraction(int a, int b, int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "#{index} - Деление {0} на {1} равно {2}")
    @CsvSource({"-10, -2, 5", "-10, 5, -2", "10, 5, 2","20, 5, 4"})
    @Tag("Деление")
    @DisplayName("Проверка деления")
    void division(int a, int b, int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.division(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "#{index} - Умножение {0} на {1} равно {2}")
    @CsvSource({"-5, -5, 25", "0, 0, 0", "-10, 5, -50", "10, 5, 50","20, 5, 100"})
    @Tag("Умножение")
    @DisplayName("Проверка умножения")
    void multiply(int a, int b, int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(a, b);
        Assertions.assertEquals(expectedResult, result);
    }
}