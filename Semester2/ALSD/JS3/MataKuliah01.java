package Semester2.ALSD.JS3;

public class MataKuliah01 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public void tambahData(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void cetakinfo(MataKuliah01[] arrayOfMataKuliah){
        for(int i=0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMataKuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMataKuliah[i].nama);
            System.out.println("Sks        : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMataKuliah[i].jumlahJam);
            System.out.println("------------------------------");
        }
    }

    public MataKuliah01(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public MataKuliah01(){
    }
}
