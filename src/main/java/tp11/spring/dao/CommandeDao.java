package tp11.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tp11.spring.models.Commande;


@Repository								
public interface CommandeDao extends CrudRepository <Commande, Long>{

}
