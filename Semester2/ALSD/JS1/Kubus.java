import java.util.Scanner;

public class Kubus {
    public static int x = 0;

    public static void main(String[] args) {
        do {
            menu();
        } while (x != 4);
    }

    //untuk tampilan menu
    public static void menu() {
        Scanner in = new Scanner(System.in);

        System.out.println("Apa yang ingin dihitung?");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.print("Masukkan nomornya: ");
        x = in.nextInt();

        if (x > 4 || x < 1) {
            if (x != 4) {
                System.out.println("Maaf nomor yang anda pilih tidak ada");
            }
        } else {
            if (x < 4 && x > 0) {
                hitung(x);
            }
            System.out.println();
            System.out.println();
        }
    }

    //untuk menghitung
    public static void hitung(int i) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi: ");
        int s = in.nextInt();

        switch (i) {
            case 1:
                int hasilVol = vol(s);
                System.out.printf("Volume kubus dengan sisi %d adalah: %d cm^3\n", s, hasilVol);
                break;
            case 2:
                int hasilLuper = luper(s);
                System.out.printf("Luas permukaan kubus dengan sisi %d adalah: %d cm^2\n", s, hasilLuper);
                break;
            case 3:
                int hasilKel = kel(s);
                System.out.printf("Keliling kubus dengan sisi %d adalah: %d cm\n", s, hasilKel);
                break;
        }
    }

    //untuk menghitung volume
    public static int vol(int n) {
        return (n * n * n);
    }

    //untuk menghitung luas permukaan
    public static int luper(int n) {
        return (6 * n * n);
    }

    //untuk menghitung keliling
    public static int kel(int n) {
        return (12 * n);
    }
}