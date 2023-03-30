package com.subha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.subha.service.MailService;

@SpringBootApplication
public class SpringWIthAttachmentResumeByEMailApplication {
	@Autowired
	private MailService mailService;

	public static void main(String[] args) {
		SpringApplication.run(SpringWIthAttachmentResumeByEMailApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws Exception {
		mailService.sendMail("subhajit.dw@gmail.com","SpringEmailDemo", "my resume","C:\\Users\\dsubh\\OneDrive\\Desktop\\New folder\\SubhajitResume.docx");
	}

}
