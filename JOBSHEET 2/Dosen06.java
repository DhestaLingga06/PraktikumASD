public class Dosen06 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    
    public Dosen06() {
    }

    public Dosen06(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
        }

    void tampilInformasi() {
            System.out.println("ID Dosen:: " + idDosen);
            System.out.println("Nama : " + nama);
            System.out.println("Status Aktif : " + statusAktif );
            System.out.println("Tahun Bergabung : " + tahunBergabung);
            System.out.println("Bidang Keahlian : " + bidangKeahlian);
            System.out.println("------------------------------------------------");

    }

    void setStatusAktif(boolean status) {
            statusAktif = status;
            if (statusAktif) {
                System.out.println("Status: Aktif");
            } else {
                System.out.println("Status: Tidak Aktif");
            }
    }

        int hitungMasaKerja(int thnSkrng) {
            return thnSkrng - tahunBergabung;

    }

        void ubahKeahlian(String bidang) {
            bidangKeahlian = bidang;
            System.out.println("Bidang keahlian diubah menjadi: " + bidangKeahlian);
    }
}