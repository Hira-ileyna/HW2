import java.util.HashMap;

public class HospitalSystem {
    private final PatientList patientList = new PatientList();
    private final TreatmentQueue treatmentQueue = new TreatmentQueue();
    private final TreatmentQueue priorityQueue = new TreatmentQueue();
    private final DischargeStack dischargeStack = new DischargeStack();
    private final HashMap <Integer, Patient> patientMap = new HashMap();

    public void add(Patient patient){
        patientList.addPatient(patient);
        patientMap.put(patient.getId(), patient);
    }
    public void add(TreatmentRequest request){

    }
    public void add(DischargeRecord record){

    }


}
