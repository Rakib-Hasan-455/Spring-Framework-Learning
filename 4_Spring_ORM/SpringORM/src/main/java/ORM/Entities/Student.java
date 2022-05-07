package ORM.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private int studentID;
    private String studentName;
    private String studnetAddress;

    public Student() {
    }

    public Student(int studentID, String studentName, String studnetAddress) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studnetAddress = studnetAddress;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudnetAddress() {
        return studnetAddress;
    }

    public void setStudnetAddress(String studnetAddress) {
        this.studnetAddress = studnetAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studnetAddress='" + studnetAddress + '\'' +
                '}';
    }
}
