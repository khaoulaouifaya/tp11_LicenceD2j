package tp11.spring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nom;
	private String prenom;
	
	
	
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	
	public Client(){
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
