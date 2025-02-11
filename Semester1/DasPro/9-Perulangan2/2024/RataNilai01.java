import java.util.Scanner;

public class RataNilai01 {
    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        int i=1, nilaiMhs;
        double rataNilai;
        //input
        while (i<=5){
            int totalNilai = 0;
            for (int j=1; j<=5; j++) {
                System.out.println("Nilai ke-"+j+" = ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai/5;
            System.out.println("Rata-rata nilai mahasiswa ke-"+i+ "adalah"+ rataNilai);
            i++;
        }
    }
}
