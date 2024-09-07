public class ContohVariable01Tugas {
    public static void main(String[] args){
        String hoby = "Bermain Petak Umpet";
        boolean pandai = true;
        char jk = 'L';
        byte _umur = 19;
        double $ipk = 3.24, tinggi = 1.78;
        System.out.println(hoby);
        System.out.println("Apakah pandai? " + pandai);
        System.out.println("Jenis kelamin: " + jk);
        System.out.println("Umurku saat ini: " + _umur);
        System.out.println(String.format("Saya berisk %s , dengan tinggi badan %s", $ipk, tinggi));
    }
}