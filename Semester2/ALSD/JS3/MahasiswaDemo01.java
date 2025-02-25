package Semester2.ALSD.JS3;
import java.util.Scanner;

public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah panjangnya: "); int n = sc.nextInt();
        Mahasiswa01[] arrayOfMahasiswa = new Mahasiswa01[n];
        String dummy;

        for(int i=0; i < n; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa01();
        
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------");
        }
    
        // arrayOfMahasiswa[0] = new Mahasiswa01();
        // arrayOfMahasiswa[0].nim = "244107060033";
        // arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        // arrayOfMahasiswa[0].kelas = "SIB-1E";
        // arrayOfMahasiswa[0].ipk = (float) 3.75;

        // arrayOfMahasiswa[1] = new Mahasiswa01();
        // arrayOfMahasiswa[1].nim = "2341702172";
        // arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        // arrayOfMahasiswa[1].kelas = "TI-2A";
        // arrayOfMahasiswa[1].ipk = (float) 3.36;

        // arrayOfMahasiswa[2] = new Mahasiswa01();
        // arrayOfMahasiswa[2].nim = "244107023006";
        // arrayOfMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        // arrayOfMahasiswa[2].kelas = "TI-2E";
        // arrayOfMahasiswa[2].ipk = (float) 3.80;
        
    }
    
}
