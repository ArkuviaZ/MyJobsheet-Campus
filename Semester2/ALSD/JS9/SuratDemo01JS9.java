import java.util.Scanner;

public class SuratDemo01JS9 {
    public static void main(String[] args) {
        StackSurat01JS9 stack = new StackSurat01JS9(10);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n===== MENU SURAT IZIN =====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat (berdasarkan nama mahasiswa)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat        : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas           : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().charAt(0);
                    System.out.print("Durasi (Hari)   : ");
                    int durasi = sc.nextInt();

                    Surat01JS9 surat = new Surat01JS9(id, nama, kelas, jenis, durasi);
                    stack.TerimaSuratIzin(surat);
                    break;
                case 2:
                    Surat01JS9 diproses = stack.Prosess();
                    if (diproses != null) {
                        System.out.println("\nSurat sedang diproses:");
                        diproses.tampilkan();
                        System.out.println("\nSurat telah diproses:");
                    }
                    break;
                case 3:
                    Surat01JS9 terakhir = stack.LihatSuratIzinTerakhir();
                    if (terakhir != null) {
                        System.out.println("\nSurat Terakhir:");
                        terakhir.tampilkan();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();
                    Surat01JS9 hasil = stack.CariSurat(cari);
                    if (hasil != null) {
                        System.out.println("Surat ditemukan:");
                        hasil.tampilkan();
                    } else {
                        System.out.println("Tidak ditemukan surat dengan nama tersebut.");
                    }
                    break;
                case 0:
                    System.out.println("Keluar.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);

        sc.close();
    }
}
