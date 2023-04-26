import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ürünün fiyatını giriniz: ");
        double fiyat = input.nextDouble();

        double kdvOrani;
        if (fiyat <= 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        double kdvTutari = fiyat * kdvOrani;
        double kdvliFiyat = fiyat + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + fiyat);
        System.out.println("KDV Oranı: %" + (kdvOrani * 100));
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);


    }
}




