import java.util.Scanner;

public class Lingkaran01 {
    public static void main(String[] args){
        //deklarasi
        Scanner input = new Scanner(System.in);
        int r;
        double keliling, luas;
        //input
        System.out.println("Masukkan Jari-Jari Lingkaran: ");
        r = input.nextInt();
        //eksekusi
        keliling = 2*3.14*r;
        luas = 3.14*r*r;
        //output
        System.out.println(keliling);
        System.out.println(luas);
    }
}