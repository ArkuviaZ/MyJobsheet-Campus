
import java.util.Scanner;

public class SIAKAD01 {
    public static void main(String[] args) {
        //deklarasi
        int [][] nilai = new int[4][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input mahasiswa ke-"+ (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah "+ (j+1) +": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
        }

        System.out.println("\n==============================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        for (int j=0; j < 3; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah" + (j+1) + ": " + totalPerMatkul/4);
        }
    }
}
