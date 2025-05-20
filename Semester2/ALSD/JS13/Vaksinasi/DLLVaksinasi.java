package Semester2.ALSD.JS13.Vaksinasi;

import java.util.Scanner;

public class DLLVaksinasi {
    Node head;
    int size;

    DLLVaksinasi() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int noAntrian, String nmPenerima) {
        Node newNode = new Node(noAntrian, nmPenerima);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int noAntrian, String nmPenerima) {
        Node newNode = new Node(noAntrian, nmPenerima);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
    }

    public void add(int index, int noAntrian, String nmPenerima) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        if (index == 0) {
            addFirst(noAntrian, nmPenerima);
        } else {
            Node newNode = new Node(noAntrian, nmPenerima);
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public String removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }
        String removedName = head.nmPenerima;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        size--;
        return removedName;
    }

    public String removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }
        if (head.next == null) {
            String removedName = head.nmPenerima;
            head = null;
            size--;
            return removedName;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            String removedName = current.next.nmPenerima;
            current.next = null;
            size--;
            return removedName;
        }
    }


    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.printf("|%s\t|%s\t|\n", current.noAntrian, current.nmPenerima);
            current = current.next;
        }
    }

    // menu
    public void tampilkanMenu() {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++++");
    }

    // penerima vaksin
    public void tambahPenerima(DLLVaksinasi antrian, Scanner scanner) {
        System.out.println("-------------------------------");
        System.out.println("Masukkan Data Penerima Vaksin");
        System.out.println("-------------------------------");
        System.out.print("Nomor Antrian: ");
        int noAntr = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nama Penerima: ");
        String nmaPenerima = scanner.nextLine();

        antrian.addLast(noAntr, nmaPenerima);
        System.out.println("\nData penerima vaksin berhasil ditambahkan.");
    }

    // hapus penerima vaksin 
    public void hapusPenerima(DLLVaksinasi antrian) {
        if (antrian.isEmpty()) {
            System.out.println("Belum ada data penerima vaksin.");
            return;
        }
        try {
            String nmaDihapus = antrian.removeFirst();
            System.out.println(nmaDihapus + " telah selesai divaksinasi.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menghapus: " + e.getMessage());
        }
    }

    // daftar penerima vaksin
    public void daftarPenerima(DLLVaksinasi antrian) {
        if (antrian.isEmpty()) {
            System.out.println("Belum ada data penerima vaksin.");
            return;
        }
        System.out.println("----------------------------------");
        System.out.println("Daftar Penerima Vaksin");
        System.out.println("----------------------------------");
        System.out.println("|No.\t|Nama\t|");
        System.out.println("------------------");
        antrian.printList();
        System.out.println("Sisa Antrian: " + antrian.size());
    }
}