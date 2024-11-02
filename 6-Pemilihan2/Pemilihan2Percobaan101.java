import java.util.Scanner;

public class Pemilihan2Percobaan101 {
    public static void main(String[] args) {
        //deklarasi
        Scanner absen01 = new Scanner(System.in);
        int tahun;
        //input
        System.out.print("Masukkan Tahun: ");
        tahun = absen01.nextInt();
        //eksekusi + output
        if ((tahun%4)==0){
            if ((tahun%100)!=0) {
                System.out.println("Tahun Kabisat");
                }
            else {
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun Kabisat");
                }
                else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            }
        }
        else {
            System.out.println("Bukan Tahun Kabisat");
            }
    }
}
