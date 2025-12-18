public class DischargeStack {
    private class Node {
        private DischargeRecord data;
        private Node next;
        private Node(DischargeRecord data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    private int size;
    public DischargeStack() {
        this.top = null;
        this.size = 0;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public int size() {
        return size;
    }//bvvb
    public void push(DischargeRecord data) {
        if(data == null) {
            throw new IllegalArgumentException("Data should not be null");
        }
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
        while(temp != null) {
            DischargeRecord item = temp.data;
            System.out.println(item.toString());
            temp = temp.next;
        }
    }
}
