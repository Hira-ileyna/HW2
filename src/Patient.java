public class Patient {
    private int id;
    private String name;
    private int severity; // severity level of illness(1-10)
    private int age;

    public Patient() {

    }
    public Patient(int id, String name, int severity, int age) {
        if(severity < 1 || severity > 10){              //This if statement is that severity level of illness is correct.
            System.out.println("Invalid severity");
        }
        if(age <0){                                     //This if statement provide to protect negative number for age because age cannot be negative.
            System.out.println("Invalid age");
        }
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }
    public int getId() {                                 // getter and setter methods provide to that can be use private variables.(Encapsulation)
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSeverity() {
        return severity;
    }
    public void setSeverity(int severity) {
        this.severity = severity;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String printPatient() {                         // Print of all patient.
        return ("Patient name: " + name +
                ", severity: " + severity +
                ", age: " + age +
                ", Id: " + id);
    }
}
