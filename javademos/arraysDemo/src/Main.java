public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";

        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------");

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "engin";
        ogrenciler[1] = "derin";
        ogrenciler[2] = "salih";

String[] isimler = new String[4];
isimler[0] = "furkan";
isimler[1] = "burak";
isimler[2] = "ayşe";
isimler[3] = "mahmut";
for (int a = 0; a<isimler.length; a++){
    System.out.println(isimler[a]);
}
System.out.println("fjksklfjklslkj");
        for (int i = 0; i < ogrenciler.length; i++) {

            System.out.println(ogrenciler[i]);
        }
        System.out.println("----------");

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}