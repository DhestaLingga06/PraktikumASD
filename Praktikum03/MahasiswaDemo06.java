import java.util.Scanner;

class Mahasiswa06 {

    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    void cetakInfo() {
        System.out.println("NIM    : " + nim);
        System.out.println("Nama   : " + nama);
        System.out.println("Kelas  : " + kelas);
        System.out.println("IPK    : " + ipk);
        System.out.println("---------------------------------");
    }
}

public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa06[] arrayOfMahasiswa06 = new Mahasiswa06[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa06[i] = new Mahasiswa06();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa06[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa06[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa06[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa06[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------");
            
        }
        
        for(int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa06[i].cetakInfo();
        }
    }
}