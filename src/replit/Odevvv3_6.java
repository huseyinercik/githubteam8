package replit;

import java.util.Scanner;

public class Odevvv3_6 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

Ternary kullanin.
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("3 harfli bir isim girin");
        String isim = scan.next();
        char isimIlkHarf = isim.charAt(0);
        char isimIkinciHarf = isim.charAt(1);
        char isimUcuncuHarf = isim.charAt(2);

        String str = isim.length() == 3 ? ((isimIlkHarf != isimIkinciHarf && isimIlkHarf != isimUcuncuHarf && isimIkinciHarf != isimUcuncuHarf) ?
                "Dizenin benzersiz karakterleri var" : "isim ayni karakterlere sahiptir") : "girdiginiz isim 3 harfli degildir";

        System.out.println(str);
    }
}
