package replit;

import java.util.Scanner;

public class Odevv2_8 {
    public static void main(String[] args) {
        /*Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

   Örnek Çıktı:

   Verilen tamsayının rakamları toplamı 10'dur.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("uc basamakli sayi girin");
        int sayi=scan.nextInt();;
        int rakam=0;
        int basamaklarToplami=0;

        for (int i = 0; i <=sayi; i++) {

            rakam=sayi%10;
            basamaklarToplami+=rakam;
            sayi/=10;

        }
        System.out.println("girdiginiz sayinin basamaklar toplami : "+basamaklarToplami);
    }
}
