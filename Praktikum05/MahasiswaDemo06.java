import java.util.Scanner;
public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        
        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06();
        list.listMhs = new Mahasiswa06[jumMhs];

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke- " + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("------------------------------");
            list.tambah(new Mahasiswa06(nim, nama, kelas, ipk));

        }
            list.tampil();
            //Melakukan pencarian data Binary
            System.out.println("------------------------------");
            System.out.println("Pencarian data");
            System.out.println("------------------------------");
            System.out.println("Masukkan ipk mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            double cari = sc.nextDouble();
            System.out.println("------------------------------");
            System.out.println("menggunakan binary search");
            System.out.println("--------------------------------");
            double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1); 
            int pss2 = (int)posisi2;
            list.tampilPosisi(cari, pss2);
            list.tampilDataSearch(cari, pss2);
    }
}