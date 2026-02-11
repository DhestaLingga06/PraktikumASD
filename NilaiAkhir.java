import java.util.Scanner;
public class nilaiAkhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tugas, kuis, uts, uas, nilaiAkhir;
        String huruf, keterangan;

        //Input Nilai   
        System.out.println("===============================");
        System.out.print("Masukkan Nilai Tugas :");
        tugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis : ");
        kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        uas = sc.nextDouble();

        //Nilai (0-100)
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {

            System.out.println("Nilai tidak valid");
        }
        else {
            nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
        
            if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
                huruf = "A";
            }
            else if (nilaiAkhir >= 73) {
                huruf = "B+";
            }
            else if (nilaiAkhir >= 65) {
                huruf = "B";
            }
            else if (nilaiAkhir >= 60) {
                huruf = "C+";
            }
            else if (nilaiAkhir >= 50) {
                huruf = "C";
            }
            else if (nilaiAkhir >= 39) {
                huruf = "D";
            }
            else {
                huruf = "E";
            }

            if (huruf.equals("A") ||
            huruf.equals("B+") ||
            huruf.equals("B") ||
            huruf.equals("C+") ||
            huruf.equals("C")) {
                keterangan = "SELAMAT ANDA LULUS";
            } 
            else {
                keterangan = "ANDA TIDAK LULUS";
            }

            System.out.println("===============================");
            System.out.println("Nilai AKhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + huruf);
            System.out.println("Keterangan : " + keterangan);
        }  
    }
}