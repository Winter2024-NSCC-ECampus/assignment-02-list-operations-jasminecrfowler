Linked List Operations
This project implements a series of operations on a linked list in Java. The operations include insertion, deletion, splitting, and merging of sorted linked lists. The program demonstrates the following linked list operations:

Features
Insertion Operations:

Insert at the beginning of the list.
Insert at the end of the list.
Insert at the correct location in a sorted list.
Deletion Operations:

Delete the first node.
Delete the last node.
Delete a node at a given index.
Splitting a List:

Split a list into two sublists. If the number of elements is odd, the extra element goes into the front list.
Merging Two Sorted Lists:

Sort two lists independently and then merge them into one sorted list.
How to Run the Program
Clone the repository to your local machine.


Open the project in IntelliJ or your preferred IDE.

Run the Main.java file to see the linked list operations in action.

Example Output
rust
Copy
Edit
Initial Sorted List:
2 -> 3 -> 5 -> 7 -> 11 -> null
After deleting first:
3 -> 5 -> 7 -> 11 -> null
After deleting last:
3 -> 5 -> 7 -> null
After deleting at index 1:
3 -> 7 -> null
Front List:
3 -> null
Back List:
7 -> null
Merged Sorted List:
1 -> 2 -> 4 -> 5 -> 6 -> 7 -> null

Project Structure
LinkedListOperations/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── example/
│   │   │   │   │   ├── Main.java
│   │   │   │   │   ├── LinkedList.java
│   │   │   │   │   ├── Node.java
