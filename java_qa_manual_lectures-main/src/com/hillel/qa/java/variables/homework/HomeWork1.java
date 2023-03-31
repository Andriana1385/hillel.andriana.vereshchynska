package com.hillel.qa.java.variables.homework;

import java.sql.SQLOutput;

public class HomeWork1 {
    /**
     * <h2>Вимоги:</h2>
     * <ul style="font-size:12px">
     *     <li>У методі main оголоси чотири змінні типу int, double, String, boolean.</li>
     *     <li>Змінні повинні мати імена year, height, countryName, isStudent.</li>
     *     <li>Змінним одразу потрібно присвоїти значення.</li>
     * </ul>
     */
    public static void main(String[] args) {
        String countryName = "Ukraine";
        int year = 2023;
        double height = 52.3;
        boolean isStudent = true;
        System.out.println(countryName);
        System.out.println(year);
        System.out.println(height);
        System.out.println(isStudent);
    }
}
