package org.example;

public class Calculator {
    public int summ(int a, int b){
        int result = a + b;
        System.out.printf("Сумма %d и %d равна %d \n", a, b, result);
        return result;
    }
    public int subtraction(int a, int b){
        int result = a - b;
        System.out.printf("Вычитание из %d значения %d равно %d \n", a, b, result);
        return result;
    }
    public int division(int a, int b){
        int result = a / b;
        System.out.printf("Деление этих двух чисел %d и %d дает разницу %d \n", a, b, result);
        return result;
    }
    public int multiply(int a,int b){
        int result = a * b;
        System.out.printf("Умножение числа %d на %d дает %d \n", a, b, result);
        return result;
    }
}
