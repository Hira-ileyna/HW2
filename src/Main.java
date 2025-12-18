//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PatientList patientList = new PatientList();
        patientList.addPatient(new Patient(123, "Hira", 2, 22));
        patientList.addPatient(new Patient(124, "İleyna", 3, 25));
        patientList.addPatient(new Patient(356, "Nil", 5, 45));
        patientList.addPatient(new Patient(684, "İpek", 4, 57));
        patientList.addPatient(new Patient(347, "Azra", 7, 20));
        patientList.removePatient(124);
        patientList.findPatient(347);
        System.out.println(patientList.findPatient(684)); // This allows us to see in the console that the test returns true.
        patientList.printList();
//bv
        TreatmentQueue treatmentQueue = new TreatmentQueue();
        treatmentQueue.enqueue(new TreatmentRequest(1));
        treatmentQueue.enqueue(new TreatmentRequest(2));
        treatmentQueue.enqueue(new TreatmentRequest(3));
        treatmentQueue.enqueue(new TreatmentRequest(4));
        treatmentQueue.enqueue(new TreatmentRequest(5));
        treatmentQueue.enqueue(new TreatmentRequest(6));
        treatmentQueue.enqueue(new TreatmentRequest(7));
        treatmentQueue.enqueue(new TreatmentRequest(8));

        treatmentQueue.dequeue();
        treatmentQueue.dequeue();
        treatmentQueue.dequeue();

        treatmentQueue.printQueue();

        DischargeStack dischargeStack = new DischargeStack();
        dischargeStack.push(new DischargeRecord(1,System.currentTimeMillis()));
        dischargeStack.push(new DischargeRecord(2,System.currentTimeMillis()));
        dischargeStack.push(new DischargeRecord(3,System.currentTimeMillis()));
        dischargeStack.push(new DischargeRecord(4,System.currentTimeMillis()));
        dischargeStack.push(new DischargeRecord(5,System.currentTimeMillis()));

        dischargeStack.pop();
        dischargeStack.pop();

        dischargeStack.printStack();


    }
}