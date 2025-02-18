import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar mata kuliah
        String matkul[] = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        double nAngka[]= new double[matkul.length];
        double bNilai[]  = new double[matkul.length];

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester ");
        System.out.println("==============================");

        // Input nilai angka
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("Masukkan Nilai Angka untuk Mata Kuliah %s: ", matkul[i]);
            nAngka[i] = scanner.nextDouble();
            bNilai[i] = kBobot(nAngka[i]);
        }

        // Menampilkan hasil konversi
        System.out.println("\n==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-40s %-12s %-12s %-12s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        // %-40s: Format untuk string dengan lebar 40 karakter, diratakan ke kiri.
        // %-12s: Format untuk string dengan lebar 12 karakter, diratakan ke kiri.

        double totalBobot = 0;
        for (int i = 0; i < matkul.length; i++) {
            String nHuruf = kHuruf(nAngka[i]);
            totalBobot += bNilai[i];
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n", matkul[i], nAngka[i], nHuruf, bNilai[i]);
        }

        // Menghitung IP
        double ip = totalBobot / matkul.length;
        System.out.println("==============================");
        System.out.printf("Indeks Prestasi (IP) Semester: %.2f\n", ip);
    }

    // untuk koversi nilai ke huruf nilai
    public static String kHuruf(double n) {
        if (n > 80 && n <= 100) return "A";
        else if (n > 73 && n <= 80) return "B+";
        else if (n > 65 && n <= 73) return "B";
        else if (n > 60 && n <= 65) return "C+";
        else if (n > 50 && n <= 60) return "C";
        else if (n > 39 && n <= 50) return "D";
        else return "E";
    }

    // untuk konversi nilai ke angka bobot nilai
    public static double kBobot(double n) {
        if (n > 80 && n <= 100) return 4.00;
        else if (n > 73 && n <= 80) return 3.50;
        else if (n > 65 && n <= 73) return 3.00;
        else if (n > 60 && n <= 65) return 2.50;
        else if (n > 50 && n <= 60) return 2.00;
        else if (n > 39 && n <= 50) return 1.00;
        else return 0.00;
    }
}
