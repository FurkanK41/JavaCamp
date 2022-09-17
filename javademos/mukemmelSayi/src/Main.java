public class Main {
    public static void main(String[] args) {
        //kendinden başka pozitif bölenlerinin toplamına eşit olan sayilar
        //6 --> 1,2,3
        //28 --> 1,2,4,7,14
        int sayi = 6;
        int total = 0;
        for (int i = 1;i<sayi;i++){
            if (sayi %i ==0){
                total = total + i;
            }
        }
if (total == sayi){
    System.out.println("mükemmel sayı");
}else {
    System.out.println("mükemmel sayı değil");
}
    }
}

//1