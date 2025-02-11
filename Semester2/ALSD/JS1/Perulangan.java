import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nim;

        System.out.print("Masukkan NIM: "); nim = in.nextLine();
        String duaDaTe = nim.substring(nim.length() - 2); //mencari 2 digit terakhir
        int duaDT = Integer.parseInt(duaDaTe);
        for (int i=1; i<=duaDT; i++){
            if (i%2==1) {
        System.out.print("*");
            }
            else if (i==6 || i==10) {
                System.out.print("*");
            }
            else{
                System.out.print(i);
            }
            System.out.print(" ");
        }

    }
}

