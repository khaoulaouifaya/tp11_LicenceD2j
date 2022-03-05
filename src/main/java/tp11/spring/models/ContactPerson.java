package tp11.spring.models;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class ContactPerson {
	
	private String firstName;
	private String lastName;
	private String phone;


}
