public class StackTugasMahasiswa01JS9 {
    Mahasiswa01JS9 [] stack;
    int top;
    int size;

    StackTugasMahasiswa01JS9 (int size) {
        this.size = size;
        stack = new Mahasiswa01JS9[size];
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

    public void push (Mahasiswa01JS9 mhs){
        if (!isFull()){
            top++;
            stack[top] = mhs;
        }
        else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi. ");
        }
    }

    public Mahasiswa01JS9 pop (){
        if (!isFull()){
            Mahasiswa01JS9 m = stack[top];
            top--;
            return m;
        }
        else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa01JS9 peek (){
        if (!isEmpty()){
            return stack[top];
        }
        else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public Mahasiswa01JS9 peekBawah (){
        if (!isEmpty()){
            return stack[0];
        }
        else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print (){
        for (int i=top; i<=0; i++) {
            System.out.printf("%s\t%s\t%s%n", stack[i].nama, stack[i].nim, stack[i].kelas);
        }
        System.out.println("");
    }

    // Konversi Nilai Tugas ke Biner 

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi stack = new StackKonversi();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public int jumlah(){
        int x=0;
        for (int i=0; i<=top; i++){
            x++;
        }
        return x;
    }

}
