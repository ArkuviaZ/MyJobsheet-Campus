import java.util.Scanner;

public class ForKelipatan01 {

    public static void main(String[] args) {
        //deklarasi
        Scanner scan = new Scanner(System.in);
        int kelipatan, total = 0, counter = 0;
        //input
        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();
        //eksekusi
        for (int i=1; i<=50; i++){
            if (i%kelipatan==0) {
                total += i;
                counter++;
            }
        }
        //output
        System.out.printf("Banyak bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipada %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
    }
}
