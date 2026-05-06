public class Mahasiswa06 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa06() {
    }
    public Mahasiswa06(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    public void tampilInformasi() {
        System.out.printf("%-10s %-10s %-5s %.1f\n", nama, nim, kelas, ipk);
    }
}