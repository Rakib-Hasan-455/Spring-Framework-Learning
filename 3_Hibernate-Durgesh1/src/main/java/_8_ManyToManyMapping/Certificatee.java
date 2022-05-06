package _8_ManyToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Certificatee {
    @Id
    private int certificateID;
    private String course;
    private String duration;

    @ManyToMany
    private List<Student> students;

    public Certificatee() {
    }

    public Certificatee(int certificateID, String course, String duration) {
        this.certificateID = certificateID;
        this.course = course;
        this.duration = duration;
    }


    public Certificatee(int certificateID, String course, String duration, List<Student> students) {
        this.certificateID = certificateID;
        this.course = course;
        this.duration = duration;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Certificatee(String course, String duration) {
        this.course = course;
        this.duration = duration;
    }

    public int getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(int certificateID) {
        this.certificateID = certificateID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Certificatee{" +
                "course='" + course + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
