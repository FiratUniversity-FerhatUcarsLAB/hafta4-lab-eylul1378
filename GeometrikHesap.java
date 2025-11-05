/*
 * Ad Soyad : Nihal Eylül İL 
 * Ogrenci No : 250541001
 * Aciklama : Geometrik Hesaplama Programı 
 * Tarih : 05.11.2025
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {

        // 'pi' değeri 'final' bir sabit olarak tanımlandı.
        final double PI = 3.14159;

        // Scanner çağırıldı.
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");

        // Kullanıcıdan yarıçap bilgisi alındı.
        System.out.print("Dairenin yaricapini girin (cm): ");
        double yaricap = Double.parseDouble(input.nextLine());

        double alan = PI * Math.pow(yaricap, 2); 

        // Sonuçlar formatlı bir şekilde yazdırıldı.
        System.out.println("\nSONUCLAR:");
        System.out.println("----------");
        System.out.printf("%-17s : %.2f %s\n", "Daire Alani", alan, "cm^2");
        System.out.printf("%-17s : %.2f %s\n", "Daire Cevresi", (2 * PI * yaricap), "cm");
        System.out.printf("%-17s : %.2f %s\n", "Daire Capi", (2 * yaricap), "cm");
        System.out.printf("%-17s : %.2f %s\n", "Kure Hacmi", ((4.0 / 3.0) * PI * Math.pow(yaricap, 3)), "cm^3");
        System.out.printf("%-17s : %.2f %s\n", "Kure Yuzey Alani", (4 * PI * Math.pow(yaricap, 2)), "cm^2");

        input.close();
    }
}