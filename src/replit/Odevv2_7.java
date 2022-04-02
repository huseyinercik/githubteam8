package replit;

import java.util.Scanner;

public class Odevv2_7 {
    public static void main(String[] args) {
        /*Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ondalikli bir sayi girin");
        double sayi1= scan.nextDouble();
        int sayi2= (int) sayi1;
        System.out.println("double sayinin integer karsiligi: "+sayi2);
    }
}
