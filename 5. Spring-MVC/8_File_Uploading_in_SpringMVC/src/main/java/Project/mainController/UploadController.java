package Project.mainController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class UploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String uploader(@RequestParam("uploadimagee") CommonsMultipartFile file,
                           HttpSession session,
                           Model model) {
        System.out.println((double) (file.getSize()/(1024.0*1024.0))+" MB");
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getStorageDescription());
        byte[] fileData = file.getBytes();
        // We have to save this into server
        String path = session.getServletContext().getRealPath("/")+ File.separator+"WEB-INF"+ File.separator +"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
        System.out.println(path);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            fileOutputStream.write(fileData);
            model.addAttribute("filename", file.getOriginalFilename());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("uploading error");
        }
        System.out.println("Uploaded");
        return "uploadMessage";
    }

}
