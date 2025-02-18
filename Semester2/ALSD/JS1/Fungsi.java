public class Fungsi {
    //stok
    public static int stok[][] = {
        {10, 5, 15, 7},  //RoyalGarden1
        {6, 11, 9, 12},  //RoyalGarden2
        {2, 10, 10, 5},  //RoyalGarden3
        {5, 7, 12, 9}    //RoyalGarden4
    };
    public static String bunga[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    public static int harga[] = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        tPendapatan(); 
        tStok();       
    }

    //untuk menampilkan pendapatan
    public static void tPendapatan() {
        System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Terjual:");
        for (int i = 0; i < stok.length; i++) {
            int total = 0;
            for (int j = 0; j < stok[i].length; j++) {
                total += stok[i][j] * harga[j];
            }
            System.out.printf("RoyalGarden %d: Rp %,d\n", (i + 1), total);
        }
        System.out.println();
    }

    //untuk menampilkan jumlah stok 
    public static void tStok() {
        int total[] = new int[bunga.length];

        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                total[j] += stok[i][j];
            }
        }

        System.out.println("Total Stok Bunga di Semua Cabang:");
        for (int i = 0; i < bunga.length; i++) {
            System.out.printf("%s: %d", bunga[i], total[i]);
            System.out.println();
        }
    }
}
