public class DischargeRecord {
    private final int patientId;
    private final long dischargeTime;

    DischargeRecord(int patientId, long dischargeId) {
        this.patientId = patientId;
        this.dischargeTime = dischargeId;
    }
    public int getPatientId() {
        return patientId;
    }
    public long getDischargeTime() {
        return dischargeTime;
    }
    @Override
    public String toString() {
        return "Patient ID: " + patientId + ", Discharge Time: " + dischargeTime;
    }

}
