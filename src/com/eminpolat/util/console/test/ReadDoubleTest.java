package com.eminpolat.util.console.test;

import com.eminpolat.util.console.Console;

public class ReadDoubleTest {
    private static void run()
    {
        double a = Console.readDouble("Birinci sayıyı giriniz:", "Hatalı sayı girdiniz!...");
        double b = Console.readDouble("İkinci sayıyı giriniz:", "Hatalı sayı girdiniz!...");

        Console.writeLine("%f + %f = %f", a, b, a + b);
    }
    public static void main(String[] args)
    {
        run();
    }
}