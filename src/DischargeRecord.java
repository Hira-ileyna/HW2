public class DischargeRecord {
    private final int patientId;
    private final long dischargeTime;

    DischargeRecord(int patientId, long dischargeId) {
        if (patientId <= 0) {
            throw new IllegalArgumentException("patient id should be greater than 0");
        }
        if (dischargeId <= 0) {
            throw new IllegalArgumentException("discharge id should be greater than 0");
        }
        this.patientId = patientId;
        this.dischargeTime = dischargeId;
    }
    public int getPatientId() {
        return patientId;
    }//vbvvb
    public long getDischargeTime() {
        return dischargeTime;
    }
    @Override
    public String toString() {
        return "Patient ID: " + patientId + ", Discharge Time: " + dischargeTime;
    }

}
