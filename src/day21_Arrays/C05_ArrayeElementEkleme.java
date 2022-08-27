package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        // Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun


        String [] sinifListesi = {"Ali Can", "Nida Yucedal", "Musa Yaman"};
        String eklenecekIsim = "Murat Babayigit";

        sinifListesi = elemanEkle(sinifListesi, eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));
    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
        String [] yeniSinifListesi = new String[sinifListesi.length+1]; // [null, null]
        for (int i = 0; i <sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];

        }
        // Oncelikle eski listedeki tum elemanlari, yeni listeye tasidim
        // Son index' e ise eklenecek isim atadim
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;

        return  yeniSinifListesi;
    }

}
