package tp11.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tp11.spring.dao.CommandeDao;
import tp11.spring.models.Commande;

@Service
public class CommandeService implements InterfaceCommande{
	
	@Autowired
	private CommandeDao dao;

	@Transactional
	public Commande save(Commande co) {
		// TODO Auto-generated method stub
		
		dao.save(co);
		
		return null;
	}

	@Transactional
	public Commande modify(Commande co) {
		// TODO Auto-generated method stub
		Commande c=dao.findById((long) co.getId()).get();
		c.setLibelee(c.getLibelee());
		dao.save(co);
		return c;
	}

	@Transactional
	public void remove(long idCo) {
		// TODO Auto-generated method stub
		
		dao.deleteById(idCo);
		
	}

	@Transactional
	public Commande getOne(long idCo) {
		// TODO Auto-generated method stub
	   Commande co=dao.findById(idCo).get();
		return co;
	}

	@Transactional
	public List<Commande> getAll() {
		// TODO Auto-generated method stub
		List<Commande>lc=(List<Commande>) dao.findAll();
		return lc;
	}
	


}
