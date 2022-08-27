package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        // 6- Bir tamsayi, bir de char degisken olusturun ve bularin toplamini yazdirin.
        int sayi=10;
        char harf='a';
        String  str="banan";

        System.out.println(sayi+harf); // 10a degil 107 oldu
        System.out.println(sayi*harf); //
        System.out.println(str+harf); // banana
        System.out.println(harf+2);
        System.out.println(str + sayi + harf) ; // banan10a

        // char yeniHarf = Harf+2;

        /*
        1- char data turu isleme girdigi degiskenin turune gore farkli davranabilir
        eger matematiksel isleme girdigi variable sayisal bir degerse sayi gibi davranir
        sayi+harf sayi variable'i int oldugundan harrf variable'i asci tablosndan 97 degerini kullanir

        char yeniHarf = Harf+2; java once sagdaki islemi yapar, sagda int+ charr gorunce ascii degerini
                                 sonra atama islemi yapmaya calisir
                                 char yeniHarf=99;
                                 bu atama java acisindan kabul edilebilir degildir
        2- str+harf); // banana String variable cok gucludur, hangi data turu ile isleme
                         girerse girsin diger data turunu kendne benzetir

         */

        // peki... konsolda 10a gormek istersek nasil yazdirmaliyiz ?

        System.out.println(""+sayi+harf); //10a
    }
}
