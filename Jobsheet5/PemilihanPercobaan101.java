import java.util.Scanner;

public class PemilihanPercobaan101 {
    public static void main(String[] args) {
        //deklarasi
        Scanner input00 = new Scanner(System.in);
        //input
        System.out.print("Masukkan angka: ");
        int angka = input00.nextInt();
        //eksekusi
        if (angka % 2 == 0){
            System.err.println("Angka "+angka+" bilangan genap");
        }
        else {
            System.err.println("Angka " + angka + " bilangan genap");
        }
    }
}
