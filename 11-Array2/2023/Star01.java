import java.util.Scanner;

public class Star01 {
    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Masukkan Nilai N =");
        int N = sc.nextInt();
        //eksekusi
        for(int i=1; i<=N; i++){
            System.out.print("*");
        }
    }
}
