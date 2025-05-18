package Semester2.ALSD.JS12;

public class SingleLinkedList01 {
    NodeMahasiswa01 head;
    NodeMahasiswa01 tail;

    public SingleLinkedList01() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa01 tmp = head;
            System.out.println("Isi Linked List: ");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void addFirst(Mahasiswa01 input) {
        NodeMahasiswa01 ndInput = new NodeMahasiswa01(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa01 input) {
        NodeMahasiswa01 ndInput = new NodeMahasiswa01(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

public void insertAfter(String key, Mahasiswa01 input) {
    NodeMahasiswa01 ndInput = new NodeMahasiswa01(input, null);
    NodeMahasiswa01 temp = head;
    do {
        if (temp.data.nama.equalsIgnoreCase(key)) {
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
            break;
        }
        temp = temp.next;
    } while (temp != null);
}

    public void insertAt(int index, Mahasiswa01 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa01 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            NodeMahasiswa01 ndInput = new NodeMahasiswa01(input, temp.next);
            temp.next = ndInput;
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public void getData(int index) {
        NodeMahasiswa01 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data.tampilInformasi();
    }

    public int indexOf(String key) {
        NodeMahasiswa01 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
            head = tail = null;
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }


    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            NodeMahasiswa01 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    
    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa01 temp = head;
            NodeMahasiswa01 prev = null; 

            while (temp != null) {
                if (temp.data.nama.equalsIgnoreCase(key)) {
                    if (temp == head) {
                        this.removeFirst();
                        break;
                    } else {
                        prev.next = temp.next;
                        if (temp.next == null) {
                            tail = prev;
                        }
                        break;
                    }
                }
                prev = temp; 
                temp = temp.next;
            }
        }
    }
    
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa01 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null || temp.next == null) {
                    System.out.println("Index di luar batas Linked List!");
                    return;
                }
                temp = temp.next;
            }
            if (temp.next == null) {
                System.out.println("Index di luar batas Linked List!");
                return;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}

