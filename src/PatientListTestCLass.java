public class PatientListTestCLass {
    public static void main(String[] args) {
        PatientList patientList = new PatientList();
        patientList.addPatient(new Patient(123, "Hira", 2, 22));
        patientList.addPatient(new Patient(124, "İleyna", 3, 25));
        patientList.addPatient(new Patient(346, "Nil", 5, 45));
        patientList.addPatient(new Patient(684, "İpek", 4, 57));
        patientList.addPatient(new Patient(347, "Azra", 7, 20));
        patientList.removePatient(124);
        patientList.printList();
        System.out.println(patientList.findPatient(347).printPatient());    // This allows us to see in the console that the test returns true.
    }
}
