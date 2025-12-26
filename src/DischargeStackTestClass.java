public class DischargeStackTestClass {
    public static void main (String[] args) {
        DischargeStack dischargeStack = new DischargeStack();
        dischargeStack.push(new DischargeRecord(1, System.currentTimeMillis()));
        dischargeStack.push(new DischargeRecord(2,System.currentTimeMillis()+1000));
        dischargeStack.push(new DischargeRecord(3,System.currentTimeMillis()+2000));
        dischargeStack.push(new DischargeRecord(4,System.currentTimeMillis()+3000));
        dischargeStack.push(new DischargeRecord(5,System.currentTimeMillis()+4000));

        dischargeStack.pop();
        dischargeStack.pop();

        dischargeStack.printStack();
    }
}
