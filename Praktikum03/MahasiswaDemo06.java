class Mahasiswa06 {

    public String nim;
    public String nama;
    public String kelas;
    public float ipk;
}

public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Mahasiswa06[] arrayMahasiswa06 = new Mahasiswa06[3];
        arrayMahasiswa06[0] = new Mahasiswa06();
        arrayMahasiswa06[0].nim = "244107060033";
        arrayMahasiswa06[0].nama = "AGNES TITANIA KINANTI";
        arrayMahasiswa06[0].kelas = "SIB-1E";
        arrayMahasiswa06[0].ipk = (float) 3.75;

        arrayMahasiswa06[1] = new Mahasiswa06();
        arrayMahasiswa06[1].nim = "2341720172";
        arrayMahasiswa06[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayMahasiswa06[1].kelas = "TI-2A";
        arrayMahasiswa06[1].ipk = (float) 3.36;

        arrayMahasiswa06[2] = new Mahasiswa06();
        arrayMahasiswa06[2].nim = "244107023006";
        arrayMahasiswa06[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayMahasiswa06[2].kelas = "TI-2E";
        arrayMahasiswa06[2].ipk = (float) 3.80;

        System.out.println("NIM     : " + arrayMahasiswa06[0].nim);
        System.out.println("Nama    : " + arrayMahasiswa06[0].nama);
        System.out.println("Kelas   : " + arrayMahasiswa06[0].kelas);
        System.out.println("IPK     : " + arrayMahasiswa06[0].ipk);
        System.out.println("------------------------------------");
        System.out.println("NIM     : " + arrayMahasiswa06[1].nim);
        System.out.println("Nama    : " + arrayMahasiswa06[1].nama);
        System.out.println("Kelas   : " + arrayMahasiswa06[1].kelas);
        System.out.println("IPS     : " + arrayMahasiswa06[1].ipk);
        System.out.println("------------------------------------");
        System.out.println("NIM     : " + arrayMahasiswa06[2].nim);
        System.out.println("Nama    : " + arrayMahasiswa06[2].nama);
        System.out.println("Kelas   : " + arrayMahasiswa06[2].kelas);
        System.out.println("IPK     : " + arrayMahasiswa06[2].ipk);
        System.out.println("------------------------------------");
        
    }
}