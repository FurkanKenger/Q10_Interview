package day05_matematikseksellslemler;

import java.util.Locale;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String str="Java cok guzel";
        str.toUpperCase();

        int sayi=10;
        // primitive data turlerinin yaninda method'lar olmaz
        // java bazi method'lari kullanabilmemiz icin
        // her bir primitive data turu icin bir wrapper class olusturmustur.

        Integer sayi2=10;
        sayi2.byteValue();

    }
}
