public class AntrianKRS {
    MahasiswaJS10[] data;
    int front;
    int rear;
    int size;
    int max;
    int diprosesDPA;
    final int maksimalDPA = 30;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new MahasiswaJS10[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(MahasiswaJS10 dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = dt;
            size++;
        }
    }

    public MahasiswaJS10 Dequeue() {
        MahasiswaJS10 dt = null;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
        return dt;
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i=front; i<=front+1; i++){
                data[i].tampilkanData();
                if(front+1>rear){
                    break;
                }
            }
        }
    }

    public void LihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void tambahAntrian(MahasiswaJS10 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public MahasiswaJS10 layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        if (diprosesDPA >= maksimalDPA) {
            System.out.println("DPA telah memproses maksimal 30 mahasiswa.");
            return null;
        }
        MahasiswaJS10 mhs = data[front];
        front = (front + 1) % max;
        size--;
        diprosesDPA++; 
        System.out.println("Memproses: " + mhs.nama);
        return mhs;
    }

    public void jumlahDiproses() {
        System.out.println("Jumlah diproses: " + diprosesDPA);
    }

    public void jumlahBelumDiproses() {
        System.out.println("Jumlah mahasiswa belum memproses: " + (maksimalDPA - (rear-1 + diprosesDPA)));
    }
}