import java.util.Scanner;
public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilih;

        do {
            System.out.println("\n=== ANTRIAN KRS DPA ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Paling Belakang");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Sudah KRS");
            System.out.println("8. Jumlah Belum KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM    : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama   : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi  : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas  : ");
                    String kelas = sc.nextLine();
                    Mahasiswa m = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(m);
                    break;
                case 2:
                    antrian.panggilKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6: 
                    antrian.jumlahAntrian();
                    break;
                case 7:
                    antrian.jumlahSudahKRS();
                    break;
                case 8:
                    antrian.jumlahBelumKRS();
                    break;
                case 9: 
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
        sc.close();
    }
}