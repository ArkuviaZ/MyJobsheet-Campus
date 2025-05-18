package Semester2.ALSD.JS12;

public class QueueLinkedListLayanan {
    NodeLayanan front;
    NodeLayanan rear;
    int size;
    final int max = 100;

    public QueueLinkedListLayanan() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(MahasiswaLayanan mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh!, tidak bisa menambah Mahasiswa baru.");
            return;
        }

        NodeLayanan newNode = new NodeLayanan(mhs, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.printf("MahasiswaLayanan %s berhasil ditambahkan ke antrian.", mhs.nama);
    }

    public MahasiswaLayanan dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!, tidak ada Mahasiswa yang bisa dipanggil.");
            return null;
        }

        MahasiswaLayanan mhs = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.printf("MahasiswaLayanan %s dipanggil untuk dilayani.", mhs.nama);
        return mhs;
    }

    public MahasiswaLayanan peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada Mahasiswa terdepan!");
            return null;
        }
        return front.data;
    }

    public MahasiswaLayanan peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada Mahasiswa terakhir!");
            return null;
        }
        return rear.data;
    }

    public void clear() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong!");
            return;
        }

        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    // Menampilkan isi antrian
    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("\nDaftar MahasiswaLayanan dalam Antrian:");
        System.out.println("--------------------------------");
        NodeLayanan current = front;
        int nomor = 1;

        while (current != null) {
            System.out.println("Nomor Antrian: " + nomor);
            current.data.tampilInformasi();
            current = current.next;
            nomor++;
        }
    }

    public int size() {
        return size;
    }
}