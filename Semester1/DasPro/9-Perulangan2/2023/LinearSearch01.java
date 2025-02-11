public class LinearSearch01 {
    public static void main(String[] args) {
        //deklarasi
        int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key = 20;
        int hasil = 0;
        //eksekusi
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i]==key){
                hasil = i;
                break;
            }
        }
        //output
        System.out.println("Key ada dalam array pada posisi indek ke-"+hasil);
    }
}
