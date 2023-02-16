package com.javaspring.batchprocessingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

//import jakarta.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//import java.io.IOException;


@SpringBootApplication
public class BatchProcessingDemoApplication  {

	//@Autowired
	//private JavaMailSender javaMailSender;

	public static void main(String[] args) {
		SpringApplication.run(BatchProcessingDemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) {
//
//		System.out.println("Sending Email...");
//
//		sendEmail();
//		//sendEmailWithAttachment();
//
//		System.out.println("Done");
//
//	}

//	void sendEmail() {
//
//		SimpleMailMessage msg = new SimpleMailMessage();
//		msg.setTo("rohiniprakash212@gmail.com");
//
//		msg.setSubject("Testing from Spring Boot");
//		msg.setText("Hello World \n Spring Boot Email");
//
//		javaMailSender.send(msg);
//
//	}

}
