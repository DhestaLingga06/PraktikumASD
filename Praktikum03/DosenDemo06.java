import java.util.Scanner;

class Dosen06 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen06(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampilkanInfo() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + usia);
    }
}

public class DosenDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen06[] arrayOfDosen06 = new Dosen06[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Dosen ke-" + (i+1));

            System.out.print("Kode : ");
            String kode = sc.nextLine();

            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("Jenis kelamin (true=Pria | false=Wanita) : ");
            boolean jenisKelamin = sc.nextBoolean();

            System.out.print("Usia : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen06[i] = new Dosen06(kode, nama, jenisKelamin, usia);
        }

        DataDosen06 data = new DataDosen06();

        data.dataSemuaDosen(arrayOfDosen06);
        data.jumlahDosenPerJenisKelamin(arrayOfDosen06);
        data.rataUsiaDosenPerJenisKelamin(arrayOfDosen06);
        data.infoDosenPalingTua(arrayOfDosen06);
        data.infoDosenPalingMuda(arrayOfDosen06);

        sc.close();
    }
}