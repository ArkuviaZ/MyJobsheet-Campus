import java.util.Scanner;

public class Square01 {
    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Masukkan Nilai N =");
        int N = sc.nextInt();
        //eksekusi
        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int i = 1; i <= N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
