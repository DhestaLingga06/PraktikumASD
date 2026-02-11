import java.util.Scanner;
public class RoyalGarden {
    public static void main(String[] args) {

        int[][] stok = {{10,5,15,7}, {6,11,9,12}, {2,10,10,5}, {5,7,12,9}};
        int[] harga = { 75000, 50000, 60000, 10000 };

        for (int i = 0; i < stok.length; i++) {

            int pendapatan = 0;

            for (int j = 0; j < stok.length; j++) {
                pendapatan += stok[i][j] * harga[j];
            }

            System.out.println("Pendapatan Royal Garden " + (i+1) + " = Rp " + pendapatan);

            if (pendapatan > 1500000) {
                System.out.println("Status : Sangat Baik");
            } else {
                System.out.println("Status : Perlu Evaluasi");
            }
            System.out.println();
        }
    }
}