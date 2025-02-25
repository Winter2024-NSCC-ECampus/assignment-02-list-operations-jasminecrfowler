public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        
        list.insertSorted(5);
        list.insertSorted(2);
        list.insertSorted(7);
        list.insertSorted(3);
        list.insertSorted(11);
        System.out.println("Initial Sorted List:");
        list.printList();


        list.deleteFirst();
        System.out.println("After deleting first:");
        list.printList();

        list.deleteLast();
        System.out.println("After deleting last:");
        list.printList();

        list.deleteByIndex(1);
        System.out.println("After deleting at index 1:");
        list.printList();


        LinkedList[] splitLists = list.frontBackSplit();
        System.out.println("Front List:");
        splitLists[0].printList();
        System.out.println("Back List:");
        splitLists[1].printList();


        LinkedList listA = new LinkedList();
        listA.insertSorted(1);
        listA.insertSorted(4);
        listA.insertSorted(6);

        LinkedList listB = new LinkedList();
        listB.insertSorted(2);
        listB.insertSorted(5);
        listB.insertSorted(7);

        System.out.println("Merged Sorted List:");
        LinkedList mergedList = LinkedList.mergeSorted(listA, listB);
        mergedList.printList();
    }
}
