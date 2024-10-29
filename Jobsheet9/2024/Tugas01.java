import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Masukkan nilai N");
        int N = sc.nextInt();
        //output
        for (int i=1; i<=N; i++){
            for (int j=1; j<=N; j++) {
                if (i==1 || i==N || j==1 || j==N){
                    System.err.print(N);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
