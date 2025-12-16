public class TreatmentQueue {
    public class Node{
        Patient data;
        Node next;
        public Node(TreatmentRequest data){

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
        if(rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    public TreatmentRequest dequeue(){
        if(isEmpty()){
            return null;
        }
        front = front.next;
        if(front == null){
            rear = null;
        }
        size--;
        return null;
    }
    public int size(){
        return size;
    }
    public String printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data.printPatient());
            temp = temp.next;
        }
        return "";
    }
}
