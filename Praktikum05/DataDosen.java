public class DataDosen {
 
    Dosen [] listDsn = new Dosen[10];
    int idx;

    void tambah (Dosen d) {
        if (idx < listDsn.length) {
            listDsn[idx] = d;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listDsn[i].tampil();
            System.out.println("-----------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listDsn[j].usia < listDsn[j - 1].usia) {
                    Dosen tmp = listDsn[j];
                    listDsn[j] = listDsn[j - 1];
                    listDsn[j - 1] = tmp;
                }
            }
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen temp = listDsn[i];
            int j = i;
            while (j > 0 && listDsn[j - 1].usia < temp.usia) {
                listDsn[j] = listDsn[j - 1];
                j--;
            }
            listDsn[j] = temp;
        }
    }
} 