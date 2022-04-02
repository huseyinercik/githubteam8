package replit;

public class Odev7 {
    public static void main(String[] args) {
        /*Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)

int a= 3;

int b= 5;

Ornek Cikti:

a=5

b=3*/
        int a=3;
        int b=5;
        System.out.println("swaptan once \na: "+a+"\nb: "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("swaptan sonra \na: "+a+"\nb: "+b);
    }
}
