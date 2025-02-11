import java.util.Scanner;

public class Percobaan2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;
        //System.out.print("Bilangan yang dihitung: "); bilangan = sc.nextInt();
        //System.out.print("Pangkat: "); pangkat = sc.nextInt();

        System.out.print(hitungPangkat(2, 5));
    }

    static int hitungPangkat(int x, int y){
        if (y==0){
            return 1;
        }
        else {
            System.out.printf("%dx", x);
            return (x*hitungPangkat(x, y-1));
        }
    }

}