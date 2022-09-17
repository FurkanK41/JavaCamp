public class Main {
    public static void main(String[] args) {

        // int remainder = number % 2;
// asal sayı 1 e ve kendisinden başka sayıya bölünmeyen sayıdır. örn 7 kendisinden başka sayıya bölünmez

      /*  int sayi = 7;
        int asalBulma = 1;

        for (asalBulma=1;asalBulma<sayi;asalBulma++){
            if (sayi%asalBulma==1){
                System.out.println("sayı asal değil");
            }else {
                System.out.println("sayı asal");
            }
        }*/

        //bug
        int number = -2;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("sayı asal değildir");
            return;
        }
        if (number < 2) {
            System.out.println("geçersiz sayı");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("sayı asaldır");
        } else {
            System.out.println("sayı asal değildir");
        }
    }
}
