import java.util.Scanner;

public class Cafe01 {
    public static void main(String[] args) {
        int penjualan[][] = {
            {20, 20, 25, 20, 10, 60, 10}, // Kopi
            {30, 80, 40, 10, 15, 20, 25}, // Teh
            {5, 9, 20, 25, 10, 5, 45},    // Es Degan
            {50, 8, 17, 18, 10, 30, 6},   // Roti Bakar
            {15, 10, 16, 15, 10, 10, 55}  // Gorengan
        };
        String menu[] = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        
        inputJual(penjualan);
        DataPenjualan(penjualan, menu);
        rata2Penjualan(penjualan, menu);
        tertinggi(penjualan, menu);
    }

    //________________________________________________________________________

    // Fungsi untuk menambahkan data penjualan
    public static void inputJual(int penjualan[][]) {
        Scanner scanner = new Scanner(System.in);
        String lanjut;
        
        do { 
            System.out.print("Anda ingin memasukkan nilai menu ke-?: ");
            int menuI = scanner.nextInt();
            System.out.print("Anda ingin memasukkan nilai hari ke-?: ");
            int hariI= scanner.nextInt();
            System.err.print("Berapa nilai yang ingin anda masukkan?: ");
            int nilai = scanner.nextInt();
            System.err.print("Lanjut(y/t)?: "); lanjut = scanner.nextLine();
            penjualan[menuI][hariI] = nilai;
        } while (lanjut.equals("y"));
    }

    // Fungsi untuk menampilkan seluruh data penjualan
    public static void DataPenjualan(int penjualan[][], String menu[]) {
        System.out.printf("%-12s", "Menu");
        for (int i = 1; i <= 7; i++) {
            System.out.printf("Hari %d\t", i);
        }
        System.out.println();
        for (int i = 0; i < penjualan.length; i++) {
            System.out.printf("%-12s", menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf("%d\t\t", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    public static void tertinggi(int penjualan[][], String menu[]) {
        int mak = 0;
        String top = "";
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > mak) {
                mak = total;
                top = menu[i];
            }
        }
        System.out.printf("Menu dengan penjualan tertinggi adalah %s dengan total penjualan %d %n" , top, mak);
    }

    // Fungsi untuk menampilkan rata-rata penjualan untuk setiap menu
    public static void rata2Penjualan(int penjualan[][], String menu[]) {
        System.out.println("Rata-rata penjualan untuk setiap menu:");
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double average = (double) total / penjualan[i].length;
            System.out.printf("%s: %.2f\n", menu[i], average);
        }
    }
}
