package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + minus(d) + multiply(d) + divide(d);
    }

    public static void main(String[] args) {
        int resultSum = sum(5);
        int resultMinus = minus(5);
        System.out.println("Результат операции сложения: " + resultSum);
        System.out.println("Результат операции вычитания: " + resultMinus);
        Calculator calc = new Calculator();
        int resultMultiple = calc.multiply(5);
        System.out.println("Результат операции умножения: " + resultMultiple);
        int resultDivide = calc.divide(5);
        System.out.println("Результат операции деления: " + resultDivide);
        int sumAll = calc.sumAllOperation(5);
        System.out.println("Сумма всех операций: " + sumAll);
    }
}
