import java.util.Scanner;

public class PemilihanPercobaan101 {
    public static void main(String[] args) {
        //deklarasi
        double angka1, angka2, hasil;
        char operator;
        Scanner input00 = new Scanner(System.in);
        //input
        System.out.print("Masukkan angka pertama: ");
        angka1 = input00.nextInt();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input00.nextInt();
        System.out.print("Masukkan oprator (+ - * /): ");
        operator = input00.next().charAt(0);
        //eksekusi
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
        }
    }
}
