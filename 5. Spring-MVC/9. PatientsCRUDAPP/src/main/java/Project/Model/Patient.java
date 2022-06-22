package Project.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String patientName;
    private String patientAge;
    private String patientPhone;

    public Patient(String patientName, String patientAge, String patientPhone) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientPhone = patientPhone;
    }

    public Patient(int id, String patientName, String patientAge, String patientPhone) {
        this.id = id;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientPhone = patientPhone;
    }

    public Patient() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientName='" + patientName + '\'' +
                ", patientAge='" + patientAge + '\'' +
                ", patientPhone='" + patientPhone + '\'' +
                '}';
    }
}
