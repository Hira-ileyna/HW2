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

        TreatmentQueue treatmentQueue = new TreatmentQueue();

        TreatmentRequest a = new TreatmentRequest(123);
        TreatmentRequest b = new TreatmentRequest(356);
        TreatmentRequest c = new TreatmentRequest(684);
        TreatmentRequest d = new TreatmentRequest(347);
        TreatmentRequest e = new TreatmentRequest(694);
        TreatmentRequest f = new TreatmentRequest(753);
        TreatmentRequest g = new TreatmentRequest(505);

        treatmentQueue.dequeue();
        treatmentQueue.dequeue();
        treatmentQueue.dequeue();

        treatmentQueue.printQueue();

        DischargeStack dischargeStack = new DischargeStack();

        DischargeRecord x = new DischargeRecord(123, 265646);
        DischargeRecord y = new DischargeRecord(253, 265647);
        DischargeRecord z = new DischargeRecord(369, 265648);
        DischargeRecord w = new DischargeRecord(224, 265649);
        DischargeRecord h = new DischargeRecord(147, 265645);

        dischargeStack.pop();
        dischargeStack.pop();

        dischargeStack.printStack();


    }
}