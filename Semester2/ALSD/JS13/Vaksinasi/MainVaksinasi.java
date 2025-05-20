package Semester2.ALSD.JS13.Vaksinasi;

import java.util.Scanner;

public class MainVaksinasi {
    public static void main(String[] args) {
        DLLVaksinasi antrianVaksin = new DLLVaksinasi();
        Scanner in = new Scanner(System.in);
        int pilihan;

        do {
            antrianVaksin.tampilkanMenu();
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = in.nextInt();
            in.nextLine();

            switch (pilihan) {
                case 1:
                    antrianVaksin.tambahPenerima(antrianVaksin, in);
                    break;
                case 2:
                    antrianVaksin.hapusPenerima(antrianVaksin);
                    antrianVaksin.daftarPenerima(antrianVaksin);
                    break;
                case 3:
                    antrianVaksin.daftarPenerima(antrianVaksin);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        } while (pilihan != 4);

        in.close();
    }
}