public class TreatmentQueue {
    private class Node{
        private TreatmentRequest data;
        private Node next;

        private Node(TreatmentRequest data){
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
        return front == null;
    }//
    public void enqueue(TreatmentRequest request){
        if(request == null){
            throw new IllegalArgumentException("Request cannot be null.");
        }
        Node newNode = new Node(request);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }else {
            rear.next = newNode; //Connect newNode with current last node.
            rear = newNode; // Move the last equal with rear.
        }
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
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;

        }
        Node current = front;
        while (current != null) {
            TreatmentRequest request = current.data;
            System.out.println((" Patient ID: " + request.getPatientId())+
                    " Arrival Time: " + request.getArrivalTime());
            current = current.next;
        }
    }
}
