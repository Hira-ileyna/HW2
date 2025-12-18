public class PatientList {
    public static class Node{
        Patient data;
        Node next;
        public Node(Patient data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    //If we keep a tail (end node) reference, insertion becomes O(1). bunu ablama soralım !

    public void addPatient(Patient p){      //O(1)
        Node newNode = new Node(p);
        if(head == null){                   //If list is empty, newNode should be tail and head.
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;            // There, Connect to old tail to new tail.
            tail = newNode;                 //End of the list is new node now, update tail.
        }
    }
    public boolean removePatient(int id){   //O(1)
        if(head == null){                   //If list is empty, return false.
            return false;                   // list is empty.
        }
        if(head.data.getId() == id){        //If ID is in head and head remove, head will pass to next of head.
            head = head.next;
            if(head == null){               //If list is empty, tail should be null.
                tail = null;
            }
            return true;                    // Removing is successful!
        }
        Node prev = head;                   //If removing node is not head, should use prev and current.
        Node current = head.next;
        while(current != null){             //Progress to end of the list.
            if(current.data.getId() == id){ //If ID is same , ID match.
                prev.next = current.next;   //Next of previous connect to next of current. In conculion, current remove.
                if(current == tail){        //If removing node is tail, new tail shoul be prev.
                    tail = prev;
                }
                return true;                //Removing is succesfull!
            }
            prev = current;                 //Prev is current.
            current = current.next;         //Current is current.next.
        }
        return false;                       //Searching ID cannot find.
    }

    public boolean findPatient(int id) { //O(n)
        Node current = head;
        while(current != null){
            if(current.data.getId() == id){
                return true; //Found.
            }
            current = current.next;
        }
        return false; //Didn't find.
    }

    public void printList(){ //O(n)
        if(head == null){
            System.out.println("List is empty");
            return;
        }
         System.out.println("List of patient data: ");
         Node currentNode = head;
         while(currentNode != null){
             System.out.println(currentNode.data.printPatient());
             currentNode = currentNode.next;


         }
    }
}
