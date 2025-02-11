import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tugas, kuis, uts, uas;

        // mengisi nilai
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===========================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = in.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = in.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        uts = in.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        uas = in.nextDouble();
        System.out.println("===========================");

        // kualifikasi nilai
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid.");
            return; 
        }

        // hitung nilai akhir
        double hasil;
        hasil = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
        //uas saya ubah menjadi 30% karena jika 40% maka menjadi 110% totalnya

        // menentukan nilai huruf
        String nHuruf;
        if (hasil > 80 && hasil <= 100) nHuruf = "A";
        else if (hasil > 73 && hasil <= 80) nHuruf = "B+";
        else if (hasil > 65 && hasil <= 73) nHuruf = "B";
        else if (hasil > 60 && hasil <= 65) nHuruf = "C+";
        else if (hasil > 50 && hasil <= 60) nHuruf = "C";
        else if (hasil > 39 && hasil <= 50) nHuruf = "D";
        else nHuruf = "E";

        //menampilkan hasil
        System.out.printf("Nilai akhir: %.2f\n", hasil);
        System.out.printf("Nilai huruf: %s\n", nHuruf);

        if (hasil > 50) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("MAAF ANDA TIDAK LULUS");
        }

        System.out.println("===========================");
        System.out.println("===========================");

    }
}