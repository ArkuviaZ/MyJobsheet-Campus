public class PengunjungCafe01{
    public static void daftarPengunjung (String... namaPengunjung, String... mediaPmbayaran){
        System.out.println("Daftar Nama Pengunjung:");
        for (String i : namaPengunjung) {
            System.out.println("-" + i);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("adit", "sopo", "jarwo");
    }
}