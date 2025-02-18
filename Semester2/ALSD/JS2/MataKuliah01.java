package Semester2.ALSD.JS2;

public class MataKuliah01 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkInformasi(){
        System.out.printf("Kode Mata Kuliah: %s %n", kodeMK);
        System.out.printf("Nama Mata Kuliah: %s %n", nama);
        System.out.printf("SKS: %d %n", sks);
        System.out.printf("jumlahjam: %d %n", jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah berhasil diubah");
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam telah berhasil ditambah");
    }

    void kurangiJam(int jam) {
        if(jumlahJam>=jam){
            jumlahJam -= jam;
            System.out.println("Jumlah jam telah berhasil ditambah");
        }
        else{
            System.out.println("Jumlah jam kurang, pengurangan jam perlajaran gagal!");
        }
    }

    public MataKuliah01(){
    }

    public MataKuliah01(String koMK, String nm, int sks, int jmlhJam) {
        kodeMK = koMK;
        nama = nm;
        this.sks = sks;
        this.jumlahJam = jmlhJam;
    }
}



