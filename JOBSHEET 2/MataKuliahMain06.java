public class MataKuliahMain06 {
    public static void main(String[] args) {
        
        MataKuliah06 mk1 = new MataKuliah06();

        mk1.kodeMK = "SIB252005";
        mk1.nama = "Praktikum Algoritma dan Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        MataKuliah06 mk2 = new MataKuliah06("SIB252008", "Matematika Lanjut", 2, 3);
        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangiJam(5);
        mk2.tampilInformasi();
    }
}