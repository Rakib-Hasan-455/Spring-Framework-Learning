package _2_FirstHibernateWithAnnotation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
@Entity   // To detect this classes HQL Entity named Studenttable
@Table(name = "student")// To create a table named studentnewtable in main database
 public class Student {
    @Id
    private int studentID;
    private String studentName;
    private String studentAddress;

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
        return "Student[" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ']';
    }
}
