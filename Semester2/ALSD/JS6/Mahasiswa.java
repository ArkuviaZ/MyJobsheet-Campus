public class Mahasiswa {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa() {
    }

    Mahasiswa(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public Mahasiswa(String string, String string2, String string3) {
        //TODO Auto-generated constructor stub
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    public void tampilMahasiswa() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tampilMahasiswa'");
    }

    public void tampilkanData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tampilkanData'");
    }
}