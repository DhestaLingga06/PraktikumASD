public class AntrianKRS {
    
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahKRS = 0;
    
    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void tambahAntrian(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambahkan mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }
    public void panggilKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2.");
            return;
        }
        System.out.println("Mahasiswa dipanggil KRS:");
        for (int i = 0; i < 2; i++) {
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            sudahKRS++;
        }
    }
    //Tampilkan semua Antrian
    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
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
    //Menampilkan 2  AntrianTerdepan
    public void lihatTerdepan() {
        if (size < 2) {
            System.out.println("Belum ada 2 Mahasiswa.");
            return;
        }
        data[front].tampilkanData();
        data[(front + 1) % max].tampilkanData();
    }
    //Menampilkan antrian paling akhir
    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling akhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
    //Cek Jumlah Antrian
    public void jumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }
    //Cetak yg sudah melakukan KRS
    public void jumlahSudahKRS() {
        System.out.println("Sudah KRS: " + sudahKRS);
    }
    // Belum KRS (Max DPA = 30)
    public void jumlahBelumKRS() {
        int maxDPA = 30;
        System.out.println("Belum KRS: " + (maxDPA - sudahKRS));
    }
    public void clear() {
        if (!IsEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian dikosongkan.");
        }
    }
}