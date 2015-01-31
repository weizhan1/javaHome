/*
 * Java class to represent linked list data structure.
 */
public class LinkedList {
    private Node head;
    public LinkedList() { this.head = new Node("head"); }   
    public Node head() { return head;}
   
    public void appendIntoTail(Node node) {
        Node current = head;
       
        //find last element of LinkedList i.e. tail
        while(current.next() != null){
            current = current.next();
        }
        //appending new node to tail in LinkedList
        current.setNext(node);
    }
   
    /*
     * If singly LinkedList contains Cycle then following would be true
     * 1) slow and fast will point to same node i.e. they meet
     * On the other hand if fast will point to null or next node of
     * fast will point to null then LinkedList does not contains cycle.
     */
    public boolean isCyclic(){
        Node fast = head;
        Node slow = head;
       
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
           
            //if fast and slow pointers are meeting then LinkedList is cyclic
            if(fast == slow ){
                return true;
            }
        }
        return false;
    }
   
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node current = head.next();
        while(current != null){
           sb.append(current).append("-->");
           current = current.next();
        }
        sb.delete(sb.length() - 3, sb.length()); // to remove --> from last node
       return sb.toString();
    }

    public static class Node {
        private Node next;
        private String data;

        public Node(String data) {
            this.data = data;
        }

        public String data() { return data; }
        public void setData(String data) { this.data = data;}

        public Node next() { return next; }
        public void setNext(Node next) { this.next = next; }

        @Override
        public String toString() {
            return this.data;
        }
    }
}


/**'
 *
 * Java program to find if LinkedList contains loop or cycle or not.
 * This example uses two pointer approach to detect cycle in linked list.
 * Fast pointer moves two node at a time while slow pointer moves one node.
 * If linked list contains any cycle or loop then both pointer will meet some time.
 *
 * @author Javin Paul
 */
public class LinkedListTest {

    public static void main(String args[]) {

        //creating LinkedList with 5 elements including head
        LinkedList linkedList = new LinkedList();
        linkedList.appendIntoTail(new LinkedList.Node("101"));
        linkedList.appendIntoTail(new LinkedList.Node("201"));
        linkedList.appendIntoTail(new LinkedList.Node("301"));
        linkedList.appendIntoTail(new LinkedList.Node("401"));

        System.out.println("Linked List : " + linkedList);

        if(linkedList.isCyclic()){
            System.out.println("Linked List is cyclic as it contains cycles or loop");
        }else{
            System.out.println("LinkedList is not cyclic, no loop or cycle found");
        }    

    } 
   
}

Output:
Linked List : 101-->201-->301-->401
LinkedList is not cyclic, no loop or cycle found

Now let's change the linked list so that it contains cycle or loop,
//creating LinkedList with 5 elements including head
LinkedList linkedList = new LinkedList();
linkedList.appendIntoTail(new LinkedList.Node("101"));
LinkedList.Node cycle = new LinkedList.Node("201");
linkedList.appendIntoTail(cycle);
linkedList.appendIntoTail(new LinkedList.Node("301"));
linkedList.appendIntoTail(new LinkedList.Node("401"));
linkedList.appendIntoTail(cycle);

//don't call toString method in case of cyclic linked list, it will throw OutOfMemoryError
//System.out.println("Linked List : " + linkedList);

if(linkedList.isCyclic()){
   System.out.println("Linked List is cyclic as it contains cycles or loop");
}else{
   System.out.println("LinkedList is not cyclic, no loop or cycle found");
}    



