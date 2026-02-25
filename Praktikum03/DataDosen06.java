public class DataDosen06 {

    void dataSemuaDosen(Dosen06[] arrayOfDosen06) {
        for (Dosen06 d : arrayOfDosen06) {
            d.tampilkanInfo();
            System.out.println("---------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen06[] arrayOfDosen06) {
        int pria = 0;
        int wanita = 0;

        for (Dosen06 d : arrayOfDosen06) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah dosen pria   : " + pria);
        System.out.println("Jumlah dosen wanita : " + wanita);
    }

    void rataUsiaDosenPerJenisKelamin(Dosen06[] arrayOfDosen06) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen06 d : arrayOfDosen06) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }

        if (jmlPria > 0)
            System.out.println("Rata-rata usia dosen pria   : " + (totalPria / jmlPria));

        if (jmlWanita > 0)
            System.out.println("Rata-rata usia dosen wanita : " + (totalWanita / jmlWanita));
    }

    void infoDosenPalingTua(Dosen06[] arrayOfDosen06) {
        Dosen06 tertua = arrayOfDosen06[0];

        for (Dosen06 d : arrayOfDosen06) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("\nData Dosen Paling Tua");
        tertua.tampilkanInfo();
    }

    void infoDosenPalingMuda(Dosen06[] arrayOfDosen06) {
        Dosen06 termuda = arrayOfDosen06[0];

        for (Dosen06 d : arrayOfDosen06) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("\nData Dosen Paling Muda");
        termuda.tampilkanInfo();
    }
}