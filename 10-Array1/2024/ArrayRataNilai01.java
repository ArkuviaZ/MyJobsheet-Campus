import java.util.Scanner;

public class ArrayRataNilai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        int nilaiMhs[] = new int[n];
        int jumlahLulus = 0, jumlahTdkLulus = 0;
        double totalLulus = 0, totalTdkLulus = 0;
        double rata2Lulus, rata2TdkLulus;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.err.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i]>70){
                totalLulus += nilaiMhs[i];
                jumlahLulus++;            
            }
            else {
                totalTdkLulus += nilaiMhs[i];
                jumlahTdkLulus++;
            }
        }
        
        rata2Lulus = totalLulus/jumlahLulus;
        rata2TdkLulus = totalTdkLulus/jumlahTdkLulus;
        
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TdkLulus);
    }
}
