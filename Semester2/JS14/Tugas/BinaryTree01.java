package Semester2.JS14.Tugas;

public class BinaryTree01 {
    Node01 root;

    public BinaryTree01() {
        this.root = null;
    }

    //menambahkan mahasiswa
    public void addRekursif(Node01 node, Mahasiswa01 data) {
        if (node == null) {
            node = new Node01(data);
            if (this.root == null) {
                this.root = node;
            }
        } else if (data.dptIpk() < node.data.dptIpk()) {
            if (node.left == null) {
                node.left = new Node01(data);
            } else {
                addRekursif(node.left, data);
            }
        } else {
            if (node.right == null) {
                node.right = new Node01(data);
            } else {
                addRekursif(node.right, data);
            }
        }
    }

    //cari IPK terkecil
    public Mahasiswa01 cariMinIPK(Node01 node) {
        if (node == null) {
            System.out.println("Tree Kosong");
            return null;  
        }
        
        while (node.left != null) {
            node = node.left; 
        }
        return node.data; 
    }

    //cari IPK terbesar
    public Mahasiswa01 cariMaxIPK(Node01 node) {
        if (node == null) {
            System.out.println("Tree is empty");
            return null;
        }

        while (node.right != null) {
            node = node.right; 
        }
        return node.data; 
    }

    //tampilkan IPK di atas batas tertentu
    public void tampilMahasiswaIPKdiAtas(Node01 node, double ipkBatas) {
        if (node == null) {
            return;
        }
        if (node.data.dptIpk() > ipkBatas) {
            System.out.println(node.data.nama + " dengan IPK: " + node.data.dptIpk());
        }
        tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
        tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
    }
}
