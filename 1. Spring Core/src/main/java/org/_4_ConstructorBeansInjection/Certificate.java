package org._4_ConstructorBeansInjection;

public class Certificate {
    private String courseName;

    public Certificate(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}
