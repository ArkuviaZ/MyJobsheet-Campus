package Semester2.ALSD.JS2;

public class MataKuliahMain01 {
    public static void main(String[] args) {
            MataKuliah01 mk1 = new MataKuliah01();
            mk1.kodeMK = "BD";
            mk1.nama = "Basis Data";
            mk1.sks = 2;
            mk1.jumlahJam = 4;

            mk1.tampilkInformasi();
            System.out.println("====================================");
            mk1.tambahJam(2);
            mk1.ubahSKS(3);
            System.out.println("====================================");
            mk1.tampilkInformasi();

            MataKuliah01 mk2 = new MataKuliah01("ALSD", "Algoritma dan Struktur Data", 2, 4);
            System.out.println("====================================");
            mk2.tampilkInformasi();
            System.out.println("====================================");
            mk2.kurangiJam(2);
            mk2.ubahSKS(1);
            System.out.println("====================================");
            mk2.tampilkInformasi();
    }
}
