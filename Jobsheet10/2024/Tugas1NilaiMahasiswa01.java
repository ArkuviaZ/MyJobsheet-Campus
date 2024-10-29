import java.util.Scanner;

public class Tugas1NilaiMahasiswa01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan total mahasiswa: "); 
        int n = in.nextInt();

        int arrMhs[] = new int [n+1];
        int sum = 0, nTinggi = 0, nRendah = 100;

        System.out.println("---------------------------");

        for (int i=1; i<arrMhs.length; i++) {

            System.out.print("Masukkan nilai mahasiswa ke-"+i+": ");
            arrMhs[i] = in.nextInt();

            if (nTinggi < arrMhs[i]){
                nTinggi = arrMhs[i];
            }
            else if (nRendah > arrMhs[i]){
                nRendah = arrMhs[i];
            }

            sum += arrMhs[i];
        }

        double rata2 = sum/arrMhs.length;

        System.out.println();
        System.out.println("Berikut adalah nilai-nilai mahasiswa: ");

        for (int i=1; i<arrMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-"+i+" adalah: "+arrMhs[i]);
        }
        
        System.out.println("---------------------------");
        System.out.println("Nilai rata-ratanya adalah: "+rata2);
        System.out.println("Nilai tertingginya adalah: "+nTinggi);
        System.out.print("Nilai terendahnya adalah: "+nRendah);
    }
}