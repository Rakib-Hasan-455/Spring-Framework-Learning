package org.SpringJDBC.MODEL;

public class Student {
    private int SID;
    private String SName;
    private String SCity;

    public Student(int SID, String SName, String SCity) {
        this.SID = SID;
        this.SName = SName;
        this.SCity = SCity;
    }

    public Student() {
    }

    public int getSID() {
        return SID;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getSCity() {
        return SCity;
    }

    public void setSCity(String SCity) {
        this.SCity = SCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "SID=" + SID +
                ", SName='" + SName + '\'' +
                ", SCity='" + SCity + '\'' +
                '}';
    }
}
