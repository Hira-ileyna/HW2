public class DischargeRecord {
    private final int patientId;                            //This information shouldn't change so we use 'final' keyword.
    private long dischargeTime;

    public DischargeRecord(int patientId,  long dischargeTime) {
        if (patientId <= 0) {
            throw new IllegalArgumentException("patient id should be greater than 0");
        }
        this.patientId = patientId;
        this.dischargeTime = dischargeTime;


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
