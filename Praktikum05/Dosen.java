public class Dosen {
    
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen(String kd, String name, Boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
    }
}