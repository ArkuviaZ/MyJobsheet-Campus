import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Pangkat[] p = new Pangkat[elemen];
        for(int i=0; i<elemen; i++){
            System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+": ");
            int nilai = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = input.nextInt();
            p[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for(int x=0; x<elemen; x++){
            System.out.println(p[x].nilai+"^"+p[x].pangkat+" = "+p[x].pangkatBF(p[x].nilai, p[x].pangkat));
        }

        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for(int x=0; x<elemen; x++){
            System.out.println(p[x].nilai+"^"+p[x].pangkat+" = "+p[x].pangkatDC(p[x].nilai, p[x].pangkat));
        }
    }
}
