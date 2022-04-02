package replit;

import java.util.Scanner;

public class Odevv2_10 {
    public static void main(String[] args) {
        /*Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

INPUT:

Dakika sayısı: 3456789

OUTPUT :

3456789 dakika yaklaşık 6 yıl 210 gündür*/
        Scanner scan = new Scanner(System.in);
        System.out.println("dakika sayisini girin");
        double dakika = scan.nextDouble();
        double yilIciDakika=60*24*365;

        long yil=(long) (dakika/yilIciDakika);
        int gun=(int) (dakika/60/24%365);
        System.out.println(dakika+" dakika yaklasik: "+yil+" yil "+gun+" gundur");


    }
}
