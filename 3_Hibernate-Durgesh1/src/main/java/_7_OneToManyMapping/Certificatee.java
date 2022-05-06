package _7_OneToManyMapping;

import javax.persistence.*;

@Entity
public class Certificatee {
    @Id
    private int certificateID;
    private String course;
    private String duration;

    @ManyToOne
    private Student student;

    public Certificatee() {
    }

    public Certificatee(int certificateID, String course, String duration) {
        this.certificateID = certificateID;
        this.course = course;
        this.duration = duration;
    }

    public Certificatee(int certificateID, String course, String duration, Student student) {
        this.certificateID = certificateID;
        this.course = course;
        this.duration = duration;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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
