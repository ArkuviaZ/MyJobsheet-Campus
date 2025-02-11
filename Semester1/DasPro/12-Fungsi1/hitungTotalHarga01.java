import java.util.Scanner;

public class hitungTotalHarga01{
    public static double hitungTotalHarga (int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        double hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;
        if("DISKON50".equals(kodePromo)){
            hargaTotal -= hargaTotal*50/100;
        } else if ("DISKON30".equals(kodePromo)){
            hargaTotal -= hargaTotal*30/100;
        } else {
            System.out.println("kode invalid dan tidak ada pengurangan total harga");
        }
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String lanjut;
        double hargaAkhir = 0;

        do { 
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            System.out.print("Masukkan kode promo: ");
            String kodePromo = sc2.nextLine();
            double totalHarga = hitungTotalHarga (pilihanMenu, banyakItem, kodePromo);
            hargaAkhir += totalHarga;
            System.out.print("Apakah ingin lanjut memesan(y/t)? ");
            lanjut = sc2.nextLine();
        } while (lanjut.equals("y"));
        
        System.out.println("Total harga untuk pesanan Anda: Rp" + hargaAkhir);
    }
}