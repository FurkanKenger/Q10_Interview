package day06_concatenation;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        /*
        Wrapper class javanin hazir methodlari kullanabilmeniz icin
         primitiv data turlerinin herbiri icin actigi clas'lardir

         int--> Integer
         char--> Character
         digerleri primitive data turu  ile ayni sadecee bas harfi buyuk
         */

        String str= "Java ile hayat ne guzel";

        System.out.println(str.toUpperCase()); // JAVA ILE HAYAT NE GUZEL

        boolean guzelmi= true;
        // guzelmi. boolean primitive oldugundan hazir method'u bulunmuyor.

        Boolean buGuzelMi=true;
        buGuzelMi.toString();

        System.out.println(Short.MAX_VALUE); // -32768
        System.out.println(Short.MAX_VALUE); //  32767




    }
}
