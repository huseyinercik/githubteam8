package replit;

import java.util.Scanner;

public class Odevv2_1 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir sayı alın ve
        sayının küpünün yarısını konsola yazdıran bir program yazın.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi girin");
        int sayi=scan.nextInt();

         sayi=sayi*sayi*sayi/2;

        System.out.println("girilen sayinin kupunun yarisi: "+sayi);


    }
}
