public class StackSurat01JS9 {
    Surat01JS9 [] surat;
    int top;
    int size;

    StackSurat01JS9 (int size) {
        this.size = size;
        surat = new Surat01JS9[size];
        top = -1;
    }

    public boolean isFull (){
        if (top == size-1){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty (){
        if (top == -1) {
            return true;
        }
        else{
            return false;
        }
    }

    //push
    public void TerimaSuratIzin (Surat01JS9 srt){
        if (!isFull()){
            top++;
            surat[top] = srt;
        }
        else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi. ");
        }
    }

    //pop
    public Surat01JS9 Prosess (){
        if (!isFull()){
            Surat01JS9 m = surat[top];
            top--;
            return m;
        }
        else {
            System.out.println("Surat kosong!");
            return null;
        }
    }

    //peek
    public Surat01JS9 LihatSuratIzinTerakhir (){
        if (!isEmpty()){
            return surat[top];
        }
        else {
            System.out.println("Kosong! Tidak ada Surat yang diterima");
            return null;
        }
    }

    //seacrh
    public Surat01JS9 CariSurat (String nm){
        for (int i=0; i<=size; i++){
            if (nm.equalsIgnoreCase(surat[i].namaMahasiswa)){
                return surat[i];
            }
        }
        return null;
    }
    
}
