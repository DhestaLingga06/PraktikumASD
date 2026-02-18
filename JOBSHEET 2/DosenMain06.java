public class DosenMain06 {
    public static void main(String[] args) {
        
        Dosen06 dsn1 = new Dosen06();

        dsn1.idDosen = "0123456701";
        dsn1.nama = "Pramana Yoga Saputra";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2018;
        dsn1.bidangKeahlian = "Algoritma dan Struktur Data";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(true);
        int masaKerja = dsn1.hitungMasaKerja(2026);
        System.out.println("Masa Kerja : " + masaKerja + " tahun");
        dsn1.ubahKeahlian("Basis Data");
        dsn1.tampilInformasi();

        Dosen06 dsn2 = new Dosen06("0124681012", "Budi Santoso", true, 2015, "Matematika Dasar");
        dsn2.setStatusAktif(false);
        int masaKerja2 = dsn2.hitungMasaKerja(2026);
        System.out.println("Masa Kerja : " + masaKerja2 + " tahun");
        dsn2.ubahKeahlian("Basis Data");
        dsn2.tampilInformasi();
    }
}