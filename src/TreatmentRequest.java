public class TreatmentRequest {
    private int patientId;
    private long arrivialTime = System.currentTimeMillis();

    TreatmentRequest(int patientId){
        this.patientId = patientId;
    }
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public long getArrivialTime() {
        return arrivialTime;
    }


}
