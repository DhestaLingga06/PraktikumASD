import java.util.Scanner;
public class MainQueueLinkedList06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int kapasitas = sc.nextInt();
        sc.nextLine();
        QueueLinkedList06 antrian = new QueueLinkedList06(kapasitas);
        int pilih;
        do {
            System.out.println("\n=== MENU ANTRIAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Lihat Antrian Terdepan");
            System.out.println("6. Lihat Antrian Paling Akhir");
            System.out.println("7. Lihat Jumlah Antrian");
            System.out.println("8. Tampilkan Semua Antrian");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK : ");
                    double ipk = sc.nextDouble();

                    Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas,ipk);
                    antrian.Enqueue(mhs);
                    break;

                case 2:
                    Mahasiswa06 keluar = antrian.Dequeue();
                    if (keluar != null) {
                        System.out.println("Mahasiswa dipanggil:");
                        keluar.tampilInformasi();
                    }
                    break;
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;

                case 4:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian belum penuh.");
                    }
                    break;

                case 5:
                    antrian.lihatTerdepan();
                    break;

                case 6:
                    antrian.lihatAkhir();
                    break;

                case 7:
                    antrian.getJumlahAntrian();
                    break;

                case 8:
                    antrian.tampilkanSemua();
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilih != 0);
        sc.close();
    }
}