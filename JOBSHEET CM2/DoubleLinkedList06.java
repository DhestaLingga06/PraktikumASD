public class DoubleLinkedList06 {
    
    Node06 head;
    Node06 tail;
    Node06 headPesanan;
    Node06 tailPesanan;
    int noAntrian = 1;

    public DoubleLinkedList06() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void tambahLaporan(Pesanan06 pesanan) {
        Node06 newNode = new Node06(null, 0, null, pesanan, null);
        if (headPesanan == null) {
            headPesanan = tailPesanan = newNode;
        } else {
            tailPesanan.next = newNode;
            newNode.prev = tailPesanan;
            tailPesanan = newNode;
        }
    }
    //Tambah Antrian
    public void tambahAntrian(Pembeli06 pembeli) {
        Node06 newNode = new Node06(null, noAntrian++, pembeli, null, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + newNode.noAntrian);
    }
    //Cetak Antrian
    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }

        Node06 current = head;
        System.out.println("=============================");
        System.out.println("DAFTAR ANTRIAN PEMBELI");
        System.out.println("=============================");
        System.out.printf("%-12s %-15s %-15s\n", "No Antrian ", "Nama ", "No HP ");
        while (current != null) {
            System.out.printf("%-12d %-15s %-15s\n", current.noAntrian, 
            current.pembeli.namaPembeli, current.pembeli.noHp);
            current = current.next;
        }
    }
    //Hapus Antrian dan Pesan
    public void removeAntrian(Pesanan06 pesanan) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
            return;
        }
        Node06 current = head;
        System.out.println("No.Antrian " + current.noAntrian + " - " + 
        current.pembeli.namaPembeli + " telah memesan " + pesanan.namaPesanan);
        tambahLaporan(pesanan);
        if (head != tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    //Sorting Pesanan
    public void sortingPesanan() {
        if (headPesanan == null) return;
        boolean berubah;
        do {
            berubah = false;
            Node06 current = headPesanan;
            while (current.next != null) {
                if (current.pesanan.namaPesanan.compareToIgnoreCase(
                    current.next.pesanan.namaPesanan) > 0) {
                    Pesanan06 temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;
                    berubah = true;
                }
                current = current.next;
            }
        } while (berubah);
    }
    //Laporan Pesanan
    public void laporanPesanan() {
        
        sortingPesanan();
        Node06 current = headPesanan;
        boolean addData = false;
        int totalPendapatan = 0;
        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-15s %-18s %-10s\n","Kode Pesanan","Nama Pesanan","Harga");
        while (current != null) {
            if (current.pesanan != null) {
                addData = true;
                System.out.printf("%-15d %-18s %-10d\n",current.pesanan.kodePesanan,
                current.pesanan.namaPesanan,current.pesanan.harga);
                totalPendapatan += current.pesanan.harga;
            }
            current = current.next;
        }
        if (!addData) {
            System.out.println("Belum ada pesanan");
        } else {
            System.out.println("================================");
            System.out.println("Total Pendapatan : Rp " + totalPendapatan);
        }
    }
    // Hapus Pesanan Berdasarkan Kode
    public void hapusPesanan(int kodePesanan) {
        if (headPesanan == null) {
            System.out.println("Data pesanan kosong");
            return;
        }
        Node06 current = headPesanan;
        while (current != null) {
            if (current.pesanan.kodePesanan == kodePesanan) {
                if (current == headPesanan) {
                    headPesanan = current.next;
                    if (headPesanan != null) {
                        headPesanan.prev = null;
                    } else {
                        tailPesanan = null;
                    }
                } else if (current == tailPesanan) {
                    tailPesanan = tailPesanan.prev;
                    tailPesanan.next = null;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            System.out.println("Pesanan berhasil dihapus");
            return;
            }
            current = current.next;
        }
        System.out.println("Kode pesanan tidak ditemukan");
    }
    // Cari Pembeli
    public void cariPembeli(String nama) {
        Node06 current = head;
        while (current != null) {
            if (current.pembeli.namaPembeli.equalsIgnoreCase(nama)) {
                System.out.println("Pembeli ditemukan");
                System.out.println("No Antrian : " + current.noAntrian);
                System.out.println("Nama       : " + current.pembeli.namaPembeli);
                System.out.println("No HP      : " + current.pembeli.noHp);
                return;
            }
            current = current.next;
        }
        System.out.println("Pembeli tidak ditemukan");
    }
    //Mengurutkan Antrian berdasarkan nama
    public void sortAntrian() {
        if (head == null) {
            return;
        }
        boolean tukar;
        do {
            tukar = false;
            Node06 current = head;
            while (current.next != null) {
                if (current.pembeli.namaPembeli.compareToIgnoreCase(
                    current.next.pembeli.namaPembeli) > 0) {
                    Pembeli06 tempPembeli = current.pembeli;
                    current.pembeli = current.next.pembeli;
                    current.next.pembeli = tempPembeli;
                    int tempNo = current.noAntrian;
                    current.noAntrian = current.next.noAntrian;
                    current.next.noAntrian = tempNo;
                    tukar = true;
                }
                current = current.next;
            }
        } while (tukar);
         System.out.println("Antrian berhasil diurutkan");
    }    
}