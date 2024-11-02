import java.util.Scanner;

public class Gaji01 {
    public static void main(String[] args){
      //deklarasi
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, totGaji;
        int gaji = 40000, potGaji = 25000;
        //input
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda: ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda: ");
        jmlTdkMasuk = input.nextInt();
        //eksekusi
        totGaji = (jmlMasuk*gaji) - (jmlTdkMasuk*potGaji);
        //output
        System.out.println("Gaji Yang Anda Terima Adalah: " + totGaji);
    }
}
