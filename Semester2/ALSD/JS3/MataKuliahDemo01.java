package Semester2.ALSD.JS3;

import java.util.Scanner;

public class MataKuliahDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah panjangnya: "); int n = sc.nextInt();
        MataKuliah01[] arrayOfMatakuliah = new MataKuliah01[n];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i=0; i < n; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            sc.nextLine();
            System.out.print("Kode       : "); kode = sc.nextLine(); 
            System.out.print("Nama       : "); nama = sc.nextLine();
            System.out.print("Sks        : "); dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : "); dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfMatakuliah[i] = new MataKuliah01(kode, nama, sks, jumlahJam);
        }

        arrayOfMatakuliah[0].cetakinfo(arrayOfMatakuliah);

        arrayOfMatakuliah[0].tambahData("413424", "BD", 2, 6);

        for(int i=0; i < n; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
            System.out.println("Sks        : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("------------------------------");
        }
        
    }
}
