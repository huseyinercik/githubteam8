package replit;

import java.util.Scanner;

public class Odevv2_9 {
    public static void main(String[] args) {
        /*Girilen zamanı saniyeye çeviren bir program yazınız.


Örnek Çıktı:

1 saat 10 dakika 50 saniye ==>

4250 saniye
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("bir saat girin");
        int saat=scan.nextInt();
        System.out.println("bir dakika girin");
        int dakika=scan.nextInt();
        System.out.println("bir saniye girin");
        int saniye=scan.nextInt();

        int toplamSaniye=saniye+(dakika*60)+(saat*60*60);
        System.out.println("girdiginiz : "+saat+" saat "+dakika+" dakika "+saniye+" saniye");
        System.out.println("toplam : "+toplamSaniye+" 'dir" );

    }
}
