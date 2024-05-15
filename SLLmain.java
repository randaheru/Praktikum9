public class SLLmain {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.print(); 
        myLinkedList.addFirst(800);
        myLinkedList.print();
        myLinkedList.addFirst(700);
        myLinkedList.print(); 
        myLinkedList.addLast(500);
        myLinkedList.print(); 
        myLinkedList.insertAfter(700, 300);
        myLinkedList.print(); 

        // Memanggil metode di sini
        System.out.println("Data pada index ke-1: " + myLinkedList.getData(1));
        System.out.println("Data 300 berada pada index ke: " + myLinkedList.indexOf(300));

        myLinkedList.remove(300);
        myLinkedList.print();
        myLinkedList.removeFirst();
        myLinkedList.print();
        myLinkedList.removeLast();
        myLinkedList.print();
    }
}
