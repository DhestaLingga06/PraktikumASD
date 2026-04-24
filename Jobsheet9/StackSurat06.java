public class StackSurat06 {
    
    Surat06[] stack;
    int size;
    int top;

    public StackSurat06(int size) {
        this.size = size;
        stack = new Surat06[size];
        top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public void push(Surat06 data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
           top++;
           stack[top] = data;
        }
    }
    public Surat06 pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return null;
        } else {
            Surat06 data = stack[top];
            top--;
            return data;
        }
    }
    public Surat06 peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return null;
        } else {
            return stack[top];
        }
    }
    public void cari(String nama) {
        boolean ketemu = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                System.out.println("ID: " + stack[i].idSurat);
                System.out.println("Nama: " + stack[i].namaMahasiswa);
                System.out.println("Kelas: " + stack[i].kelas);
                System.out.println("Jenis: " + stack[i].jenisIzin);
                System.out.println("Durasi: " + stack[i].durasi);
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}