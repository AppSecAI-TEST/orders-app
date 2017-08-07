package pl.ordersapp.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import pl.ordersapp.entity.UserOrder;
import pl.ordersapp.entity.Item;
import pl.ordersapp.entity.User;
import pl.ordersapp.repository.UserOrderRepository;
import pl.ordersapp.repository.ItemRepository;
import pl.ordersapp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserOrderRepository userOrderRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Transactional
	public List<User> findAllUsers() {
		
		 return userRepository.findAll();	

	}

	public User findOne(int id) {
		// TODO Auto-generated method stub
		
		return userRepository.findOne(id);
	}
	@Transactional
	public User findOneWithUserOrder(int id) {
		
		User user = findOne(id);
		List<UserOrder> orders =userOrderRepository.findByUser(user);
		for(UserOrder order: orders){
			List<Item> items = itemRepository.findByUserOrder(order, new PageRequest(0, 10, Direction.DESC, "publishedDate"));
			order.setItems(items);
		}
		user.setUserOrders(orders);
		return user;
	}

	public void save(User userDTO) {
		userRepository.save(userDTO);
	}

}
