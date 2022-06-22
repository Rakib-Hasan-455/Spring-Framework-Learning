package Project.Controller;

import Project.DAO.PatientDAO;
import Project.Model.Patient;
import Project.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PatientSignUpController {

    @Autowired
    private PatientDAO patientDAO;

    @RequestMapping("/")
    public String home() {
        return "index";
    }


    @RequestMapping("/signup")
    public String signup (@ModelAttribute Patient patient) {
        System.out.println(patient);
        this.patientDAO.saveUser(patient);
        return "successfulSignup";
    }

    @RequestMapping("/viewPatients")
    public String viewPatients(Model model) {
        List<Patient> patients = patientDAO.getPatients();
        model.addAttribute("patients", patients);
        return "viewPatients";
    }

    @RequestMapping("/updateAndViewPatients")
    public String updateAndViewPatients(@ModelAttribute Patient patient, Model model) {
        this.patientDAO.saveUser(patient);
        List<Patient> patients = patientDAO.getPatients();
        model.addAttribute("patients", patients);
        return "viewPatients";
    }

    @RequestMapping("/delete/{patientID}")
    public String deletePatientt(@PathVariable("patientID") int patientIDD) {
        System.out.println(patientIDD);
        this.patientDAO.deletePatient(patientIDD);
    return "redirect:/viewPatients";
    }

    @RequestMapping("/update/{patientID}")
    public String updateForm(@PathVariable("patientID") int patientIDD, Model model) {
        System.out.println(patientIDD);
            Patient patient = this.patientDAO.getPatient(patientIDD);
        System.out.println(patient);

            model.addAttribute("patientt", patient);
        return "updateForm";
    }
}
