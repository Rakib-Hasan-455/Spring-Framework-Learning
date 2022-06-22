package Project.DAO;

import Project.Model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class PatientDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public int saveUser(Patient patient) {
        this.hibernateTemplate.saveOrUpdate(patient);
        return patient.getId();
    }

    //get all patinets
    public List<Patient> getPatients() {
     List<Patient> patients = this.hibernateTemplate.loadAll(Patient.class);
     return patients;
    }

    public Patient getPatient(int id) {
         return this.hibernateTemplate.get(Patient.class, id);
    }

    @Transactional
    public void deletePatient(int id) {
        Patient patient = getPatient(id);
        this.hibernateTemplate.delete(patient);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
