package _10_Hibernate_Object_States;

import javax.persistence.Embeddable;

@Embeddable
public class Certificatee {
    private String course;
    private String duration;

    public Certificatee() {
    }

    public Certificatee(String course, String duration) {
        this.course = course;
        this.duration = duration;
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
