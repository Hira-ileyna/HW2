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
    private int size;

    public void addPatient(Patient p){      //Time complexity is O(1)
        Node newNode = new Node(p);
        if(head == null){                   //If list is empty, newNode should be tail and head.
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;            // There, Connect to old tail to new tail.
            tail = newNode;                 //End of the list is new node now, update tail.
        }
        size++;
    }
    public boolean removePatient(int id){   //Time complexity is O(n)
        if(head == null){                   //If list is empty, return false.
            return false;                   // list is empty.
        }
        if(head.data.getId() == id){        //If ID is in head and head remove, head will pass to next of head.
            head = head.next;
            if(head == null){               //If list is empty, tail should be null.
                tail = null;
            }
            size--;
            return true;                    // Removing is successful!
        }
        else{
            Node temp = head;               //Traverse from beggining with temp,temp is previous of removing because we need a previous.
            while(temp.next != null){       //The loop will remain as long as temp.next exists.
                if(temp.next.data.getId() == id){
                    temp.next = temp.next.next;
                    if(temp.next == tail){   //If removing node is tail,
                        tail = temp;         //Update to the tail.
                    }
                    size--;
                    return true;             //Removing is succesfull
                }
                temp = temp.next;           // Pass to next node.
            }
            return false;                   //ID couldn't find.
        }
    }

    public Patient findPatient(int id) {                 //Time complexity is O(n), This method search that given ID.
        Node current = head;                             //Create a current and reference a head.
        Patient currentPatient = null;
        while(current != null){                         //In this way, traverse from beginning to end.
            if(current.data.getId() == id){             //If ID match,
                currentPatient = current.data;
                return currentPatient;                  //Found. and return object.


            }
            current = current.next;         // Move next of current.
        }
        return currentPatient;                       //Didn't find.
    }

    public Patient[] toArray(){                         //Turn the array from linked list for sorting.
        Patient[] array = new Patient[size];            //Create a array that is known sizes
        Node current = head;                            //Traverse the array from beginning.
        int i = 0;
        while(current != null){
            array[i++] = current.data;
            current = current.next;
        }
        return array;
    }

    public void printList(){                //Time complexity is O(n).
        if(head == null){
            System.out.println("List is empty");
            return;
        }
         System.out.println("List of patient data: ");
        //Traverse from beggining to end and print all patients.
         Node currentNode = head;
         while(currentNode != null){
             System.out.println(currentNode.data.printPatient());
             currentNode = currentNode.next;


         }
    }
}
