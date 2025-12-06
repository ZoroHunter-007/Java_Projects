package com.example.SpringImageAPIDev;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/upload")
public class ImageUploadController {

	@Value("${file.upload-dir}")
	private String imageUpload;
	
	@PostMapping("/images")
	public ResponseEntity<String>uploadImage(@RequestParam("file") MultipartFile file) throws IOException{
		String filePath=saveImage(file);
		return ResponseEntity.ok("Image uploaded Successfully: "+ filePath);
	}

	private String saveImage(MultipartFile file) throws IOException{
		// TODO Auto-generated method stub
		Path uploadPath=Paths.get(imageUpload);
		if(!Files.exists(uploadPath)) {
			Files.createDirectories(uploadPath);
		}
		String fileName=file.getOriginalFilename();
		Path filePath=uploadPath.resolve(fileName);
		Files.copy(file.getInputStream(),filePath,StandardCopyOption.REPLACE_EXISTING);
		return filePath.toString();
	}
	
	
	@GetMapping("/images/{filename}")
	public ResponseEntity<Resource> getImage(@PathVariable String filename){
		
		
		try {
			Path filePath=Paths.get(imageUpload).resolve(filename);
			Resource resource=new UrlResource(filePath.toUri());
			
			if(resource.exists()) {
				return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(resource);
			}
			else {
				return ResponseEntity.notFound().build();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	
}
