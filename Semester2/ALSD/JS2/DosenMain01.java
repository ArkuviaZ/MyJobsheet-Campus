package Semester2.ALSD.JS2;

public class DosenMain01 {
    public static void main(String[] args) {
        Dosen01 ds1 = new Dosen01();
        ds1.idDosen = "MZA";
        ds1.nama = "Moch. Zawaruddin Abdullah, S.ST., M.Kom.";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2000;
        ds1.bidangKeahlian = "ALSD";

        ds1.tampilInformasi();
        System.out.println("====================================");
        ds1.ubahKeahlian("BD");
        System.out.println("====================================");
        ds1.tampilInformasi();
        System.out.println("====================================");
        System.out.printf("Jumlah Masa Kerja: %d Tahun %n", ds1.hitungMasaKerja(2025));

        Dosen01 ds2 = new Dosen01("AN", "Anissa Nabila", true, 2005, "ALSD");
        System.out.println("====================================");
        ds2.tampilInformasi();
        System.out.println("====================================");
        ds2.setStatusAktif(false);
        System.out.println("====================================");
        ds2.tampilInformasi();
    }
}
