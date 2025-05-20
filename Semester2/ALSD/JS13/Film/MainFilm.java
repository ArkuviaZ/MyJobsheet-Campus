package Semester2.ALSD.JS13.Film;
import java.util.Scanner;

public class MainFilm {
    public static void main(String[] args) {
        DLLFIlm daftarFilm = new DLLFIlm();
        Scanner in = new Scanner(System.in);
        int pilihan;

        do {
            daftarFilm.tampilkanMenu();
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = in.nextInt();
            in.nextLine(); 

            try {
                switch (pilihan) {
                    case 1:
                        daftarFilm.tambahFilmAwal();
                        break;
                    case 2:
                        daftarFilm.tambahFilmAkhir();
                        break;
                    case 3:
                        daftarFilm.tambahFilmIndex();
                        break;
                    case 4:
                        daftarFilm.hapusFilmPertama();
                        break;
                    case 5:
                        daftarFilm.hapusFilmTerakhir();
                        break;
                    case 6:
                        daftarFilm.hapusFilmIndex();
                        break;
                    case 7:
                        daftarFilm.cetakDaftarFilm();
                        break;
                    case 8:
                        daftarFilm.cariFilmById();
                        break;
                    case 9:
                        daftarFilm.urutkanFilmByRating();
                        break;
                    case 10:
                        System.out.println("Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
            System.out.println();
        } while (pilihan != 10);

        in.close();
    }
}