import java.util.Scanner;

public class Square01 {
    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Masukkan nilai N");
        int N = sc.nextInt();
        //output
        for (int i=1; i<=N; i++){
            for (int j=1; j<=N; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
