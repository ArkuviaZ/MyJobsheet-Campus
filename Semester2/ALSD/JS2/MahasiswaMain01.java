package Semester2.ALSD.JS2;

public class MahasiswaMain01 {
    public static void main(String[] args) {
        Mahasiswa01 mhs1 = new Mahasiswa01();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.6);
        mhs1.tampilkanInformasi();

        Mahasiswa01 mhs2 = new Mahasiswa01("Anissa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa01 mhs3 = new Mahasiswa01("Abdul Ghofur Almiqbadi", "244107020155", 3.78, "TI 1A");
    }
}
