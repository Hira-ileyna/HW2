public class TreatmentRequest {
    private final int patientId;
    private final long arrivalTime;
    private final boolean priority;

    public TreatmentRequest(int patientId,boolean priority){
        if(patientId <= 0){                             //Invalid Id founded and error decrease.
            throw new IllegalArgumentException("Patient ID must be greater than 0.");
        }
        this.patientId = patientId;
        this.priority = priority;
        this.arrivalTime = System.currentTimeMillis();
    }
    public int getPatientId() {
        return patientId;
    }
    public long getArrivalTime() {
        return arrivalTime;
    }
    public boolean isPriority() {
        return priority;
    }
    public String toString(){
        return "TreatmentRequest:  patient ID=" + patientId +
                ", arrivalTime= " + arrivalTime +
                ", priorty=" + priority;
    }
}
