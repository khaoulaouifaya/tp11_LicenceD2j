package tp11.spring.services;

import java.util.List;

import tp11.spring.models.Client;

public interface InterfaceClientService {
	
	
	Client save(Client clt);
	Client modify(Client clt);
	void remove(long idClt);
	Client getOne(long idClt);
	List<Client> getAll();
	
	
}
