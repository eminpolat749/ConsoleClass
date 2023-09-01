package com.eminpolat.util.console.test;

import com.eminpolat.util.console.Console;

public class ReadIntTest {
    private static void run()
    {
        int a = Console.readInt("Birinci sayıyı giriniz:", "Hatalı sayı girdiniz!...");
        int b = Console.readInt("İkinci sayıyı giriniz:", "Hatalı sayı girdiniz!...");

        Console.writeLine("%d + %d = %d", a, b, a + b);
    }
    public static void main(String[] args)
    {
        run();
    }
}
