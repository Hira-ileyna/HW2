public class TreatmentQueue {
    private class Node{
        private TreatmentRequest data;
        private Node next;

        private Node(TreatmentRequest data){
            this.data = data;
            this.next = null;
        }
    }
    private Node front;                                 //Beginning of queue
    private Node rear;                                  //End of queue
    private int size;

    public TreatmentQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty(){                           // Is queue empty or not? Checking!
        return front == null;
    }
    public void enqueue(TreatmentRequest request){      //Add to ending of queue because queues is FIFO. Time complexcity is O(1).
        if(request == null){
            throw new IllegalArgumentException("Request cannot be null.");
        }
        Node newNode = new Node(request);               // Create a new node for request.
        if(isEmpty()){                                  //If queue is empty, front and rear should be new node.
            front = newNode;
            rear = newNode;
        }else {
            rear.next = newNode;                        //Connect newNode with current last node.
            rear = newNode;                             // Move the last equal with rear.
        }
        size++;                                         // size increase because added new node.
    }
    public TreatmentRequest dequeue(){                  //Remove to begginnig of queue because queue is FIFO. Time complexcity is O(1).
        if(isEmpty()){
            return null;
        }
        TreatmentRequest request = front.data;          //The data to be returned is at the begginning node.
        front = front.next;                             //This node will be shifted because this node will be removed.
        size--;                                         //size decrease because removed this node.
        if(front == null){                              //If after shifthing, front is null, queue is empty completely
            rear = null;
        }
        return request;                                 //Provide to know which was removed node
    }
    public int size(){
        return size;
    }
    public void printQueue() {                          //prints the entire queue from beginning to end. Time complexcity is O(n).
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;                           //Start to front and walk all of nodes. Then, print all of nodes.
        while (current != null) {
            TreatmentRequest request = current.data;
            System.out.println((request.toString()));
            current = current.next;
        }
    }
}
