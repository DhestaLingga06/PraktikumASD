import java.util.Scanner;
public class SuratDemo06 {
    public static void main(String[] args) {
        StackSurat06 stack = new StackSurat06(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat");
            System.out.println("3. Melihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = sc.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat06 data = new Surat06(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(data);
                    System.out.println("Surat berhasil ditambahkan");
                    break;
                
                case 2:
                    Surat06 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat dari " + proses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat06 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat teratas:  " + lihat.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine().trim();
                    stack.cari(cari);
                    break;
                default: System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}