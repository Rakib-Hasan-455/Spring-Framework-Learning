package Project.Services;

import Project.DAO.PatientDAO;
import Project.Model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientDAO patientDAO;
    public int createPatient(Patient patient) {
        return this.patientDAO.saveUser(patient);
    }
}
