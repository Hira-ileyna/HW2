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
        System.out.println(patientList.findPatient(684).printPatient());            // This allows us to see in the console that the test returns true.
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

        HospitalSystem hospitalSystem = new HospitalSystem();
        hospitalSystem.addPatient(new Patient(152, "Ahmet Kalın" , 7, 45));
        hospitalSystem.addPatient(new Patient(148,"Mehmet Çiçek", 4, 30));
        hospitalSystem.addPatient(new Patient(132,"Murat Sayın", 9, 60));
        hospitalSystem.addPatient(new Patient(478,"Zeynep Soygun", 3, 22));
        hospitalSystem.addPatient(new Patient(556,"Ayşenur Melek", 6, 40));
        hospitalSystem.addPatient(new Patient(648,"Aynur Bilgin", 8, 56));
        hospitalSystem.addPatient(new Patient(796,"Mustafa Yılmaz", 5, 35));
        hospitalSystem.addPatient(new Patient(822,"Fatma Kurşun", 2, 19));
        hospitalSystem.addPatient(new Patient(122,"Kenan Kaşık", 10, 78));
        hospitalSystem.addPatient(new Patient(369,"Nursema Yılmış", 1, 25));

        hospitalSystem.addTreatmentRequest(new TreatmentRequest(152, false));
        hospitalSystem.addTreatmentRequest(new TreatmentRequest(148, false));
        hospitalSystem.addTreatmentRequest(new TreatmentRequest(132, false));
        hospitalSystem.addTreatmentRequest(new TreatmentRequest(478, false));
        hospitalSystem.addTreatmentRequest(new TreatmentRequest(556, false));

        hospitalSystem.addTreatmentRequest(new TreatmentRequest(648, true));
        hospitalSystem.addTreatmentRequest(new TreatmentRequest(796, true));
        hospitalSystem.addTreatmentRequest(new TreatmentRequest(822, true));

        hospitalSystem.addDischargeRecord(new DischargeRecord(478));
        hospitalSystem.addDischargeRecord(new DischargeRecord(556));

        hospitalSystem.printHospitalSystem();                                   // I noticed during testing that because we added 3 priorities, the output showed "priority queue is empty".
                                                                                // To make sure the code was working correctly, I tested it one more time in the processTreatmentRequest section.

        hospitalSystem.processTreatmentRequest();
        hospitalSystem.processTreatmentRequest();
        hospitalSystem.processTreatmentRequest();
        hospitalSystem.processTreatmentRequest();

        hospitalSystem.printHospitalSystem();


    }
}