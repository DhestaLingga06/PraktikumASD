import java.util.Scanner;
public class Tugas2 {

    static void inputJadwal(String[][] jadwal, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari Kuliah      : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam Kuliah       : ");
            jadwal[i][3] = sc.nextLine();
        }
    }
    static void tampilkanSemua(String[][] jadwal, int n) {
        System.out.println("\n===== DAFTAR JADWAL KULIAH =====");
        System.out.printf("%-20s %-15s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-15s %-10s %-15s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }
    static void cariHari(String[][] jadwal, int n, Scanner sc) {
        System.out.print("\nCari hari: ");
        String cariHari = sc.nextLine();

        System.out.println();
        System.out.printf("%-20s %-15s\n", "Mata Kuliah", "Jam");

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(cariHari)) {
                System.out.printf("%-20s %-15s\n",
                        jadwal[i][0], jadwal[i][3]);
            }
        }
    }
    static void cariMatkul(String[][] jadwal, int n, Scanner sc) {
        System.out.print("\nCari Mata Kuliah : ");
        String cariMatkul = sc.nextLine();

        System.out.println();
        System.out.printf("%-10s %-15s %-15s\n",
                "Hari", "Ruang", "Jam");

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(cariMatkul)) {
                System.out.printf("%-10s %-15s %-15s\n",
                        jadwal[i][2], jadwal[i][1], jadwal[i][3]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n, sc);
        tampilkanSemua(jadwal, n);
        cariHari(jadwal, n, sc);
        cariMatkul(jadwal, n, sc);

        sc.close();
    }
}