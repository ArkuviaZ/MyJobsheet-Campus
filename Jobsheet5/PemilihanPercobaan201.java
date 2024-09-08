import java.util.Scanner;

public class PemilihanPercobaan201 {

    public static void main(String[] args) {
        //deklarasi
        Scanner input00 = new Scanner(System.in);
        //input 
        System.out.print("Nilai uas   : ");
        float uas = input00.nextInt();
        System.out.print("Nilai uts   : ");
        float uts = input00.nextInt();
        System.out.print("Nilai kuis  : ");
        float kuis = input00.nextInt();
        System.out.print("Nilai tugas : ");
        float tugas = input00.nextInt();
        //eksekusi
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        //kondisi 
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        //output
        System.out.println("Nilai akhir: "+total+" sehingga "+message);
    }
}
