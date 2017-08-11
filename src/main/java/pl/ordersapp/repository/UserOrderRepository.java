package pl.ordersapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.ordersapp.entity.UserOrder;
import pl.ordersapp.entity.User;


public interface UserOrderRepository extends JpaRepository<UserOrder, Integer>{

	List<UserOrder> findByUser(User user); // SPring will prepare right impl. of this method

}
