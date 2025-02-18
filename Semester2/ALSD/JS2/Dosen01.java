package Semester2.ALSD.JS2;

public class Dosen01 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi(){
        System.out.printf("ID Dosen: %s %n", idDosen);
        System.out.printf("Nama Dosen: %s %n", nama);
        System.out.printf("Status Aktif: %s %n", statusAktif?"Aktif":"Tidak Aktif");
        System.out.printf("Tahun Bergabung: %d %n", tahunBergabung);
        System.out.printf("Bidang Keahlian: %s %n", bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status berhasil diset");
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Keahlian berhasil diubah");
    }

    public Dosen01(){
    }

    public Dosen01(String id, String nm, boolean st, int thnBergabung,String bdngKeahlian) {
        idDosen = id;
        nama = nm;
        statusAktif = st;
        this.tahunBergabung = thnBergabung;
        bidangKeahlian = bdngKeahlian;
    }
}



