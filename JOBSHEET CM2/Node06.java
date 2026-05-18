public class Node06 {
    int noAntrian;
    Pembeli06 pembeli;
    Pesanan06 pesanan;
    Node06 prev;
    Node06 next;

    public Node06(Node06 prev, int noAntrian, Pembeli06 pembeli, Pesanan06 pesanan, Node06 next) {
        this.prev = prev;
        this.noAntrian = noAntrian;
        this.pembeli = pembeli;
        this.pesanan = pesanan;
        this.next = next;
    }
}