import java.util.Scanner;


public class Tugas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah angka yang ingin dihitung (N): "); int n = sc.nextInt();
        int kumpulan[] = new int[4];
        //System.out.print(hitung(100, kumpulan));

        input(kumpulan);
        System.out.printf("Total dari %d angka yang dimaksudkan adalah: %d", n, penjumlahanArray(kumpulan));
    }

    //________________________________________________________________________

    static void input (int kumpulan[]){
        Scanner sc = new Scanner(System.in);
        for (int i = kumpulan.length; i>0; i--) {
            System.out.printf("Masukkan angka ke-%d: ", i);
            kumpulan[(i-1)] = sc.nextInt();
        }
    }
    
    static int hitung(int n, int kumpulan[]){
        if(n==0){
            return (1);
        }
        else {
            return (kumpulan[n]+hitung(n-1, kumpulan));
        }
    }
}