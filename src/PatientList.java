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

    public void addPatient(Patient p){ //O(n)
        Node newNode = new Node(p);
        if(head == null){
            head = newNode;
            return;
        }else {
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }
    public boolean removePatient(int id){//O(n)
        if(head == null){
            return false; // list is empty.
        }
        if(head.data.getId() == id){
            head = head.next;
            return true;
        }
        Node prev = head;
        Node current = head.next;
        while(current != null){
            if(current.data.getId() == id){
                prev.next = current.next;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
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
             currentNode = currentNode;
             currentNode = currentNode.next;


         }
    }
}
