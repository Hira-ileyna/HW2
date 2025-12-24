public class DischargeStack {
    private class Node {
        private DischargeRecord data;
        private Node next;
        private Node(DischargeRecord data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;                                       //First node of stack is top.
    private int size;                                      //number of elements of stack.
    public DischargeStack() {
        this.top = null;
        this.size = 0;
    }
    public boolean isEmpty() {                              //Time complexcity is O(1).
        return top == null;
    }        //Check to that is stack empty or not?
    public int size() {
        return size;
    }
    public void push(DischargeRecord data) {                //Add a new node to the begginnig of stack. Time complexcity is O(1).
        if(data == null) {
            throw new IllegalArgumentException("Data should not be null");
        }
        Node newNode = new Node(data);                      //Create a new node.
        newNode.next = top;                                 //next of new node will be current top.
        top = newNode;                                      //Update top because it change.
        size++;                                             //Size increase because added new node to the stack.
    }
    public DischargeRecord pop() {                          //Remove the top because stack is LIFO. Time complexcity is O(1).
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        DischargeRecord item = top.data;                    // Item gets top data
        top = top.next;                                     //top will be next of top because remove a top node.
        size--;                                             //number of elements decrease because remove element.
        return item;                                        //Removing data will be return because we should know this data.
    }
    public DischargeRecord peek() {                         //This methods is why view top data. Time complexcity is O(1).
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return top.data;                                    //Return top data.
    }
    public void printStack() {                              //Time complexcity is O(n).
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;                                         //exit method
        }
        Node temp = top;                                    //temporary node reference top
        while(temp != null) {                               //traverse to stack begginnig for end.
            DischargeRecord item = temp.data;               //gets data of current node.
            System.out.println(item.toString());
            temp = temp.next;                               //pass to next node.
        }
    }
}
