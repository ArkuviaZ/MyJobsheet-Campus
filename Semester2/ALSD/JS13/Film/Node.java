package Semester2.ALSD.JS13.Film;

public class Node {
    int idFilm;
    String judulFilm;
    double rating;
    Node prev;
    Node next;

    public Node(int idFilm, String judulFilm, double rating) {
        this.idFilm = idFilm;
        this.judulFilm = judulFilm;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}