package com.ndourcodeur.ecommercespringapirest.resources;

import com.ndourcodeur.ecommercespringapirest.entities.ContactForm;
import com.ndourcodeur.ecommercespringapirest.message.Message;
import com.ndourcodeur.ecommercespringapirest.services.EmailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


/**
 * @author NdourCodeur
 **/

@RestController
@RequestMapping("/api")
public class ContactController {

	private final EmailService emailService;

	public ContactController(EmailService emailService) {
		this.emailService = emailService;
	}


	/**
	 *   URL ====>  http://localhost:8080/api/v1/contact/sendEmail
	 */
	@PostMapping("/v1/contact/sendEmail")
	public ResponseEntity<?> sendEmail(@Valid @RequestBody ContactForm contactForm) {
		
		emailService.send(contactForm);
		
		return new ResponseEntity<>(new Message("Email sent with success (:"), HttpStatus.CREATED);
	}
}
