public class Main {
    public static void main(String[] args) {
        char harf = 'E';

        //kendi denemem

        /* if (harf == 'A') {
            System.out.println("A kalın sesli bir harfdir");
        } else if (harf == 'E') {
            System.out.println("E ince sesli bir harfdir");
        } else if (harf == 'O') {
            System.out.println("O kalın sesli bir harfdir");

        } else if (harf == 'Ö') {
            System.out.println("Ö ince sesli bir harfdir");

        } else if (harf == 'U') {
            System.out.println("U kalın sesli bir harfdir");

        } else if (harf == 'Ü') {
            System.out.println("Ü ince sesli bir harfdir");

        } else if (harf == 'I') {
            System.out.println("I kalın sesli bir harfdir");

        } else if (harf == 'İ') {
            System.out.println("İ ince sesli bir harfdir");

        }*/
        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }
    }
}