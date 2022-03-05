package tp11.spring.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tp11.spring.models.Commande;
import tp11.spring.services.InterfaceCommande;

@Controller(value = "ctrl2")
public class commandeController {
	
	
	@Autowired
	private InterfaceCommande service1;
	
	
	       public Commande save(Commande co) {
			return service1.save(co);
			}
			public Commande modify(Commande co) {
			return service1.modify(co);
			}
			public void remove(long idCo) {
			service1.remove(idCo);
			}
			public Commande getOne(long idCo) {
				Commande co= service1.getOne(idCo);
				return co;
			}
			public List<Commande> getAll() {
			return service1.getAll();
			
			}
	
	
	
	

}
