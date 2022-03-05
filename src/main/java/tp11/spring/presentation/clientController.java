package tp11.spring.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tp11.spring.models.Client;
import tp11.spring.services.InterfaceClientService;

@Controller(value = "ctrl1")
public class clientController {
	
	@Autowired
	InterfaceClientService service;
	
	    public Client save(Client clt) {
		return service.save(clt);
		}
		public Client modify(Client clt) {
		return service.modify(clt);
		}
		public void remove(long idClt) {
		service.remove(idClt);
		}
		public Client getOne(long idClt) {
		return service.getOne(idClt);
		}
		public List<Client> getAll() {
		return service.getAll();
		
		}
	
	

}
