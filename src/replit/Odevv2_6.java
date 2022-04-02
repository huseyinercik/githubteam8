package replit;

import java.util.Scanner;

public class Odevv2_6 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir Float değer girmesini isteyin,
        bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        float sayi=scan.nextFloat();
        System.out.println(sayi);
        short sayi2=(short) sayi;
        System.out.println("float olarak girilen sayinin short donusturulmus karsiligi: "+sayi2);
    }
}
