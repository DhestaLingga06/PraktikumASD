public class BinaryTree06 {
    Node06 root;

    public BinaryTree06() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa06 mahasiswa) {
        Node06 newNode = new Node06(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node06 current = root;
            Node06 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find (double ipk) {
        boolean result = false;
        Node06 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node06 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node06 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node06 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node06 getSuccessor(Node06 del) {
        Node06 successor = del.right;
        Node06 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        //cari node (current) yang akan dihapus
        Node06 parent = root;
        Node06 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        //Penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            //Jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { //Jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                } else {
                    if(isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if(current.right == null) { //Jika hanya punya 1 anak (kiri)
                if(current == root) {
                    root = current.left;
                } else {
                    if(isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { //Jika punya 2 anak
                Node06 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    //Tugas No 1.(Menambahkan method addRekursif)
    public void addRekursif(Mahasiswa06 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }
    public Node06 addRekursif(Node06 current, Mahasiswa06 mahasiswa) {
        if (current == null) {
            return new Node06(mahasiswa);
        }

        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursif(current.right, mahasiswa);
        }
        return current;
    }

    //Tugas No 2. Menambahkan method cariMinIPK() dan cariMaxIPK()
    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Binary Tree kosong.");
            return;
        }
        
        Node06 current = root;
        while (current.left != null) {
            current = current.left;
        }
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Binary Tree kosong.");
            return;
        }

        Node06 current = root;
        while (current.right != null) {
            current = current.right;
        }
        current.mahasiswa.tampilInformasi();
    }

    //Tugas No 3. Menambahkan method tampilMahasiswaIPKdiAtas()
    public void tampilMahasiswaIPKdiAtas(Node06 node, double batasIPK) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, batasIPK);

            if (node.mahasiswa.ipk > batasIPK) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtas(node.right, batasIPK);
        }
    }
}