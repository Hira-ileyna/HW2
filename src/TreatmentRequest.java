public class TreatmentRequest {
    private final int patientId;
    private final long arrivialTime = System.currentTimeMillis();

    TreatmentRequest(int patientId){
        this.patientId = patientId;
    }
    public int getPatientId() {
        return patientId;
    }
    public long getArrivialTime() {
        return arrivialTime;
    }
    @Override
    public String toString(){
        return "TreatmentRequest " + patientId +
                ", arrivialTime= " + arrivialTime;
    }

}
