package Semester2.ALSD.JS12;
import java.util.Scanner;

public class MainLayanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedListLayanan queue = new QueueLinkedListLayanan();
        int pilihan = 0;
        
        do {
            System.out.println("===== Layanan Antrian Mahasiswa =====");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Mahasiswa dari Antrian");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Mahasiswa Terakhir");
            System.out.println("5. Lihat Semua Mahasiswa dalam Antrian");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Jumlah Mahasiswa dalam Antrian");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-9): ");
            
            pilihan = sc.nextInt();
            sc.nextLine();
            
            switch (pilihan) {
                case 1:
                    // Tambah mahasiswa ke antrian
                    System.out.println("\nData Mahasiswa yang ingin ditambahkan:");
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Jurusan: "); String jurusan = sc.nextLine();
                    System.out.print("Keperluan: "); String keperluan = sc.nextLine();
                    
                    MahasiswaLayanan mhs = new MahasiswaLayanan(nim, nama, jurusan, keperluan);
                    queue.enqueue(mhs);
                    break;
                    
                case 2:
                    // Panggil mahasiswa dari antrian
                    MahasiswaLayanan dipanggil = queue.dequeue();
                    if (dipanggil != null) {
                        System.out.println("\nData Mahasiswa yang Dipanggil:");
                        dipanggil.tampilInformasi();
                    }
                    break;
                    
                case 3:
                    MahasiswaLayanan depan = queue.peek();
                    if (depan != null) {
                        System.out.println("\nMahasiswa Antrian Terdepan:");
                        depan.tampilInformasi();
                    }
                    break;
                    
                case 4:
                    // Lihat mahasiswa terakhir
                    MahasiswaLayanan akhir = queue.peekRear();
                    if (akhir != null) {
                        System.out.println("\nMahasiswa Antrian Terbelakang:");
                        akhir.tampilInformasi();
                    }
                    break;
                    
                case 5:
                    System.out.println("\nDaftar Mahasiswa dalam Antrian:");
                    queue.display();
                    break;
                    
                case 6:
                    if (queue.isEmpty()) {
                        System.out.println("Antrian Kosong");
                    } else {
                        System.out.println("Antrian tidak kosong");
                    }
                    break;
                    
                case 7:
                    if (queue.isFull()) {
                        System.out.println("Antrian Penuh");
                    } else {
                        System.out.println("Antrian tidak penuh");
                    }
                    break;
                    
                case 8:
                    System.out.printf("Jumlah mahasiswa dalam antrian: %d orang", queue.size());
                    break;
                    
                case 9:
                    queue.clear();
                    break;
                    
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 0-9.");
            }
            
        } while (pilihan != 0);
        
        sc.close();
    }
}