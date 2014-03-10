package pl.krzaq.rest.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pl.krzaq.model.ContactForm;



@Path("/mail")
public class MailService {

	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	private String sendMail(ContactForm form) {
		StringBuffer result = new StringBuffer() ;
		
		return result.toString() ;
	}
	
}
