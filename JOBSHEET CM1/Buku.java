public class Buku {

    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku(String kode, String judul, int tahun) {
        kodeBuku = kode;
        this.judul = judul;
        tahunTerbit = tahun;

    }
    void tampilBuku() {
        System.out.println( "Kode: " + kodeBuku + " | " + "Judul: " + judul + " | " + "Tahun: " + tahunTerbit);
    }
}