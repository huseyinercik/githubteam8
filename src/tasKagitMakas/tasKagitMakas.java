package tasKagitMakas;

import java.util.Scanner;

public class tasKagitMakas {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int yarismaciPuan = 0;
        int bilgisayarPuan = 0;
        System.out.println("Taş kağıt makas oyununa hoş geldiniz!");
        System.out.println("1-Taş 2-Kağıt 3-Makas");
        while (true) {
            System.out.println("Seçiminiz: ");
            int secim = scan.nextInt();
            int bil_secim = (int) (Math.random() * 3);
            if (secim == 1) {
                if (bil_secim == 1) {
                    System.out.println("Bilgisayarın seçimi: Taş Sonuç: Berabere");
                    System.out.println("Puanınız: " + yarismaciPuan + " Bilgisayarın puanı:" + bilgisayarPuan);
                } else if (bil_secim == 2) {
                    System.out.println("Bilgisayarın seçimi: Kağıt Sonuç: Kaybettiniz");
                    bilgisayarPuan++;
                    System.out.println("Puanınız: " + yarismaciPuan + " Bilgisayarın puanı:" + bilgisayarPuan);
                } else {
                    System.out.println("Bilgisayarın seçimi: Makas Sonuç: Kazandınız");
                    yarismaciPuan++;
                    System.out.println("Puanınız: " + yarismaciPuan + " Bilgisayarın puanı:" + bilgisayarPuan);
                }
            } else if (secim == 2) {
                if (bil_secim == 1) {
                    System.out.println("Bilgisayarın seçimi: Taş Sonuç: Kazandınız");
                    yarismaciPuan++;
                    System.out.println("Puanınız: " + yarismaciPuan + " Bilgisayarın puanı:" + bilgisayarPuan);
                } else if (bil_secim == 2) {
                    System.out.println("Bilgisayarın seçimi: Kağıt Sonuç: Berabere");
                    System.out.println("Puanınız: " + yarismaciPuan + " Bilgisayarın puanı:" + bilgisayarPuan);
                } else {
                    System.out.println("Bilgisayarın seçimi: Makas Sonuç: Kaybettiniz");
                    yarismaciPuan++;
                    System.out.println("Puanınız: " + yarismaciPuan + " Bilgisayarın puanı:" + bilgisayarPuan);
                }
            } else if (secim == 3) {
                if (bil_secim == 1) {
                    System.out.println("Bilgisayarın seçimi: Taş Sonuç: Kaybettiniz");
                    bilgisayarPuan++;
                    System.out.println("Puanınız: " + yarismaciPuan + " Bilgisayarın puanı:" + bilgisayarPuan);
                } else if (bil_secim == 2) {
                    System.out.println("Bilgisayarın seçimi: Kağıt Sonuç: Kazandınız");
                    yarismaciPuan++;
                    System.out.println("Puanınız: " + yarismaciPuan + " Bilgisayarın puanı:" + bilgisayarPuan);
                } else {
                    System.out.println("Bilgisayarın seçimi: Makas Sonuç: Berabere");
                    System.out.println("Puanınız: " + yarismaciPuan + " Bilgisayarın puanı:" + bilgisayarPuan);
                }
            } else {
                System.out.println("Hatalı giriş yaptınız tekrar deneyin");
                continue;
            }
            if (yarismaciPuan == 3) {
                System.out.println("Oyunu " + yarismaciPuan + "-" + bilgisayarPuan + " kazandınız");
                break;
            } else if (bilgisayarPuan == 3) {
                System.out.println("Oyunu " + bilgisayarPuan + "-" + yarismaciPuan + " kaybettiniz");
                break;
            }
        }
    }
}
