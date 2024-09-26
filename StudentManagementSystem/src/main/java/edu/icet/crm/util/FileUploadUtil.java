package edu.icet.crm.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileUploadUtil {
    public static void saveFile(String uploadDir, String imgName, MultipartFile imgFile) throws IOException {
        Path uploadPath= Paths.get("F:\\ICET\\EnterPriseLevel\\Assignment\\StudentManagementSystem\\src\\main\\resources\\images\\"+uploadDir);
        if(!Files.exists(uploadPath)){
            Files.createDirectories(uploadPath);
        }
        try(InputStream inputStream=imgFile.getInputStream()){
            Path filePath=uploadPath.resolve(imgName);
            Files.copy(inputStream,filePath, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException ioException){
            System.out.println(ioException);
        }


    }
}
