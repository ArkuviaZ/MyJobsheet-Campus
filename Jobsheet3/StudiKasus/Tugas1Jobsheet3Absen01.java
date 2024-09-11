import java.util.Scanner;

public class Tugas1Jobsheet3Absen01 {
    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        double penggunaanListik, totalTagihan, tarifListrik=1500;
        //input
        System.out.print("Masukkan penggunaan listrik (kWh): ");
        penggunaanListik = sc.nextInt();
        //eksekusi + output
        totalTagihan = penggunaanListik*tarifListrik;
        if (penggunaanListik>500){
            System.out.print("Total tagihanmu: " + totalTagihan + "\nKamu telah melebihi batas 500 kWh");
        }
        else {
            System.out.print("Total tagihanmu: " + totalTagihan + "\nKamu berada dibawah batas 500 kWh");
        }
    }
}
