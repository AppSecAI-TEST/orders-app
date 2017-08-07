package pl.ordersapp.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.ordersapp.entity.Item;
import pl.ordersapp.entity.UserOrder;
import pl.ordersapp.entity.Role;
import pl.ordersapp.entity.User;
import pl.ordersapp.repository.ItemRepository;
import pl.ordersapp.repository.UserOrderRepository;
import pl.ordersapp.repository.RoleRepository;
import pl.ordersapp.repository.UserRepository;


// Service responsible for initialize data sample
@Transactional
@Service
public class InitDbService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired 
	private ItemRepository itemRepository;
	
	@Autowired 
	private UserOrderRepository userOrderRepository;
	
	@PostConstruct // method invoked after deployment to the server 
	public void init() {
		
		// Creating user roles
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);

		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setName("admin");
		List<Role> adminRoles = new ArrayList<Role>();
		adminRoles.add(roleAdmin);
		adminRoles.add(roleUser);
		userAdmin.setRoles(adminRoles);
		
		userRepository.save(userAdmin);
		
		User userUser = new User();
		userUser.setName("user");
		List<Role> userRoles = new ArrayList<Role>();
		userRoles.add(roleUser);
		userUser.setRoles(userRoles);
		
		userRepository.save(userUser);
		
		User userUser2 = new User();
		userUser2.setName("user2");
		List<Role> userRoles2 = new ArrayList<Role>();
		userRoles2.add(roleUser);
		userUser2.setRoles(userRoles2);
		
		userRepository.save(userUser2);
		
		UserOrder userOrder = new UserOrder();
		userOrder.setName("Zamówienie numer 1");
		userOrder.setUrl("wp.pl");
		userOrder.setUser(userAdmin);
		
		userOrderRepository.save(userOrder);
		
		Item item1 = new Item();
		item1.setTitle("Pierwsza pozycja zamowienia");
		item1.setDescription("Opis zamowienia pozycji nr 1 zamowienia nr 1");
		item1.setUserOrder(userOrder);

		Item item2 = new Item();
		item2.setTitle("Druga pozycja zamowienia");
		item2.setDescription("Opis zamowienia pozycji nr 2 zamowienia nr 1");
		item2.setPublishedDate(new Date());
		item2.setUserOrder(userOrder);
		
		itemRepository.save(item1);
		itemRepository.save(item2);

	}
	
	

	

}
