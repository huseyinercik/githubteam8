package replit;

import java.util.Scanner;

public class Odevv2_4 {
    public static void main(String[] args) {
        /*Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.


1 şeker = 1.7 gr


Örnek Çıktı:

Yılda 12.41 kg şeker kullanıyor.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("gunde kac bardak cay iciyorsunuz: ");
        int gunlukCayTuketimi= scan.nextInt();

        System.out.println("1 bardak caya kac gr seker atiyorsun: ");
        double seker=scan.nextDouble();

        int yillikCayTuketimi=0;
        double toplamSeker=0;

        yillikCayTuketimi=gunlukCayTuketimi*365;
        toplamSeker=yillikCayTuketimi*seker;
        toplamSeker/=1000;
        System.out.println("yillik kullandiginiz seker: "+toplamSeker+" kg");
    }
}
