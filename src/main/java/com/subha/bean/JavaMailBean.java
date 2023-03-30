package com.subha.bean;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import lombok.Getter;
import lombok.Setter;

@Configuration
@Setter
@Getter
public class JavaMailBean {
	/*
	 * @Value("${spring.mail.host}") private String host;
	 * 
	 * @Value("${spring.mail.port}") private String port;
	 * 
	 * @Value("${spring.mail.username}") private String username;
	 * 
	 * @Value("${spring.mail.password}") private String password;
	 */
	
	@Bean
	public JavaMailSender mailSenderBean() {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		JavaMailSenderImpl mailSender=new JavaMailSenderImpl();
		mailSender.setHost("smtp.gmail.com");
	    mailSender.setPort(587);
	    
	    mailSender.setUsername("dsubhajit148@gmail.com");
	    mailSender.setPassword("wuxhqmirudtbfdvk");
	    
	    Properties props = mailSender.getJavaMailProperties();
	    props.put("mail.transport.protocol", "smtp");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.debug", "true");
		return mailSender;
	}

}
