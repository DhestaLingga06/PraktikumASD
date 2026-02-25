import java.util.Scanner;

class Matakuliah06 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah06(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void cetakInfo(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
public class MatakuliahDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Matakuliah06[] arrayOfMatakuliah06 = new Matakuliah06[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i=0; i < jumlah; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("Sks         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfMatakuliah06[i] = new Matakuliah06(kode, nama, sks, jumlahJam);

            arrayOfMatakuliah06[i].tambahData(kode, nama, sks, jumlahJam);

            arrayOfMatakuliah06[i].cetakInfo(kode, nama, sks, jumlahJam);
        }

        for(int i=0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode        : " + arrayOfMatakuliah06[i].kode);
            System.out.println("Nama        : " + arrayOfMatakuliah06[i].nama);
            System.out.println("Sks         : " + arrayOfMatakuliah06[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMatakuliah06[i].jumlahJam);
            System.out.println("-------------------------------------");
        }
    }    
}