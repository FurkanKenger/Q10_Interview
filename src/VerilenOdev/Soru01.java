package VerilenOdev;

import java.util.Scanner;

import static day14_methodCreation.C04_MethodCreationReturn.isimGizle;

public class Soru01 {
    public static void main(String[] args) {
        // Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
        //(Check credit card number, if there aren't 16 digit print "Invalid credit card number"
        //Input:
        //John White 1234234534561478
        // Output:
        //Name: J*** W****
        //CCN: **** **** **** 1478
        //---------
        //Kullanıcı Adı, Soyadı ve kredi kartı numaralarını sorarak özel forma dönüştürün. (Ad ve soyadının baş harfleri büyük olmalıdır)
        //(Kredi kartı numarasını kontrol edin, 16 haneli bir yazı yoksa "Geçersiz kredi kartı numarası" yazdırın.
        //Giriş:
        //John Beyaz 1234234534561478
        // Çıktı:
        //İsim: J*** W***
        //CCN: **** **** **** 1478
        String GirilenKartNumarası = "1234567891234567";


        Scanner scanner = new Scanner(System.in);
        System.out.println("********X BANKA HOSGELDINIZ********");

        String isim = "John";
        String soyisim = "White";
        String gizliIsim = isimGizle(isim, soyisim);
        System.out.println(isim + " " + soyisim); // John White
        System.out.println(gizliIsim);

        while (true){
            System.out.println("Kredi kart numaranızı giriniz");
            String girilenKartNumarası = scanner.nextLine();

            String kartNo = "1234567891234567";
            if (kartNo.equals(girilenKartNumarası)){
                System.out.println("Kart numaranız dogru");
                System.out.println(girilenKartNumarası.substring(0,4).replaceAll("\\w","*")+" "+girilenKartNumarası.substring(4,8).replaceAll("\\w","*")+
                        " "+girilenKartNumarası.substring(8,12).replaceAll("\\w","*")+" "+
                        girilenKartNumarası.substring(girilenKartNumarası.length()-4));
                break;
            }else{
                System.out.println("Geçersiz kredi kartı numarası");

            }
        }
    }
}

