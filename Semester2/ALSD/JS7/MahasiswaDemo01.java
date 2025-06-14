import java.util.Scanner;

public class MahasiswaDemo01 {
    public static void main(String[] args) {

        MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01 (1);
        Scanner sc = new Scanner(System.in);

        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke- " + (i + 1));
            System.out.print("NIM\t: ");
            String nim = sc.nextLine();
            System.out.print("Nama\t: ");
            String nama = sc.nextLine();
            System.out.print("Kelas\t: ");
            String kelas = sc.nextLine();
            System.out.print("IPK\t: ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("--------------------");
            list.tambah(new Mahasiswa01(nim, nama, kelas, ipk));
        }

        list.tampil();

        // System.out.println("--------------------");
        // System.out.println("Pencarian data");
        // System.out.println("--------------------");
        // System.out.println("masukkan ipk mahasiswa yang dicari : ");
        // System.out.print("IPK : ");
        // double cari = sc.nextDouble();

        // System.out.println("menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int) posisi;

        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);


        //melakukan pencarian data binary
        System.out.println("------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari2 = sc.nextDouble();

        System.out.println("------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("------------------------------------");
        double posisi2 = list.findBinarySearch(cari2, 0, jumMhs-1);
        int pss2 = (int) posisi2;

        list.tampilPosisi(cari2, pss2);
        list.tampilDataSearch(cari2, pss2);
    }
}
