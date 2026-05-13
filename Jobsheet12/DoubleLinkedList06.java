public class DoubleLinkedList06 {
    Node06 head;
    Node06 tail;

    public DoubleLinkedList06() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(Mahasiswa06 data) {
        Node06 newNode06 = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode06;
        } else {
            newNode06.next = head;
            head.prev = newNode06;
            head = newNode06;
        }
    }
    public void addLast(Mahasiswa06 data) {
        Node06 newNode06 = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode06;
        } else {
            tail.next = newNode06;
            newNode06.prev = tail;
            tail = newNode06;
        }
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node06 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("Data berhasil dihapus.");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("Data berhasil dihapus.");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
    public void insertAfter(String keyNim, Mahasiswa06 data) {
        Node06 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node06 newNode06 = new Node06(data);

        //Jika current adalah tail, node baru ditambahkan di akhir
        if(current == tail) {
            newNode06.prev = current;
            current.next = newNode06;
            tail = newNode06;
        } else { //Node baru disisipkan di tengah
            newNode06.prev = current;
            newNode06.next = current.next;
            current.next.prev = newNode06;
            current.next = newNode06;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node06 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        } 
    }
}