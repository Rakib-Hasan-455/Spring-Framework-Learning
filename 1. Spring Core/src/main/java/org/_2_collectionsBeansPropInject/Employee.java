package org._2_collectionsBeansPropInject;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private String eName;
    private List<String> ePhones;
    private Set<Integer> eRoomNo;
    private Map<String, String> eCourses;
    private Properties eRolls;

    public Properties geteRolls() {
        return eRolls;
    }

    public void seteRolls(Properties eRolls) {
        this.eRolls = eRolls;
    }

    public Properties getProps() {
        return eRolls;
    }

    public void setProps(Properties eRolls) {
        this.eRolls = eRolls;
    }

    public Set<Integer> geteRoomNo() {
        return eRoomNo;
    }

    public void seteRoomNo(Set<Integer> eRoomNo) {
        this.eRoomNo = eRoomNo;
    }

    public Map<String, String> geteCourses() {
        return eCourses;
    }

    public void seteCourses(Map<String, String> eCourses) {
        this.eCourses = eCourses;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public List<String> getePhones() {
        return ePhones;
    }

    public void setePhones(List<String> ePhones) {
        this.ePhones = ePhones;
    }

    public Employee(String eName, List<String> ePhones) {
        this.eName = eName;
        this.ePhones = ePhones;
    }

    public Employee(String eName, List<String> ePhones, Set<Integer> eRoomNo, Map<String, String> eCourses) {
        this.eName = eName;
        this.ePhones = ePhones;
        this.eRoomNo = eRoomNo;
        this.eCourses = eCourses;
    }

    public Employee(String eName, List<String> ePhones, Set<Integer> eRoomNo, Map<String, String> eCourses, Properties eRolls) {
        this.eName = eName;
        this.ePhones = ePhones;
        this.eRoomNo = eRoomNo;
        this.eCourses = eCourses;
        this.eRolls = eRolls;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eName='" + eName + '\'' +
                ", \nePhones=" + ePhones +
                ", \neRoomNo=" + eRoomNo +
                ", \neCourses=" + eCourses +
                ", \neRolls =" + eRolls +
                '}';
    }
}
