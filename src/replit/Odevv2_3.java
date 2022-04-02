package replit;

import java.util.Scanner;

public class Odevv2_3 {
    public static void main(String[] args) {
        /*Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

Örnek Çıktı:

Alan: 32

Çevre: 24
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("karenin bir kenarinin uzunlugunu girin");
        int kenarUzunlugu= scan.nextInt();
        System.out.println("girilen karenin alani: "+(kenarUzunlugu*kenarUzunlugu));
        System.out.println("girilen karenin cevresi: "+(kenarUzunlugu*4));
    }
}
