//import java.util.Scanner;

public class Percobaan3 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int  saldoAwal, tahun=3;
        //System.out.print("Jumlah saldo Awal: "); saldoAwal = sc.nextInt();        
        //System.err.print("Lama investasi (tahun): "); tahun = sc.nextInt();

        //System.out.printf("Jumlah saldo setelah %d tahun: ", tahun);
        System.out.println(hitungLaba(123210.00000000003, 1));
    }

    static double hitungLaba (double saldo, int tahun){
        if (tahun==0){
            return (saldo);
        }
        else {
            return (1.11*hitungLaba(saldo, tahun-1));
        }
    }


}