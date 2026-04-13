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
            System.out.println("6. Keluar");
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
                System.out.println("\nSetelah diurutkan (Denda terbesar): ");
                for (Peminjaman p : peminjaman) p.tampilPeminjaman();
                break;

            case 5:
                System.out.print("Masukkan NIM: ");
                String cari = sc.next();
                boolean ketemu = false;
                //Sequential Search
                for (Peminjaman p : peminjaman) {
                    if (p.mhs.nim.equals(cari)) {
                        p.tampilPeminjaman();
                        ketemu = true;
                    }
                }
                if (!ketemu) {
                    System.out.println("Data Tidak Ditemukan");
                }
                break;
            }

        } while (pilih != 6);
    }
}