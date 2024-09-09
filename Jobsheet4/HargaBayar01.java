import java.util.Scanner;

public class HargaBayar01 {
    public static void main(String[] args){
        //deklarasi
        Scanner input = new Scanner (System.in);
        int harga, jumlah;
        double dis = 0.1, total, bayar, jmlDis;
        //input
        System.out.println("Masukkan Harga Barang Yang Dibeli: ");
        harga = input.nextInt();
        System.out.println("Masukkan Jumlah Barang Yang Dibeli: ");
        jumlah  = input.nextInt();
        //eksekusi
        total = harga*jumlah;
        jmlDis = total*dis;
        bayar = total-jmlDis;
        //output
        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);
    }
}