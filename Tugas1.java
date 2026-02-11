import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] Kode = { 'A', 'B', 'D', 'E', 'F', 'H', 'L', 'N', 'T','Z'};

        char[][] Kota = {
            {'B','A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };
        
        System.out.print("Masukkan kode plat nomor : ");
        char input = sc.next().charAt(0);
        
        boolean ditemukan = false;

        for (int i = 0; i < Kode.length; i++) {
            if (Kode[i] == input) {
                System.out.print("Nama Kota : ");
                for ( int j = 0; j < Kota[i].length; j++) {
                    System.out.print(Kota[i][j]);
                }
                System.out.println();
                ditemukan = true; 
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan");
        }
    }
}