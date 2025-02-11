import java.util.Scanner;

public class Kuliah {
    public static int x = 0;
    public static String[] matkul;
    public static int[] sks;
    public static int[] semester;
    public static String[] hari;
    public static int jumlah;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan berapa mata kuliah yang anda ingin isi: ");
        jumlah = in.nextInt();

        matkul = new String[jumlah];
        sks = new int[jumlah];
        semester = new int[jumlah];
        hari = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            input(i);
        }

        do {
            menu();
        } while (x != 4);
    }

    // untuk mengisi matkul
    public static void input(int i) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nama mata kuliah: ");
        matkul[i] = in.nextLine();

        System.out.print("Masukkan sks: ");
        sks[i] = in.nextInt();

        System.out.print("Masukkan semesternya: ");
        semester[i] = in.nextInt();

        in.nextLine();
        System.out.print("Masukkan nama harinya: ");
        hari[i] = in.nextLine();
    }

    // Untuk tampilan menu
    public static void menu() {
        Scanner in = new Scanner(System.in);

        System.out.println("Apa yang ingin cari?");
        System.out.println("1. Jadwal Kuliah");
        System.out.println("2. Cari mata kuliah berdasarkan hari");
        System.out.println("3. Cari mata kuliah berdasarkan semester");
        System.out.println("4. Keluar");
        System.out.print("Masukkan nomornya: ");
        x = in.nextInt();

        if (x > 4 || x < 1) {
            if (x != 4) System.out.println("Maaf nomor yang anda pilih tidak ada");
        } else {
            if (x < 4 && x > 0) lanjut(x);
        }
    }

    // Untuk menghitung
    public static void lanjut(int i) {
        switch (i) {
            case 1:
                System.out.println();
                jadwal();
                break;
            case 2:
                bHari();
                break;
            case 3:
                bSemester();
                break;
        }
    }

    // Untuk menampilkan jadwal
    public static void jadwal() {
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("Mata Kuliah: %s\nSKS: %d\nSemester: %d\nHari: %s\n", matkul[i], sks[i], semester[i], hari[i]);
            System.out.println();
        }
    }

    // untuk menampilkan berdasarkan hari
    public static void bHari() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan hari: ");
        String cHari = in.nextLine();

        for (int i = 0; i < jumlah; i++) {
            if (cHari.equals(hari[i])) {
                System.out.print(matkul[i] + " ");
            }
        }
        System.out.println();
    }

    // untuk menampilkan berdasarkan semester
    public static void bSemester() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan semester: ");
        int cSemester = in.nextInt();

        for (int i = 0; i < jumlah; i++) {
            if (cSemester == semester[i]) {
                System.out.print(matkul[i] + " ");
            }
        }
        System.out.println();
    }
}