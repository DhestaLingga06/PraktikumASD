import java.util.Scanner;
public class DoubleLinkedListMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList06 list = new DoubleLinkedList06();
        int pilih;

        do {
            System.out.println("================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Hitung Total Pendapatan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP   : ");
                    String noHp = sc.nextLine();
                    Pembeli06 pembeli = new Pembeli06(nama, noHp);
                    list.tambahAntrian(pembeli);
                    break;
            
                case 2:
                    list.cetakAntrian();
                    break;
                
                case 3:
                    System.out.print("Kode Pesanan : ");
                    int kodePesanan = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Pesanan : ");
                    String namaPesanan = sc.nextLine();
                    System.out.print("Harga        : ");
                    int harga = sc.nextInt();
                    sc.nextLine();
                    Pesanan06 pesanan= new Pesanan06(kodePesanan, namaPesanan, harga);
                    list.removeAntrian(pesanan);
                    break;
                
                case 4:
                    list.laporanPesanan();
                    break;
                
                case 5: 
                    list.laporanPesanan();;
                    break;

                case 0:
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
        } while (pilih != 0);
    }
}