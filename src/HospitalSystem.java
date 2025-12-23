import java.util.HashMap;

public class HospitalSystem {
    private final PatientList patientList = new PatientList();
    private final TreatmentQueue treatmentQueue = new TreatmentQueue();
    private final TreatmentQueue priorityQueue = new TreatmentQueue();
    private final DischargeStack dischargeStack = new DischargeStack();
    private final HashMap <Integer, Patient> patientMap = new HashMap();

    public void addPatient(Patient patient){
        patientList.addPatient(patient);
        patientMap.put(patient.getId(), patient);
    }
    public void addTreanmentRequest(TreatmentRequest request){
        treatmentQueue.enqueue(request);
    }
    public void addDischargeRecord(DischargeRecord record){
        dischargeStack.push(record);
    }
    public void processTreatmentRequest(){
        TreatmentRequest request = treatmentQueue.dequeue();
        if(request != null){
            System.out.println("Treatment request received");
            return;
        }
        Patient patient = patientMap.get(request.getPatientId());
        dischargeStack.push(new DischargeRecord(request.getPatientId()));
        System.out.println("Processed treatment request: " + request);
    }
    public void printHospitalSystem(){
        System.out.println("Hospital System");
        patientList.printList();
        System.out.println("Treatment Queues: ");
        treatmentQueue.printQueue();
        System.out.println("Priority Queues: ");
        priorityQueue.printQueue();
        System.out.println("Discharge Queues: ");
        dischargeStack.printStack();
        System.out.println("Sorted Patients by Severtiy: ");

    }


}
