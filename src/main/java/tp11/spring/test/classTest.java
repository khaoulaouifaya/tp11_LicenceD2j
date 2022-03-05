package tp11.spring.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tp11.spring.models.Client;
import tp11.spring.models.Commande;
import tp11.spring.presentation.clientController;
import tp11.spring.presentation.commandeController;

public class classTest {
	

	private static ApplicationContext ctx1;

	
	public static void main(String[] args) {
		
	
		ctx1 = new ClassPathXmlApplicationContext("spring.xml");
		commandeController ctr1= (commandeController) ctx1.getBean("ctrl2");
		
//		ctr1.save(new Commande("article1"));
//		ctr1.save(new Commande("article2"));
//		ctr1.save(new Commande("article3"));
//		ctr1.save(new Commande("article4"));
//		
//		List<Commande>lc=ctr1.getAll();
//		for(Commande c:lc) {
//			System.out.print(c+"\n");
//		}
		
		
//	Commande c=ctr1.getOne(1);
//		c.setLibelee("article a changer");
//       ctr1.save(c);
		
//	 		System.out.println(c);
	
			
//		
//		List<Commande>l=ctr1.getAll();
//		for(Commande c:l) {
//			System.out.print(c+"\n");
//		}
//		
		
		
//	Client client1 = new Client("Omar","Omar");
//Client client2 = new Client("Said","Omar");
//	Client client3 = new Client("Ahmed","Omar");
//		
////		// Test1 => save 3 Clients
//		client1=ctr.save(client1);
//		client2=ctr.save(client2);
//		client3=ctr.save(client3);
		
// Test2 => getAll Clients before modify and remove
//		ctr.getAll().stream()
//		.forEach(i -> System.out.println(i));
		
		// Test3 => getOne Client service
//			System.out.println(ctr.getClientByName("Said"));
		// Test4 => modify Client service
//		client1.setName("Hassan");
//		ctr.modify(client1);
		// Test5 => remove Client service
//		ctr.remove(2);
	
	
		// Test getAll Client after modify and remove
	
//	List<Client>lc=ctr.getAll();
//	for(Client c:lc) {
//		System.out.print(c+"\n");
//		
//	}

	}

}
