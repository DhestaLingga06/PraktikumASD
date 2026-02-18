public class MataKuliah06 {

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah06() {
    }

    public MataKuliah06(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("===========================================");
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi : "  + sks);
    }
    
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jam berhasil ditambahkan. Total jam : " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jam berhasil dikurangi. Total jam: " + jumlahJam);
        } else {
            System.out.println("Jam awal lebih kecil dari jam pengurang.");
        }
    }
}