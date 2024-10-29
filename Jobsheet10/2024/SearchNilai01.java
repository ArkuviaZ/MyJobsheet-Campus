public class SearchNilai01 {
    public static void main(String[] args) {
        //deklarasi
        int arrayNilai[] = {80, 85, 78, 96, 90, 82, 86};
        int key = 90;
        int hasil = 0;
        //eksekusi
        for (int i = 0; i < arrayNilai.length; i++) {
            if (arrayNilai[i]==key){
                hasil = i;
                break;
            }
        }
        //output
        System.out.println();
        System.out.println("Nilai "+key+" ketemu di indeks ke-"+hasil);
        System.out.println();
    }
}
