import java.util.Scanner;

public class Triangle01 {
    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        int i=0;
        //input
        System.out.print("Masukkan nilai N");
        int N = sc.nextInt();
        //output
        while(i<=N){
            int j=0;
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
