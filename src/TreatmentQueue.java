public class TreatmentQueue {
    public class Node{
        TreatmentRequest data;
        Node next;

        public Node(TreatmentRequest data){
            this.data = data;
            this.next = null;
        }
    }
    private Node front;
    private Node rear;
    private int size;

    public TreatmentQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        if(front == null){
            return true;
        }
        return false;
    }

    public void enqueue(TreatmentRequest request){
        Node newNode = new Node(request);
        if(isEmpty()){
            front = rear = newNode;
        }else {
            rear.next = newNode; //Connect newNode with current last node.
        }
        rear = newNode; // Move the last equal with rear.
        size++;
    }
    public TreatmentRequest dequeue(){
        if(isEmpty()){
            return null;
        }
        TreatmentRequest request = front.data;
        front = front.next;
        size--;
        if(front == null){
            rear = null;
        }
        return request;
    }
    public int size(){
        return size;
    }
    public String printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");

        }
        Node current = front;
        while (current != null) {
            TreatmentRequest request = current.data;
            System.out.println((" Patient ID: " + request.getPatientId())+
                    " Arrival Time: " + request.getArrivialTime());
            current = current.next;
        }
        return "";
    }
}
