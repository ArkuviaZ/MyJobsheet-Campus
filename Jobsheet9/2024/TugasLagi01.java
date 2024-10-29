import java.util.Scanner;

public class TugasLagi01 {
    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        String  cabangOlahraga, atlet;
        //input & output
        for (int i=1; i<=4; i++){
            System.out.println("Informasi Nama Atlet dari cabor ");
            cabangOlahraga = sc.nextLine();
            for (int j=1; j<=5; j++) {
                System.out.println("Nama Atlet "+j+": ");
                atlet = sc.nextLine();
            }
        }
    }
}
