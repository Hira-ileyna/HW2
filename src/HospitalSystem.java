import java.util.HashMap;

public class HospitalSystem {
    private final PatientList patientList = new PatientList();                          //Linkedlist of that kept patient.
    private final TreatmentQueue treatmentQueue = new TreatmentQueue();                 //Queue of that kept normal patient.
    private final TreatmentQueue priorityQueue = new TreatmentQueue();                  //Queue of that kept priority patient.
    private final DischargeStack dischargeStack = new DischargeStack();                 //Stack of that kept discharge records
    private final HashMap <Integer, Patient> patientMap = new HashMap();                //HashMap for quickly searching patients by ID.

    public void addPatient(Patient patient){                                            //method is for that add to new patient in the system.Time complexity: O(1)
        patientList.addPatient(patient);                                                //Add a patient to the list.Time complexity: O(1)
        patientMap.put(patient.getId(), patient);                                       //Add the patient to the list by their ID for quick access. Time complexity: O(1)
    }
    public void addTreatmentRequest(TreatmentRequest request){                          //Method is treatment request adding.Time complexity: O(1)

        if(!patientMap.containsKey(request.getPatientId())){                             //This case checks if this patient is present.Time complexity: O(1)
            System.out.println("Didn't add treatment request: Patient ID: " + request.getPatientId() + " not found");
            return;                                                                     //leave from the method
        }

        if (request.isPriority()) {                                                     //If patient is priority. Time complexity: O(1)
            priorityQueue.enqueue(request);                                             //Add to priority queue.
            System.out.println("Added priority treatment request: Patient ID: " + request.getPatientId());
        } else {                                                                        //If patient isn't priority.
            treatmentQueue.enqueue(request);                                            //Add to treatment queue.
            System.out.println("Added treatment request: Patient ID: " + request.getPatientId());
            }
        }
    public void addDischargeRecord(DischargeRecord dischargerecord){                     //This method is that adds to discharge record. Time complexity: O(1)
        if(!patientMap.containsKey(dischargerecord.getPatientId())){                     //This case checks if this patient is present. Time complexity: O(1)
            System.out.println("Didn't add discharge record: Patient ID: " + dischargerecord.getPatientId() + " not found");
            return;                                                                      //If patient isn't here. Leave from the method.
        }
        dischargeStack.push(dischargerecord);                                            //Add to discharge record to the stack. Time complexity: O(1)
        System.out.println("Added Discharge record: Patient ID: " + dischargerecord.getPatientId());
    }

    public void processTreatmentRequest(){
        TreatmentRequest request = priorityQueue.dequeue();                              //Firstly, check priority patients and remove from priority queue. Time complexity: O(1)
        if (request == null) {                                                           //If, priority queue is null
            request = treatmentQueue.dequeue();                                          //we will remove from treatment queue.
        }
        if(request == null){                                                             //If both of queues is null,
            System.out.println("No treatment request to process.");                      //No treatment request to process.
            return;                                                                      //If there is no request, leave from method.
        }
       Patient patient = patientMap.get(request.getPatientId());                        //Find the patient that in the request.
        if (patient == null) {                                                           //If there is no patient, Print that the patient is not present.
            System.out.println("Patient not found for request: " + request.getPatientId());
            return;
        }
        DischargeRecord record = new DischargeRecord(patient.getId());                   // After a treatmnet request is processed, create a discharge record and push to the stack. Time complexity is O(1)
        dischargeStack.push(record);

        System.out.println("Processed treatment request: " + request.toString());         //Report to that processed request.
    }

    public static void mergeSortBySeverity(Patient[] array){                              //Merge Sort sorts patients in descending order according to their severity. Time complexity: O(nlogn)
        if(array == null || array.length <= 1)                                            //If array is null or singly element
            return;                                                                       //Return. Because there's nothing to list.
        Patient[] temp = new Patient[array.length];                                       //We define a temporary array to use during the merge. Time complexity: O(n)
        sort(array, temp, 0, array.length - 1);                                 //
    }
    private static void sort(Patient[] array, Patient[] temp, int low, int high){         //This method performs the divide and sort part of the merge sort. Time complexity: O(nlogn)
        if(low >= high){                                                                  //If low == high , this array has a singly element, Also if low > high , this array has empty space.
            return;                                                                       //This situtaion is that happened base-case.
        }
        int mid = low + (high - low)/2;                                                   //Middle point
        sort(array, temp, low, mid);                                                      //Sort the left half of the list
        sort(array, temp, mid + 1, high);                                            //Sort the right half of the list
        merge(array, temp, low, mid, high);                                               //Combine the left half and right half of the list.
    }
    private static void merge(Patient[] array, Patient[] temp, int low, int mid, int high){ //This method combines patients according to the severity of their condition. Time complexity: O(nlogn)
        int i = low;                                                                        //Beginning of the left array.
        int j = mid + 1;                                                                    //Beginning of the right array.
        int k = low;                                                                        //Beginning of the temporary array. Start to low.
        while (i <= mid && j <= high) {                                                     //Compare when both sides have elements.
            if (array[i].getSeverity() >= array[j].getSeverity()) {                         //Since we are sorting in descending order, we need to write the greater than or equal to elements first.
                temp[k++] = array[i++];                                                     //If we chose letf, we should write to chosing element to the temp[k++].
            } else {                                                                        //If we chose letf,
                temp[k++] = array[j++];                                                     //we should write to chosing element to the temp[k++].
            }
        }
        while (i <= mid) {                                                                  //If the right side is finished first,
            temp[k++] = array[i++];                                                         //Everything on the left side should be copied to the template so that it's in the correct position.
        }
        while (j <= high) {                                                                 //If the left side is finished first
            temp[k++] = array[j++];                                                         //We copy the remaining parts of the right side.
        }
        //Here we perform copy without comparison because the sub-arrays are already sorted within themselves.
        for (int x = low; x <= high; x++) {                                                 //Once the merge operation is complete, it copies the resulting ordered sub-range from the temporary array back to the original array.
            array[x] = temp[x];
        }
    }
    public void printHospitalSystem(){                                                      //Print to all of datas in the system. Time complexity: O(nlogn)
        System.out.println("Hospital System");
        patientList.printList();                                                            //Print the patient list. Time complexity: O(n)
        System.out.println("Treatment Queues: ");
        treatmentQueue.printQueue();                                                        //Print the treatment queue. Time complexity: O(n)
        System.out.println("Priority Queues: ");
        priorityQueue.printQueue();                                                         //print the priority queue. Time complexity: O(n)
        System.out.println("Discharge Queues: ");
        dischargeStack.printStack();                                                        //print the discharge stack. Time complexity: O(n)
        System.out.println("Sorted Patients by Severity: ");
        Patient[] array = patientList.toArray();                                            //Convert the patients on the linked list into an array. Time complexity: O(n)
        HospitalSystem.mergeSortBySeverity(array);                                          //Sort the array in descending order of severity. Time complexity: O(nlogn)
        for(int i = 0; i < array.length; i++){                                              //Print the sorted array. Time complexity: O(n)
            System.out.println(array[i]);
        }
    }
}
