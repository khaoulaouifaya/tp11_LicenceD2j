package tp11.spring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Commande {
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String libelee;
	
	
	public Commande() {}
	
	public Commande(String libelee) {
		
	
		this.libelee=libelee;
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Commande [id=" + id + ", libelee=" + libelee + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelee() {
		return libelee;
	}
	public void setLibelee(String libelee) {
		this.libelee = libelee;
	}
	
	
	
	
	
	
}
