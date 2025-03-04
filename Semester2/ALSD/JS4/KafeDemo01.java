public class KafeDemo01 {
    public static void main(String[] args) {
        Kafe01[] arrayKafe = new Kafe01[3];

        arrayKafe[0] = new Kafe01("Kopi Kenangan", "Jakarta", "08:00", "22:00", 5);
        arrayKafe[1] = new Kafe01("Kopi Senja", "Bandung", "09:00", "23:00", 4.7f);
        arrayKafe[2] = new Kafe01("Kopi Harapan", "Surabaya", "07:30", "21:30", 4.3f);

        System.out.println("=== Sebelum Diubah ===");
        arrayKafe[0].tampilkanInfoKafe();
        arrayKafe[1].tampilkanInfoKafe();
        arrayKafe[2].tampilkanInfoKafe();

        System.out.println("\n=== Sedang Diubah ===");
        arrayKafe[0].ubahJamBuka("07:30");
        arrayKafe[0].ubahJamTutup("23:00");
        arrayKafe[1].ubahRating(4);
        arrayKafe[2].ubahLokasi("Malang");

        System.out.println("\n=== Setelah Diubah ===");
        arrayKafe[0].tampilkanInfoKafe();
        arrayKafe[1].tampilkanInfoKafe();
        arrayKafe[2].tampilkanInfoKafe();
    }
}