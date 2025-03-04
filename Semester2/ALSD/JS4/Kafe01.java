public class Kafe01 {
    //============= Atribut =============
    String nama;
    String lokasi;
    String jamBuka;
    String jamTutup;
    float rating;

    //============= Method =============
    public void tampilkanInfoKafe() {
        System.out.println("======= KAFE =======");
        System.out.printf("Nama     : %s %n", nama);
        System.out.printf("Lokasi   : %s %n", lokasi);
        System.out.printf("Jam Buka : %s %n", jamBuka);
        System.out.printf("Jam Tutup: %s %n", jamTutup);
        System.out.printf("Rating   : %.2f %n", rating);
        System.out.println("====================");
    }
    public void ubahJamBuka(String jamBaru) {
        this.jamBuka = jamBaru;
        System.out.printf("Jam buka pada kafe %s telah diubah menjadi: %s %n", this.nama, jamBuka);
    }
    public void ubahJamTutup(String jamTutup) {
        this.jamTutup = jamTutup;
        System.out.printf("Jam tutup pada kafe %s telah diubah menjadi: %s %n", this.nama, jamTutup);
    }
    public void ubahLokasi(String lokasiBaru) {
        this.lokasi = lokasiBaru;
        System.out.printf("Lokasi pada kafe %s telah diubah menjadi: %s %n", this.nama, lokasi);
    }
    public void ubahRating(float ratingBaru) {
        this.rating = ratingBaru;
        System.out.printf("Rating pada kafe %s telah diubah menjadi: %.2f %n", this.nama, rating);
    }

    //============= Konstraktor =============
    public Kafe01(String nama, String lokasi, String jamBuka, String jamTutup, float rating) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.jamBuka = jamBuka;
        this.jamTutup = jamTutup;
        this.rating = rating;
    }
    public Kafe01(){
    }
}
