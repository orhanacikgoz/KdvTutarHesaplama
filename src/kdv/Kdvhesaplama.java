


package kdv;

import java.util.Scanner;

public class Kdvhesaplama {
    public static void main(String[] args) {
        double anapara, kdv=18, toplamtutar;

        Scanner inp = new Scanner(System.in);

        System.out.print("Urun Fiyatini Giriniz: ");

         anapara = inp.nextInt();

         toplamtutar = anapara+anapara*(kdv/100);

        System.out.println("Urun Fiyati:" + anapara);
        System.out.println("Kdv Yuzdesi: " + kdv);
        System.out.println("Toplam Tutar: " + toplamtutar);






    }











}
