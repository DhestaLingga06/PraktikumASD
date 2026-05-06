public class QueueLinkedList06 {
    
    NodeMahasiswa06 front;
    NodeMahasiswa06 rear;
    int size;
    int max;

    public QueueLinkedList06(int n) {
        max = n;
        size = 0;
        front = rear = null;
    }
    public boolean isEmpty() {
        return (front == null);
    }
    public boolean isFull() {
        return (size == max);
    }
    public void Enqueue(Mahasiswa06 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        NodeMahasiswa06 node = new NodeMahasiswa06(mhs, null);
        if (isEmpty()) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
        System.out.println("Mahasiswa masuk antrian");
    }
    public Mahasiswa06 Dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa06 data = front.data;
        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
        return data;
    }
    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            front.data.tampilInformasi();
        }
    }
    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang: ");
            rear.data.tampilInformasi();
        }
    }
    public void getJumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang mengantre: " + size);
    }
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        NodeMahasiswa06 temp = front;
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        while (temp != null) {
            temp.data.tampilInformasi();
            temp = temp.next;
        }
    }
    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }
}