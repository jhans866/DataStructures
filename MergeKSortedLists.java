import java.util.*;

// Definition for a singly linked list node.
class LinkedListNode {
    int value;
    LinkedListNode next;

    LinkedListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class MergeKSortedLists {

    // Helper method to merge K sorted linked lists.
    static LinkedListNode merge_k_lists(ArrayList<LinkedListNode> lists) {
        // Create a min-heap (priority queue) to store the nodes of the linked lists.
        PriorityQueue<LinkedListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.value));

        // Step 1: Add the head of each list to the min-heap.
        for (LinkedListNode head : lists) {
            if (head != null) {
                minHeap.add(head);
            }
        }

        // Create a dummy node to simplify handling the result list.
        LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode current = dummy;

        // Step 2: Extract the minimum node from the heap and add it to the merged list.
        while (!minHeap.isEmpty()) {
            // Extract the node with the smallest value.
            LinkedListNode minNode = minHeap.poll();

            // Add it to the merged list.
            current.next = minNode;
            current = current.next;

            // If the node has a next node, add it to the heap.
            if (minNode.next != null) {
                minHeap.add(minNode.next);
            }
        }

        // Return the merged linked list (excluding the dummy node).
        return dummy.next;
    }

    // Helper method to print the linked list
    static void printList(LinkedListNode head) {
        LinkedListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create k sorted linked lists.
        LinkedListNode list1 = new LinkedListNode(1);
        list1.next = new LinkedListNode(3);
        list1.next.next = new LinkedListNode(5);

        LinkedListNode list2 = new LinkedListNode(3);
        list2.next = new LinkedListNode(4);

        LinkedListNode list3 = new LinkedListNode(7);

        // Put all the lists in an ArrayList.
        ArrayList<LinkedListNode> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);

        // Merge the k sorted linked lists.
        LinkedListNode mergedList = merge_k_lists(lists);

        // Print the merged list.
        printList(mergedList);  // Output: 1 3 3 4 5 7
    }
}

