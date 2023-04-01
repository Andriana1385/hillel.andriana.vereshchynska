package com.hillel.qa.java.arithmetic_operators.homework;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     * Написати програму, яка виводить на екран рік народження мого друга.
     * </p>
     *<br>
     * <h2>Вимоги:</h2>
     * <ul style="font-size:12px">
     *     <li>Створіть змінну currentYear, яка буде містити поточний рік.</li>
     *     <li>Створіть змінну friendYear, яка буде містити рік народження друга.</li>
     *     <li>Вивести в консоль "Моєму другу (число) років".</li>
     * </ul>
     */
    public static void main(String[] args) {
    int currentYear = 2023;
    int friendYear = 1985;
    System.out.println(currentYear - friendYear);
        String text ="Моєму другу 38 років";
        System.out.println(text);
    }
}
/*Арифметичні операції з типом String проводити не можна. Навіть якщо рядок повністю складається з цифр.
/НЕ розумію як тут виконати 3 пункт ,між тектом вписати приклад */