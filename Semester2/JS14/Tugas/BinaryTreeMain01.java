package Semester2.JS14.Tugas;

public class BinaryTreeMain01 {
    public static void main(String[] args) {
        Mahasiswa01 mhs1 = new Mahasiswa01("244160121", "Ali", 3.57);
        Mahasiswa01 mhs2 = new Mahasiswa01("244160185", "Candra", 3.41);
        Mahasiswa01 mhs3 = new Mahasiswa01("244160221", "Badar", 3.75);
        Mahasiswa01 mhs4 = new Mahasiswa01("244160220", "Dewi", 3.35);

        BinaryTree01 tree = new BinaryTree01();
        tree.addRekursif(tree.root, mhs1);
        tree.addRekursif(tree.root, mhs2);
        tree.addRekursif(tree.root, mhs3);
        tree.addRekursif(tree.root, mhs4);

        Mahasiswa01 minMahasiswa = tree.cariMinIPK(tree.root);
        if (minMahasiswa != null) {
            System.out.println("IPK Terendah: " + minMahasiswa.dptIpk());
        } else {
            System.out.println("Tree Kosong, Tidak bisa mencari IPK terendah.");
        }

        Mahasiswa01 maxMahasiswa = tree.cariMaxIPK(tree.root);
        if (maxMahasiswa != null) {
            System.out.println("IPK Tertinggi: " + maxMahasiswa.dptIpk());
        } else {
            System.out.println("Tree Kosong,, Tidak bisa mencari IPK tertinggi.");
        }

        System.out.println("Mahasiswa dengan IPK di atas 3.50:");
        tree.tampilMahasiswaIPKdiAtas(tree.root, 3.50);
    }
}

