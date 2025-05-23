import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataDosen dtDosen = new DataDosen();
        int pilihan;

        do {
            System.out.println("Apa yang ingin Anda lakukan?:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting usia secara Ascending (Bubble Sort)");
            System.out.println("4. Sorting usia secara Descending (Selection Sort)");
            System.out.println("5. Insertion Sort usia secara Descending");
            System.out.println("6. Cari usai secara Sequential Searching");
            System.out.println("7. Cari usai secara Binary Search");
            System.out.println("0. Keluar"); 
            System.out.print("Pilihan: "); pilihan = in.nextInt();
            in.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: "); String kd = in.nextLine();
                    System.out.print("Nama: "); String nm = in.nextLine();
                    System.out.print("Jenis Kelamin (L/P): "); boolean jk = in.nextLine().equalsIgnoreCase("L");
                    System.out.print("Usia: "); int age = in.nextInt();
                    in.nextLine();

                    Dosen dsnBaru = new Dosen(kd, nm, jk, age);
                    dtDosen.tambah(dsnBaru);
                    break;
                case 2:
                    dtDosen.tampil();
                    break;
                case 3:
                    dtDosen.SortingASC();
                    System.out.printf("%nData dosen diurutkan Ascending berdasarkan usia.%n%n");
                    break;
                case 4:
                    dtDosen.sortingDSC();
                    System.out.printf("%nData dosen diurutkan Descending berdasarkan usia (Selection Sort).%n%n");
                    break;
                case 5:
                    dtDosen.insertionSort();
                    System.out.printf("%nData dosen diurutkan Descending berdasarkan usia (Insertion Sort).%n%n");
                    break;
                case 6:
                    System.out.print("Masukkan usia yang akan dicari: "); int nSS = in.nextInt();
                    int xSS = dtDosen.sequentialSearching(nSS);
                    dtDosen.tampilDataSearch(nSS, xSS);
                    break;
                case 7:
                    System.out.println("Masukkan usia yang akan dicari: "); int nBS = in.nextInt();
                    dtDosen.SortingASC();
                    int xBS = dtDosen.perantaraBS(nBS);
                    dtDosen.tampilDataSearch(nBS, xBS);
                    break;
                case 0:
                    System.out.println("Program selesai, Anda telah keluar.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while(pilihan != 0);
    }

    public void cari(){

    }
}