public class TreatmentRequest {
    private final int patientId;
    private final long arrivalTime = System.currentTimeMillis();

    public TreatmentRequest(int patientId){
        if(patientId <= 0){
            throw new IllegalArgumentException("Patient ID must be greater than 0.");
        }
        this.patientId = patientId;
    }//vb
    public int getPatientId() {
        return patientId;
    }
    public long getArrivalTime() {
        return arrivalTime;
    }
    @Override
    public String toString(){
        return "TreatmentRequest " + patientId +
                ", arrivalTime= " + arrivalTime;
    }
}
