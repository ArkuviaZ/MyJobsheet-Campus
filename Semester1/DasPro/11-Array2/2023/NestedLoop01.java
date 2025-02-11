import java.util.Scanner;

public class NestedLoop01 {
    public static void main(String[] args) {
        //deklarasi
        Scanner scanner = new Scanner(System.in);
        int[][] temps = new int[5][7];
        //eksekusi
        for (int i=0; i<temps.length; i++){
            System.out.println("Kota ke-"+i);
            for (int j = 0; j < temps.length; j++) {
                System.out.println("Hari ke-" + (j+1)+": ");
                temps[i][j] = (int) scanner.nextDouble();
            }
            System.out.println();
        }
        /*
        System.out.println("=======================");
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + ": ");
            for (int j = 0; j < temps.length; j++) {
                System.out.println("Hari ke-" + j);
                temps[i][j] = (int) scanner.nextDouble();
            }
            System.out.println();
        }
        */
    }
}

