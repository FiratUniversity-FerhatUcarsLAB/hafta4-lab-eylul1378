/*
 * Ad Soyad : Nihal Eylül İL 
 * Ogrenci No : 250541001
 * Aciklama : Maas Hesaplama Programı
 * Tarih : 05.11.2025
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        
        //Sabitler tanımlamdı.
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        //Scanner çağırıldı.
        Scanner input = new Scanner(System.in);
        
        //Kullanıcıdan gereken bilgiler alındı.
        System.out.print("Çalışan adını soyadını giriniz:");
        String adSoyad = input.nextLine();

        System.out.print("Çalışanın aylık brüt maaşını giriniz(TL): ");
        double brutMaas = Double.parseDouble(input.nextLine());
        
        System.out.print("Çalışanın mesai saati sayısını giriniz(int): ");
        int mesaiSaati = Integer.parseInt(input.nextLine());

        //İstenilen hesaplamalar yapıldı.

        //Gelirler
        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        //Kesintiler
        double sgkKesintisi = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesintisi + gelirVergisi + damgaVergisi;

        //Net Maaş
        double netMaas = toplamGelir - toplamKesinti;
        
        //İstatikler
        double kesintiOrani = toplamKesinti / toplamGelir * 100;
        double saatlikNetKazanc = netMaas / 176;
        double gunlukNetKazanc = netMaas / 22;
        
        
        //Çıktılar formatlı bir şekilde yazdırıldı.
        System.out.println("====================================");
        System.out.println("            MAAS BORDROSU           ");
        System.out.println("====================================");

        System.out.printf("Calisan : %s\n", adSoyad);

        System.out.println("\nGELIRLER:");
        System.out.printf("%-27s : %.2f TL\n", "Brut Maas", brutMaas);
        System.out.printf("%-27s : %.2f TL\n", "Mesai Ucreti (" + mesaiSaati + " saat)", mesaiUcreti);
        System.out.println("-------------------------------------");
        System.out.printf("%-27s : %.2f TL\n", "TOPLAM GELIR", toplamGelir); 

        System.out.println("\nKESINTILER:");
        System.out.printf("%-27s : %.2f TL\n","SGK KESINTISI (14.0%)", sgkKesintisi);
        System.out.printf("%-27s : %.2f TL\n","GELIR VERGISI (15.0%)", gelirVergisi);
        System.out.printf("%-27s : %.2f TL\n","DAMGA VERGISI (0.00759%)", damgaVergisi);
        System.out.println("-------------------------------------");
        System.out.printf("%-27s : %.2f TL\n", "TOPLAM KESINTI", toplamKesinti);
        System.out.printf("%-27s : %.2f TL\n", "NET MAAS", netMaas);

        System.out.println("\nISTATISTIKLER:");
        System.out.println("-------------------------------------");
        System.out.printf("%-27s : %.1f %%\n", "Kesinti Orani (%)", kesintiOrani);
        System.out.printf("%-27s : %.2f TL\n", "Saatlik Net Kazanc", saatlikNetKazanc);
        System.out.printf("%-27s : %.2f TL\n", "Gunluk Net Kazanc", gunlukNetKazanc);

        System.out.println("=====================================");

        input.close();
    }
}
