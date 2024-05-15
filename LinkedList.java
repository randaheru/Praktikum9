public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // Check if the linked list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Print all elements of the linked list
    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // Add a new node at the beginning of the linked list
    public void addFirst(int input) {
        Node newNode = new Node(input, head);
        head = newNode;
    }

    // Add a new node at the end of the linked list
    public void addLast(int input) {
        Node newNode = new Node(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    // Insert a new node after a node with a specific key
    public void insertAfter(int key, int input) {
        if (!isEmpty()) {
            Node currentNode = head;
            while (currentNode != null) {
                if (currentNode.data == key) {
                    Node newNode = new Node(input, currentNode.next);
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // Insert a new node at a specific index
    public void insertAt(int index, int key) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }

        // Buat node baru dengan nilai key
        Node newNode = new Node(key, null);

        // Jika indeks adalah 0, sisipkan node baru di awal linked list
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Penelusuran linked list untuk mencari posisi yang sesuai
        Node currentNode = head;
        int counter = 0;
        while (currentNode != null && counter < index - 1) {
            currentNode = currentNode.next;
            counter++;
        }

        // Jika indeks melebihi panjang linked list, cetak pesan kesalahan
        if (currentNode == null) {
            System.out.println("Indeks melebihi panjang linked list");
            return;
        }

        // Sisipkan node baru di posisi yang ditentukan
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    // Method to find the index of a node with a specific key
    public int indexOf(int key) {
        Node currentNode = head;
        int index = 0;
        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }
        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }

    // Method to remove the first node of the linked list
    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // Method to remove the last node of the linked list
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            Node currentNode = head;
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        }
    }

    // Method to remove a node with a specific key
    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    // Method untuk mengambil data dari node pada indeks tertentu
    public int getData(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Indeks negatif tidak valid");
        }

        Node currentNode = head; // Mulai dari node pertama
        int currentIndex = 0;

        while (currentNode != null) {
            if (currentIndex == index) {
                return currentNode.data;
            }
            currentNode = currentNode.next;
            currentIndex++;
        }

        // Jika sampai di sini, berarti indeks melebihi panjang linked list
        throw new IndexOutOfBoundsException("Indeks melebihi panjang list");
    }

    // Method to insert a new node before a node with a specific key
    public void insertBefore(int key, int input) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }

        if (head.data == key) {
            addFirst(input);
            return;
        }

        Node currentNode = head;
        Node prevNode = null;

        while (currentNode != null) {
            if (currentNode.data == key) {
                Node newNode = new Node(input, currentNode);
                prevNode.next = newNode;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        System.out.println("Keyword tidak ditemukan");
    }

    // Method to remove a node at a specific index
    public void removeAt(int index) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node currentNode = head;
        Node prevNode = null;
        int counter = 0;
        while (currentNode != null && counter < index) {
            prevNode = currentNode;
            currentNode = currentNode.next;
            counter++;
        }

        if (currentNode == null) {
            System.out.println("Indeks melebihi panjang linked list");
        } else {
            prevNode.next = currentNode.next;
        }
    }
}
