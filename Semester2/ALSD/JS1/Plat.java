import java.util.Scanner;

public class Plat {
    public static char kode[] = new char[10]; 
    public static char kota[][] = new char[10][12];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = -1;
        char plat;

        // mengisi array kode dan kota
        array1(10, 'A', 'B', 'C', 'D', 'F', 'G', 'H', 'L', 'N', 'T');
        array2(0, 'B', 'A', 'N', 'T', 'E', 'N');
        array2(1, 'J', 'A', 'K', 'A', 'R', 'T', 'A');
        array2(2, 'B', 'A', 'N', 'D', 'U', 'N', 'G');
        array2(3, 'C', 'I', 'R', 'E', 'B', 'O', 'N');
        array2(4, 'B', 'O', 'G', 'O', 'R');
        array2(5, 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N');
        array2(6, 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G');
        array2(7, 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A');
        array2(8, 'M', 'A', 'L', 'A', 'N', 'G');
        array2(9, 'T', 'E', 'G', 'A', 'L');

        // meminta input kode plat
        System.out.print("Masukkan kode plat: ");
        plat = in.next().charAt(0);

        // mencari indeks kode plat
        for (int i = 0; i < 10; i++) {
            if (plat == kode[i]) {
                index = i;
                break;
            }
        }

        // mencari kota berdasarkan kode
        if (index != -1) {
            System.out.print("Kota: ");
            for (int i = 0; i < 12; i++) {
                if (kota[index][i] != 0) {
                    System.out.print(kota[index][i]);
                }
            }
        } else {
            System.out.println("Maaf, kota dari kode tersebut tidak ditemukan.");
        }
    }

    // untuk mengisi array kode
    public static void array1(int n, char... args) {
        for (int i = 0; i < n; i++) {
            kode[i] = args[i];
        }
    }

    // untuk mengisi array kota
    public static void array2(int n, char... args) {
        for (int i = 0; i < args.length; i++) {
            kota[n][i] = args[i];
        }
    }
}