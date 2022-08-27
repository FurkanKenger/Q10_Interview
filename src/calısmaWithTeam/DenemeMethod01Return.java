package calısmaWithTeam;

public class DenemeMethod01Return {
    public static void main(String[] args) {

        int a = 3;
        int b = 4;


        System.out.println(toplama(3,4));

        System.out.println(cikarma(3,4));

        System.out.println(carpma(3,4));

        System.out.println(bolme(3,4));




        double sonuc = bolme(3,4);
        System.out.println(sonuc);

    }

    private static int bolme(int a, int b) {
        return a/b;
    }

    private static int carpma(int a, int b) {
        return a*b;
    }

    private static int cikarma(int a, int b) {
        return a-b;
    }

    private static int toplama(int a, int b) {
        return a+b;
    }
}
