import java.util.HashMap;

public class HospitalSystem {
    private final PatientList patientList = new PatientList();
    private final TreatmentQueue treatmentQueue = new TreatmentQueue();
    private final DischargeStack dischargeStack = new DischargeStack();
    private final HashMap<Integer, Patient> patientMap = new HashMap();

    public HospitalSystem(PatientList patientList, TreatmentQueue treatmentQueue, DischargeStack dischargeStack) {
            patientList = patientList;
            treatmentQueue = treatmentQueue;
            dischargeStack = dischargeStack;
    }
}
//vbvb