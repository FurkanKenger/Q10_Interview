package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        // bir onceki swap sorusunu bos kova kullanmaddan yapin
        int sayi1 = 10;
        int sayi2 = 20;

        System.out.println("swaptan önce  " + "sayi1: " + sayi1 + "sayi2: " + sayi2);
        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;
        System.out.println("swaptan sonra " + "sayi1: " + sayi1 + "sayi2: " + sayi2);
    }
}
