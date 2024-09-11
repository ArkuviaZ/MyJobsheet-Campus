import java.util.Scanner;

public class Siakad01 {
    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        //input
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        //eksekusi
        nilaiAkhir = (nilaiKuis*0.2) + (nilaiTugas*0.15) + (nilaiUTS*0.3) + (nilaiUAS*0.35);
        //output
        System.out.println("Nama: "+nama+ " NIM"+nim);
        System.out.println("Kelas: "+kelas+" Absen: "+absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}

