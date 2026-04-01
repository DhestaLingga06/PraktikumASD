import java.util.Scanner;

public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke- " + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa06 m = new Mahasiswa06(nim, nama, kelas, ipk);
            list.tambah(m);

            System.out.println("------------------------------");
        }

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DSC)");
        list.insertionSort();
        list.tampil();
    }
}
