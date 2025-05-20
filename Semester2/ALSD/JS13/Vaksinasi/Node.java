package Semester2.ALSD.JS13.Vaksinasi;

public class Node {
    int noAntrian;
    String nmPenerima;
    Node prev;
    Node next;

    public Node(int noAntrian, String nmPenerima) {
        this.noAntrian = noAntrian;
        this.nmPenerima = nmPenerima;
        this.prev = null;
        this.next = null;
    }
}