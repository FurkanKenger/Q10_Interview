package day07_ifStatements;

public class C03_BasitIfStatements {
    public static void main(String[] args) {
        /*
        Bir if statement'da { kullanilmazsa
        Java ilk satiri sarf ile baslar, sonraki satirlar bagimsiz olur

        Eger birden fazla satir ayni if sartiyla baglanmis ise mutlaka { kullanmaliyiz
         */
        int sayi=-23;

        if(sayi>0)
            System.out.println("sayi pozitif"); // degere bagli
            System.out.println("pozitif kalacaktir"); // her zaman calisir
            System.out.println("ucuncu satir"); // her zaman calisir

        if(sayi%2==0)
            System.out.println("sayi cift"); // degerebagli
            System.out.println("cift kalacaktir"); // her zaman calisir

        if(sayi%5==0)
            System.out.println("sayi 5'in tam katti"); // degere bagli


    }
}
