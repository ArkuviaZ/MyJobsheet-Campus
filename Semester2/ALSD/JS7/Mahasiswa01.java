public class Mahasiswa01 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa01() {
    }

    public Mahasiswa01(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampillnformasi() {
        System.out.printf("NIM: %s %n", nim);
        System.out.printf("Nama: %s %n", nama);
        System.out.printf("Kelas: %s %n", kelas);
        System.out.printf("IPK: %s %n", ipk);
    }
}