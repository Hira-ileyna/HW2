public class DischargeRecord {
    private final int patientId;                            //This information shouldn't change so we use 'final' keyword.
    private long dischargeTime;

    public DischargeRecord(int patientId) {
        if (patientId <= 0) {
            throw new IllegalArgumentException("patient id should be greater than 0");
        }
        this.patientId = patientId;


    }
    public int getPatientId() {
        return patientId;
    }
    public long getDischargeTime() {
        return dischargeTime;
    }

    public String toString() {
        return "Patient ID: " + patientId + ", Discharge Time: " + dischargeTime;
    }

}
