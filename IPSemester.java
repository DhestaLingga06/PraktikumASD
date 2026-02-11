import java.util.Scanner;
public class IPSemester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitug IP Semester");
        System.out.println("=============================");
        System.out.print("Masukkan jumlah mata kuliah : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] namaMatkul = new String[n];
        int[] sks = new int[n];
        double[] nilaiAngka = new double[n];
        String[] nilaiHuruf = new String[n];
        double[] nilaiSetara = new double[n];

        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nMata Kuliah ke-" + (i+1));

            System.out.print("Nama Mata Kuliah : ");
            namaMatkul[i] = sc.nextLine();

            System.out.print("Jumlah SKS : ");
            sks[i] = sc.nextInt();

            System.out.print("Nilai Angka : ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();

            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A"; nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+"; nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B"; nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+"; nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C"; nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D"; nilaiSetara[i] = 1;
            } else {
                nilaiHuruf[i] = "E"; nilaiSetara[i] = 0;
            }

            totalBobot += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalBobot/totalSKS;
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("======================");
        System.out.printf("%-20s %-15s %-15s %-15s\n", "Nama Matkul", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-15.0f %-15s %-15.1f\n", namaMatkul[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }
            System.out.println("----------------------------------------------------------------");
            System.out.println("IP Semester : " + ip);

    }
}