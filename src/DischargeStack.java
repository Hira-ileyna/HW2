public class DischargeStack <DischargeRecord> {
    private class Node {
        DischargeRecord data;
        Node next;
        Node(DischargeRecord data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node top;
    private int size;
    public DischargeStack() {
        this.top = null;
        this.size = 0;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public void push(DischargeRecord data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    public DischargeRecord pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        DischargeRecord item = top.data;
        top = top.next;
        size--;
        return item;
    }
    public DischargeRecord peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return top.data;
    }
    public void printStack() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while(temp.next != null) {
            temp = temp.next;
        }
    }

}
