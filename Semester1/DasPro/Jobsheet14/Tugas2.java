import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta jumlah angka yang ingin dihitung
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        // Membuat array dengan ukuran sesuai input N
        int[] kumpulan = new int[n];

        // Memanggil fungsi untuk mengisi array
        input(kumpulan);

        // Menghitung total menggunakan fungsi rekursif
        int total = hitung(n - 1, kumpulan);

        // Menampilkan hasil
        System.out.printf("Total dari %d angka yang dimasukkan adalah: %d%n", n, total);
    }

    // Fungsi untuk mengisi array dengan input dari pengguna
    static void input(int[] kumpulan) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < kumpulan.length; i++) {
            System.out.printf("Masukkan angka ke-%d: ", i + 1);
            kumpulan[i] = sc.nextInt();
        }
    }

    // Fungsi rekursif untuk menghitung total elemen array
    static int hitung(int n, int[] kumpulan) {
        if (n < 0) {
            return 0;
        }
        return kumpulan[n] + hitung(n - 1, kumpulan);
    }
}
