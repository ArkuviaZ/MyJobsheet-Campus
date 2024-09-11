import java.util.Scanner;

public class Segitiga01 {
    public static void main(String[] args){
        //deklarasi
        Scanner sc = new Scanner(System.in);
        int alas, tinggi;
        float luas;
        //input
        System.out.println("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.println("Masukkan tinggi: ");
        tinggi = sc.nextInt();
        //eksekusi
        luas = alas*tinggi/2;
        //output
        System.out.println("Luas Segitiga: " + luas);
    }
}