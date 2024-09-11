
import java.util.Scanner;
import javax.xml.crypto.Data;

public class ArrayDua01 {
    public static void main(String[] args) {
        //deklarasi
        Scanner scan = new Scanner(System.in);
        int data[][] = new int[4][4];
        int jam[] = {3, 6, 9, 12};
        int min[] = {100, 100, 100, 100};
        double total[] = {0, 0, 0, 0};
        double rata[] = {0, 0, 0, 0};
        //deklarasi
        for(int i=0; i<data.length; i++){
            System.out.printf("Jam %s\n", jam[i]);
            for(int j = 0; j < data[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Masukkan suhu: ");
                        data[i][j] = scan.nextInt();
                        break;
                        if(min[j] > data[i][j]){
                            min[j]=data[i][j];
                        }
                    case 1:
                        System.out.print("Masukkan kelembapan: ");
                        data[i][j] = scan.nextInt();
                        break;
                    case 2:
                        System.out.print("Masukkan kecepatan angin: ");
                        data[i][j] = scan.nextInt();
                        break;
                    case 3:
                        System.out.print("Masukkan index UV: ");
                        data[i][j] = scan.nextInt();
                        break;
                }
            }
        }
    }
}
