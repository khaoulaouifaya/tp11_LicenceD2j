package tp11.spring.services;

import java.util.List;

import tp11.spring.models.Commande;


public interface InterfaceCommande {
	
	Commande save(Commande clt);
	Commande modify(Commande clt);
	void remove(long idCo);
	Commande getOne(long idCo);
	List<Commande> getAll();
	

}
