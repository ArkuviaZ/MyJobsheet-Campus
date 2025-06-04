package Semester2.JS14.Tugas;

public class Mahasiswa01 {
    String nim;
    String nama;
    double ipk;

    public Mahasiswa01(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public double dptIpk() {
        return ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM: " + this.nim + " " +
        "Nama: " + this.nama + " " +
        "IPK: " + this.ipk);
    }
}
