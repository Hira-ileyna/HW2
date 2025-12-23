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
        patientList.findPatient(347).printPatient();
        System.out.println(patientList.findPatient(684).printPatient()); // This allows us to see in the console that the test returns true.
        patientList.printList();

        TreatmentQueue treatmentQueue = new TreatmentQueue();
        treatmentQueue.enqueue(new TreatmentRequest(1, true));
        treatmentQueue.enqueue(new TreatmentRequest(2,true));
        treatmentQueue.enqueue(new TreatmentRequest(3,true));
        treatmentQueue.enqueue(new TreatmentRequest(4,true));
        treatmentQueue.enqueue(new TreatmentRequest(5,false));
        treatmentQueue.enqueue(new TreatmentRequest(6,false));
        treatmentQueue.enqueue(new TreatmentRequest(7,false));
        treatmentQueue.enqueue(new TreatmentRequest(8,false));

        treatmentQueue.dequeue();
        treatmentQueue.dequeue();
        treatmentQueue.dequeue();

        treatmentQueue.printQueue();

        DischargeStack dischargeStack = new DischargeStack();
        dischargeStack.push(new DischargeRecord(1));
        dischargeStack.push(new DischargeRecord(2));
        dischargeStack.push(new DischargeRecord(3));
        dischargeStack.push(new DischargeRecord(4));
        dischargeStack.push(new DischargeRecord(5));

        dischargeStack.pop();
        dischargeStack.pop();


        dischargeStack.printStack();


    }
}