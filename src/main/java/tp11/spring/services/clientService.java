package tp11.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tp11.spring.dao.InterfaceClient;
import tp11.spring.models.Client;

@Service
public class clientService implements InterfaceClientService{
	
	
	@Autowired
	private InterfaceClient dao;
	
@Transactional
	public Client save(Client clt) {
		// TODO Auto-generated method stub
		dao.save(clt);
		return null;
	}
@Transactional
	public Client modify(Client clt) {
		// TODO Auto-generated method stub
		Client c=dao.findById((long) clt.getId()).get();
		c.setNom(clt.getNom());
		c.setPrenom(clt.getPrenom());
		return null;
	}
@Transactional
	public void remove(long idClt) {
		// TODO Auto-generated method stub
		dao.deleteById(idClt);
	}
@Transactional
	public Client getOne(long idClt) {
		// TODO Auto-generated method stub
	return dao.findById(idClt).get();
	}
@Transactional
	public List<Client> getAll() {
		// TODO Auto-generated method stub
	return (List<Client>) dao.findAll();	}

}
