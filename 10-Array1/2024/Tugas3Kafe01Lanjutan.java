import java.util.Scanner;

public class Tugas3Kafe01Lanjutan{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar","Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan nama makanan yang anda cari: ");
        String key = in.nextLine();
        String hasil;
        boolean ada = false;

        for (int i=0 ; i<menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])){
                hasil = menu[i];
                ada = true;
                break;
            }
            System.out.println(menu[i]);
        }

        if(ada){
            System.out.println("Makanan yang anda cari yaitu "+key+" tersedia");
        }
        else{
            System.out.println("Mohon maaf makanan yang anda cari yaitu "+key+" tidak tersedia");
        }
    }
}