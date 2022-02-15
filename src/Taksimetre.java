import java.util.Scanner;

public class Taksimetre {
    public static void main (String[] args){
        int km;
        double birimfiyat = 2.20 ;
        int acilis = 10 ;

        Scanner giris = new Scanner(System.in);
        System.out.print(" MEsafeyi KM cinsinden giriniz :");
        km = giris.nextInt();

        double tutar = (acilis + (km * birimfiyat));



         tutar = ( tutar <= 20) ? 20 : tutar ;

        System.out.println(tutar);
    }
}
