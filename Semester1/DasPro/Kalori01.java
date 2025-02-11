import java.util.Scanner; //import buat menggunakan scanner input

public class Kalori01{
    public static void main(String[] args) {
        //--------- deklarasi
        double  koLa = 0.05, //Koefisien Berlari
                koRe = 0.04, //Koefisien Berenang
                koSe = 0.03; //Koefisien Bersepeda
        double  //variable berlari
                kaLa, //kalori
                duLa, //durasi
                bBLa, //berat badan
                r2KLa, //rata-rata kecepatan
                keLa, //ketinggian
                //variable berenang
                kaRe, //kalori
                duRe, //durasi
                bBRe, //berat badan
                r2Kre, //rata-rata kecepatan
                keRe, //ketinggian
                //variable bersepeda
                kaSe, //kalori
                duSe, //durasi
                bBSe, //berat badan
                r2kSe, //rata-rata kecepatan
                keSe, //ketinggian
                //variable lainnya
                toDu, //total durasi
                target, 
                toKa, //total kalori
                rata2pMenit, // rata-rata per menit
                perPen; //persentase pencapaian
        Scanner input = new Scanner(System.in);

        //---------- input
        System.out.print("Masukkan Target Kalori: ");
        target = input.nextDouble();
        System.out.println("Selanjutnya Masukkan Nilai dengan Urutan 1. Berlari, 2. Berenang Dan 3. Bersepeda: ");
        //input berlari
        System.out.print("Masukkan durasi berlari: ");
        duLa = input.nextDouble();
        System.out.print("Masukkan Berat Badan berlari: ");
        bBLa = input.nextDouble();
        System.out.print("Masukkan Rata-rata Kecepatan berlari: ");
        r2KLa = input.nextDouble();
        System.out.print("Masukkan Ketinggian berlari: ");
        keLa = input.nextDouble();
        //input berenang
        System.out.print("Masukkan durasi berenang: ");
        duRe = input.nextDouble();
        System.out.print("Masukkan Berat Badan berenang: ");
        bBRe = input.nextDouble();
        System.out.print("Masukkan Rata-rata Kecepatan berenang: ");
        r2Kre = input.nextDouble();
        System.out.print("Masukkan Ketinggian berenang: ");
        keRe = input.nextDouble();
        //input bersepedah
        System.out.print("Masukkan durasi bersepedah: ");
        duSe = input.nextDouble();
        System.out.print("Masukkan Berat Badan bersepedah: ");
        bBSe = input.nextDouble();
        System.out.print("Masukkan Rata-rata Kecepatan bersepedah: ");
        r2kSe = input.nextDouble();
        System.out.print("Masukkan Ketinggian bersepedah: ");
        keSe = input.nextDouble();

        //-------- eksekusi
        //total masing-masing olahraga
        kaLa = (duLa*koLa*bBLa)+(r2KLa*0.5)+(keLa*0.01);
        kaRe = (duRe*koRe*bBRe)+(r2Kre*0.5)+(keRe*0.01);
        kaSe = (duSe*koSe*bBSe)+(r2kSe*0.5)+(keSe*0.01);
        //total semua kalori (cuma ditambah)
        toKa = kaLa+kaRe+kaSe;
        //rata kalori per menit (total kalori dibagi total durasi)
        toDu= (duLa+duRe+duSe); //mencari total durasi
        rata2pMenit = toKa/toDu;
        //persentase ketercapaian (total kalori dibagi target dikali 100)
        perPen = toKa/target*100;

        //--------- output
        //ouput total masing-masing kalori
        System.out.println("Total Kalori Masing Masing Olahraga adalah:\nBerlari: "+kaLa+" kaori,\nBerenang: "+kaRe+" kalori,\nBersepeda: "+kaSe+" kalori\n");
        //output jumlah kalori semua olahraga
        System.out.println("Total Kalori dari jumlah Semua Olahraga adalah: "+toKa+ "\n");
        //output rata rata per menit
        System.out.println("Rata per menitnya adalah: "+rata2pMenit+ "\n");
        //ouput persentase target
        System.out.println("Persentase dari Target anda adalah: "+perPen+" %");
    }
}