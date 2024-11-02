
import java.util.Scanner;

public class Kafe01 {

    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
        //input
        System.out.print("Masukkan Menu: ");
        menu = sc.nextLine();
        System.out.print("Masukkan ukuran cup: ");
        ukuranCup = sc.next().charAt(0);
        System.out.print("Masukkan jumlah: ");
        jumlah = sc.nextInt();
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();
        //eksekusi
        double hargaMenu = 0;
        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }

        double totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                System.out.print("Ukuran yang dipilih tidak tersedia");
        }

        double diskon= keanggotaan? 0 : 0.1;
        double nominalBayar = totalHarga - (diskon * totalHarga);
        //output
        System.out.println("Item pembelian "+jumlah+" "+menu+" dengan ukuran cup "+ ukuranCup);
        System.out.println("Nominal bayar: "+nominalBayar);
        
    }
}
