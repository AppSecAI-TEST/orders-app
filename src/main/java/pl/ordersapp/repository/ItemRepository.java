package pl.ordersapp.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import pl.ordersapp.entity.UserOrder;
import pl.ordersapp.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

	List<Item> findByUserOrder(UserOrder order, Pageable pageable); // Pageable -> interface to implement for pagination functionality

}
