package VerilenOdev;

import java.util.Scanner;

public class Soru2 {
    public static <and> void main(String[] args) {
        /*
        Ask the user to their weight and height and type a program with calculates mass index
        • HINT: Body Mass Index = Weight (kg) / Square of height (m)
        Then give a message to user as following:
        If BMI is less than 18.5, you are weak If BMI is between 18.5 and 25, your weight is ideal
        If BMI is between 25 and 30, you are fat BMI is more than or equal to 30,obese
         */

        int Weight = 71;
        double Height = 1.72;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Weight giriniz");
        int weight=scan.nextInt();

        System.out.println("Lutfen Height giriniz");
        int height=scan.nextInt();
        System.out.println("Weight : " + Weight);
        System.out.println("Height  : " + Height);
        System.out.println(Weight/(Height*Height));




    }
}