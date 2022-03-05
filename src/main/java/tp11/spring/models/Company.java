package tp11.spring.models;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.IdClass;

import lombok.Getter;
import lombok.Setter;


@Entity
@IdClass(CompanyId.class)
public class Company {
	@EmbeddedId
	private CompanyId id;
	private @Getter@Setter String name;
	private @Getter@Setter String address;
	private @Getter@Setter String phone;
	
	@Embedded
	@AttributeOverride(name = "phone", column = @Column(name="PHONE_PERSON"))
	private  ContactPerson contact;
	
	
	
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public Company(String name,String address,String phone,String contactFirstName,String contactLastName,String contactPhone) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.address=address;
		this.phone=phone;
		
	}
	
	

}
