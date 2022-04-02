package replit;

import java.util.Scanner;

public class Odevvvv4_1 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

    char ch1= 'a' ;

		String name =“John came late"

		Expected Output:


    Number of a = 2*/
        Scanner scan = new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String isim = scan.next().toLowerCase();
        System.out.println("bir karakter giriniz");
        char karakter = scan.next().charAt(0);
        int sayac = 0;

        for (int i = 0; i < isim.length(); i++) {
            if (isim.charAt(i) == karakter) {
                sayac++;

            }
        }
        System.out.println("verdiginiz isimde istediginiz harf: " + sayac + " defa kullanilmistir");

    }
}
