import java.util.Scanner;

public class BioskopWithScanner01 {
    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        String nama, next;
        int baris, kolom;
        String[][] penonton = new String[4][2];
        //input + eksekusi + ouput
        while (true) { 
            //input
            System.out.print("Masukkan Nama: ");
            nama = sc.nextLine(); 
            System.out.print("Masukkan Baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan Kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();
            //eksekusi
            penonton[baris-1][kolom-1] = nama;
            //ouput
            System.out.print("Input penonton lainnya (y/n): ");
            next = sc.nextLine();
            if(next.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
