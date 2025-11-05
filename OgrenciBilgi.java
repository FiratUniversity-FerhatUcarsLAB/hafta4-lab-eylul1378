/*
 * Ad Soyad : Nihal Eylül İL 
 * Ogrenci No : 250541001
 * Aciklama : Öğrenci Bilgi Sistemi
 * Tarih : 05.11.2025
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {

        // Scanner çağırıldı.
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Öğrenci Bilgi Sistemi=====");

        //Kullanıcıdan gerekli bilgiler alındı.
        System.out.print("Adınızı giriniz: ");
        String ad = input.nextLine();

        System.out.print("Soyadınızı giriniz: ");
        String soyad = input.nextLine();

        System.out.print("Okul numaranızı giriniz: ");
        int okulNo = Integer.parseInt(input.nextLine());

        System.out.print("Yaşınızı giriniz: ");
        int yaş = Integer.parseInt(input.nextLine());

        System.out.print("GPA ortalamanızı giriniz(0.00-4.00): ");
        double gpa = Double.parseDouble(input.nextLine());

        //Girilen bilgiler ekrana yazdırıldı.
        System.out.println("\n===== KAYIT BAŞARILI =====");
        System.out.println("Öğrenci Bilgileri:");
        System.out.println("---------------------------");
        System.out.printf("Ad Soyad        : %s %s\n", ad, soyad);
        System.out.printf("Okul No         : %d\n", okulNo);
        System.out.printf("Yaş             : %d\n", yaş);
        System.out.printf("GPA(0.00-4.00)  : %.2f\n", gpa);
        System.out.println("---------------------------");

        input.close();
    }
}
