public class BinaryTreeArray06 {
    Mahasiswa06[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray06() {
        this.dataMahasiswa = new Mahasiswa06[10];
    }

    void populateData (Mahasiswa06 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    //Tugas No 4a. Menambahkan method add(Mahasiswa data)
    public void add(Mahasiswa06 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Binary Tree penuh.");
        }
    }

    //Tugas No 4b. Menambahkan method traversePreOrder()
    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}