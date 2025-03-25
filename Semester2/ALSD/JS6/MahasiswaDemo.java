import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();

        Mahasiswa mhs[] = new Mahasiswa[5];

        for (int i=0; i<mhs.length; i++) {
            Scanner in = new Scanner(System.in);
            mhs[i] = new Mahasiswa();

            System.out.printf("Masukkan Data Mahasiswa ke-%d %n", i+1);
            
            System.out.print("NIM: "); mhs[i].nim = in.nextLine();
            System.out.print("Nama: "); mhs[i].nama = in.nextLine();
            System.out.print("Kelas: "); mhs[i].kelas = in.nextLine();
            System.out.print("IPK: "); mhs[i].ipk = in.nextDouble();
            System.out.println("----------------------------");
            in.nextLine();   
        }

        for (int i=0; i<mhs.length; i++) {
            list.tambah(mhs[i]);
        }
        
        // System.out.println("Data mahasiswa sebelum sorting: ");
        // list.tampil();
    
        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        // list.selectionSort();
        // list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}