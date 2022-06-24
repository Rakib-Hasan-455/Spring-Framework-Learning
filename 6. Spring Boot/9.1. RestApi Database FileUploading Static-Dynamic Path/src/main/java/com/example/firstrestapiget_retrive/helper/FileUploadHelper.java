package com.example.firstrestapiget_retrive.helper;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileUploadHelper {
    // uploadDir = "G:\\" -> Static path
    public final String UploadDir = new ClassPathResource("/static/uploadedImages").getFile().getAbsolutePath();

    public FileUploadHelper() throws IOException {
    }

    public boolean uploadFile(MultipartFile multipartFile) {
        System.out.println(UploadDir);
        System.out.println(UploadDir+File.separator+multipartFile.getOriginalFilename());
        boolean boolValue = false;
        MultipartFile file = multipartFile;
        System.out.println((double) (file.getSize()/(1024.0*1024.0))+" MB");
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
         try {
            /*byte[] fileData = multipartFile.getBytes();
            FileOutputStream fileOutputStream = new FileOutputStream(UploadDir);
            fileOutputStream.write(fileData);
             fileOutputStream.flush();
             fileOutputStream.close();
             boolValue = true;*/
             Files.copy(multipartFile.getInputStream(), Paths.get(UploadDir+File.separator+multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
             boolValue = true;
         } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return boolValue;
    }
}
