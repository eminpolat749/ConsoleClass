package com.eminpolat.util.console.test;

import com.eminpolat.util.console.Console;

public class ReadLongTest {
    private static void run()
    {
        long a = Console.readLong("Birinci sayıyı giriniz:", "Hatalı sayı girdiniz!...");
        long b = Console.readLong("İkinci sayıyı giriniz:", "Hatalı sayı girdiniz!...");

        Console.writeLine("%d + %d = %d", a, b, a + b);
    }
    public static void main(String[] args)
    {
        run();
    }
}

