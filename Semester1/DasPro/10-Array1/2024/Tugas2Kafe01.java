import java.util.Scanner;

public class Tugas2Kafe01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Berapa jumlah pesanan? ");
        int n = in.nextInt();

        String arrNama[] = new String[n+1];
        int arrHarga[] = new int[n+1];
        int sum = 0;

        for (int i=1; i<=n; i++) {
            System.out.print("Masukkan nama makanan/minuman: ");
            arrNama[i] = in.next();
            System.out.print("Masukkan harga makanan/minuman: ");
            arrHarga[i] = in.nextInt();
            sum += arrHarga[i];
        }

        System.out.println();
        System.out.println("Berikut adalah daftar pesanan: ");

        for (int i=1; i<=n; i++) {
            System.out.println(i + ". " + arrNama[i]);
        }
        System.out.println("Total biaya semua pesanan: " + sum);
    }
}