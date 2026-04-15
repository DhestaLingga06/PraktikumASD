import java.util.Scanner;
public class MainCM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = { 
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")};

        Buku[] buku = {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024)};

        Peminjaman[] peminjaman = {
            new Peminjaman(mhs[0], buku[0], 7),
            new Peminjaman(mhs[1], buku[1], 3),
            new Peminjaman(mhs[2], buku[2], 10),
            new Peminjaman(mhs[2], buku[3], 6),
            new Peminjaman(mhs[0], buku[1], 4)};
        
        int pilih;
        do {
            System.out.println("\n===== SISTEM PEMINJAMAN RUANG BACA JTI =====");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("6. Tambah Data Peminjaman Baru");
            System.out.println("7. Tampilkan Statistik");
            System.out.println("8. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
        
        switch (pilih) {
            case 1:
                System.out.println("\nDaftar Mahasiswa: ");
                for (Mahasiswa m : mhs) m.tampilMahasiswa();
                break;
            
            case 2:
                System.out.println("\nDaftar Buku: ");
                for (Buku b : buku) b.tampilBuku();
                break;
            
            case 3:
                System.out.println("\nData Peminjaman: ");
                for (Peminjaman p : peminjaman) p.tampilPeminjaman();
                break;

            case 4:
                // Insertion Sort 
                for (int i = 1; i < peminjaman.length; i++) {
                    Peminjaman temp = peminjaman[i];
                    int j = i - 1;

                    while (j >= 0 && peminjaman[j].denda < temp.denda) {
                        peminjaman[j + 1] = peminjaman[j];
                        j--;
                    }
                    peminjaman[j + 1] = temp;
                }
                System.out.println("\nSetelah diurutkan dengan Insertion Sort (Denda terbesar): ");
                for (Peminjaman p : peminjaman) p.tampilPeminjaman();
                break;

            case 5:
                System.out.print("Masukkan NIM: ");
                String cari = sc.next();

                for (int i = 0; i < peminjaman.length - 1; i++) {
                    for (int j = 0; j < peminjaman.length - i - 1; j++) {
                        if (peminjaman[j].mhs.nim.compareTo(peminjaman[j + 1].mhs.nim) > 0) {
                            Peminjaman temp = peminjaman[j];
                            peminjaman[j] = peminjaman[j + 1];
                            peminjaman[j + 1] = temp;
                        }
                    }
                }
                int idx = findBinarySearch(peminjaman, cari, 0, peminjaman.length - 1);

                if (idx != -1) {
                    System.out.println("[Binary Search] Data ditemukan:");
                    int i = idx;
        
                    while (i >= 0 && peminjaman[i].mhs.nim.equals(cari)) i--;
                    i++;

                    while (i < peminjaman.length && peminjaman[i].mhs.nim.equals(cari)) {
                    peminjaman[i].tampilPeminjaman();
                    i++;
                }

            } else {
                System.out.println("Data tidak ditemukan!");
            }
            break;

            case 6:
                sc.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = sc.nextLine();
                Mahasiswa mhsKetemu = null;
                for (int i = 0; i < mhs.length; i++) {
                    if (mhs[i].nim.equals(nim)) {
                    mhsKetemu = mhs[i];
                    }
                }   
                if (mhsKetemu == null) {
                System.out.println("NIM tidak ditemukan!");
                break;
                }

                System.out.print("Masukkan Kode Buku: ");
                String kode = sc.nextLine();
                Buku bukuKetemu = null;
                for (int i = 0; i < buku.length; i++) {
                if (buku[i].kodeBuku.equals(kode)) {
                    bukuKetemu = buku[i];
                    }
                }

                if (bukuKetemu == null) {
                System.out.println("Kode buku tidak ditemukan!");
                break;
                }

                System.out.print("Masukkan Lama Pinjam: ");
                int lama = sc.nextInt();
                Peminjaman pBaru = new Peminjaman(mhsKetemu, bukuKetemu, lama);
                pBaru.hitungDenda();
                Peminjaman[] baru = new Peminjaman[peminjaman.length + 1];
                for (int i = 0; i < peminjaman.length; i++) {
                baru[i] = peminjaman[i];
                }
                
                baru[peminjaman.length] = pBaru;
                peminjaman = baru;
                System.out.println("Data peminjaman berhasil ditambahkan!");
                break;

            case 7: 
                int total = 0, terlambat = 0, tepat = 0;

                for(Peminjaman p : peminjaman) {
                    total += p.denda;
                    if (p.denda > 0) terlambat ++;
                        else tepat ++;
                    }
                System.out.println("==== STATISTIK PEMINJAMAN ===== ");
                System.out.print("Total Denda Keseluruhan: " + total);
                System.out.println("\nJumlah Peminjaman Terlambat: " + terlambat);
                System.out.print("Jumlah Peminjaman Tepat Waktu: " + tepat);
                break;
            }
        } while (pilih != 8);
    } 
    
    static int findBinarySearch(Peminjaman[] data, String cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (cari.equals(data[mid].mhs.nim)) {
                return mid;
            } else if (data[mid].mhs.nim.compareTo(cari) < 0) {
                return findBinarySearch(data, cari, mid + 1, right);
            } else {
                return findBinarySearch(data, cari, left, mid - 1);
            }
        }
        return -1;
    }
}