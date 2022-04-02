package replit;

public class Odev6 {
    public static void main(String[] args) {
       /* Verilen 5 sayinin ortalamasiniz hesaplayan java kodunu yaziniz.

        Ortalamasi alinacak Sayilar : 22, 20, 30, 28, 50

        Ornek Cikti:

        Sayilarin Ortalamasi : 30*/

        int sayilar[] = {22, 20, 30, 28, 50};
        int toplam=0;
        int ortalama=0;

        for (int i = 0; i < sayilar.length ; i++) {
            toplam+=sayilar[i];
            ortalama=toplam/ sayilar.length;

        }
        System.out.println("sayilarin ortalamasi : "+ortalama);


    }
}
