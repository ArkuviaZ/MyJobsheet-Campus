import java.util.Scanner;

public class Bank01 {
    public static void main(String[] args){
        //deklarasi
        Scanner sc = new Scanner(System.in);
        int jml_tabungan_awal, lama_menabung;
        double presentase_bunga = 0.02, bunga, jml_tabungan_akhir;
        //input
        System.out.println("masukkan jumlah tabungan awal anda: ");
        jml_tabungan_awal = sc.nextInt();
        System.out.println("masukkan lama menabung anda: ");
        lama_menabung= sc.nextInt();
        //eksekusi
        bunga = lama_menabung*presentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir = bunga+jml_tabungan_awal;
        //output
        System.out.println("Bunga adalah " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);
    }
}


