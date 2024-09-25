import java.util.Scanner;

public class PemilihanPercobaan101 {
    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        //eksekusi
        String x = (angka%2==0)? "Bilangan genap" : "Bilangan ganjil";

        // if (angka % 2 == 0){
        //     System.out.println("Angka " + angka + " termasuk bilangan genap");
        // }
        // else {
        //     System.out.println("Angka " + angka + " termasuk bilangan gajil");
        // }
        //ouput
        System.out.println("Angka " + angka + " termasuk " + x);
    }
}


