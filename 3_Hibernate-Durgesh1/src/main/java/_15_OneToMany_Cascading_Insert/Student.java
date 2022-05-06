package _15_OneToMany_Cascading_Insert;

import javax.persistence.*;
import java.util.List;

//@Entity
@Entity(name = "Student")  // To detect this classes HQL Entity named Student also databale table named Student
  public class Student {
    @Id
    private int studentID;
    private String studentName;
    private String studentAddress;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Certificatee> certificates;

    public Student(int studentID, String studentName, String studentAddress, List<Certificatee> certificates) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.certificates = certificates;
    }

    public Student(String studentName, String studentAddress) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }



    public List<Certificatee> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificatee> certificates) {
        this.certificates = certificates;
    }

    public int getStudentID() {
        System.out.println("Settings of StudentID Get");
        return studentID;
    }

    public void setStudentID(int studentID) {
        System.out.println("Settings of StudentID = " + studentID + " Set by Beans");
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

     public Student(int studentID, String studentName, String studentAddress) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'';
    }
}
