import java.util.Scanner;

public class ArrayRataNilai01 {
    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        int [] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        //input
        for (int i = 0; i < 10; i++) {
            System.err.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        //eksekusi
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        //output
        System.out.println("Rata-rata nilai = " + rata2);
    }
}
