import java.util.Scanner;
public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen data = new DataDosen();
        int pilih;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble)");
            System.out.println("4. Sorting DSC (Insertion)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
        
        switch (pilih) {
            case 1:
            System.out.println("Tambah Data Dosen");
            System.out.print("Kode: ");
            String kd = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true = L, false = P): ");
            Boolean jk = sc.nextBoolean();
            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine();

            Dosen d = new Dosen(kd, nama, jk, usia);
            data.tambah(d);
            break;
        
        case 2:
            System.out.println("Data Dosen: ");
            data.tampil();
            break;
        
        case 3:
            System.out.println("DATA DOSEN (Bubble Sort ASC): ");
            data.bubbleSort();
            data.tampil();
            break;

        case 4:
            System.out.println("DATA DOSEN (Insertion Sort DSC): ");
            data.insertionSort();
            data.tampil();
            break;
        
        case 5:
            System.out.println("Program Selesai");
            break;
        
        default:
            System.out.println("Menu tidak tersedia!");
        }
    } while (pilih != 5);
    }
}