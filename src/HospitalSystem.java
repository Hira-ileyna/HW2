import java.util.HashMap;

public class HospitalSystem {
    private final PatientList patientList = new PatientList();                          //Linkedlist of that kept patient.
    private final TreatmentQueue treatmentQueue = new TreatmentQueue();                 //Queue of that kept normal patient.
    private final TreatmentQueue priorityQueue = new TreatmentQueue();                  //Queue of that kept priority patient.
    private final DischargeStack dischargeStack = new DischargeStack();                 //Stack of that kept discharge records
    private final HashMap <Integer, Patient> patientMap = new HashMap();                //HashMap for quickly searching patients by ID.

    public void addPatient(Patient patient){                                            //method is for that add to new patient in the system.
        patientList.addPatient(patient);                                                //Add a patient to the list.
        patientMap.put(patient.getId(), patient);                                       //Add the patient to the list by their ID for quick access. Time complexity: O(1)
    }
    public void addTreatmentRequest(TreatmentRequest request){                          //Method is treatment request adding.

        if(!patientMap.containsKey(request.getPatientId())){                             //This case checks if this patient is present.
            System.out.println("Didn't add treatment request: Patient ID: " + request.getPatientId() + " not found");
            return;                                                                     //leave from the method
        }

        if (request.isPriority()) {                                                     //If patient is priority
            priorityQueue.enqueue(request);                                             //Add to priority queue.
            System.out.println("Added priority treatment request: Patient ID: " + request.getPatientId());
        } else {
            treatmentQueue.enqueue(request);
            System.out.println("Added treatment request: Patient ID: " + request.getPatientId());
            }
        }
    public void addDischargeRecord(DischargeRecord dischargerecord){                             //
        if(!patientMap.containsKey(dischargerecord.getPatientId())){                              //
            System.out.println("Didn't add discharge record: Patient ID: " + dischargerecord.getPatientId() + " not found");
            return;                                                                     //
        }
        dischargeStack.push(dischargerecord);                                                    //
        System.out.println("Added Discharge record: Patient ID: " + dischargerecord.getPatientId());
    }

    public void processTreatmentRequest(){
        TreatmentRequest request = priorityQueue.dequeue();
        if (request == null) {
            request = treatmentQueue.dequeue();
            return;
        }
        if(request == null){
            System.out.println("No treatment request to process.");
        }
        Patient patient = patientMap.get(request.getPatientId());
        if (patient == null) {
            System.out.println("Patient not found for request: " + request.getPatientId());
            return;
        }
        System.out.println("Processed treatment request: " + request);
    }

    public static void mergeSortBySeverity(Patient[] array){                            //
        if(array == null || array.length <= 1)                                          //
            return;                                                                     //
        Patient[] temp = new Patient[array.length];                                     //
        sort(array, temp, 0, array.length - 1);                               //
    }
    private static void sort(Patient[] array, Patient[] temp, int low, int high){       //
        if(low >= high){                                                                //
            return;                                                                     //
        }
        int mid = low + (high - low)/2;                                                 //
        sort(array, temp, low, mid);                                                    //
        sort(array, temp, mid + 1, high);                                          //
        merge(array, temp, low, mid, high);                                             //
    }
    private static void merge(Patient[] array, Patient[] temp, int low, int mid, int high){ //
        int i = low;
        int j = mid + 1;
        int k = low; // low’dan başlamalı
        while (i <= mid && j <= high) {
            if (array[i].getSeverity() >= array[j].getSeverity()) { // azalan
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= high) {
            temp[k++] = array[j++];
        }
        for (int x = low; x <= high; x++) { // doğru aralık
            array[x] = temp[x];
        }

    }
    public void printHospitalSystem(){                                                      //
        System.out.println("Hospital System");
        patientList.printList();
        System.out.println("Treatment Queues: ");
        treatmentQueue.printQueue();
        System.out.println("Priority Queues: ");
        priorityQueue.printQueue();
        System.out.println("Discharge Queues: ");
        dischargeStack.printStack();
        System.out.println("Sorted Patients by Severtiy: ");
        Patient[] array = patientList.toArray();                                          //
        HospitalSystem.mergeSortBySeverity(array);                                        //
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
