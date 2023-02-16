//package com.javaspring.batchprocessingdemo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//
//import org.springframework.stereotype.Component;
//
//@Component
//public class EmailServiceImpl extends SimpleMailMessage {
//    @Autowired
//    private JavaMailSender javaMailSender;
//
//    void sendEmail() {
//
//        SimpleMailMessage msg = new SimpleMailMessage();
//        msg.setTo("rohiniprakash212@gmail.com");
//
//        msg.setSubject("Testing from Spring Boot");
//        msg.setText("Hello World \n Spring Boot Email");
//
//        javaMailSender.send(msg);
//
//}
