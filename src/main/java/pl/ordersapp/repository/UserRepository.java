package pl.ordersapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.ordersapp.entity.User;


public interface UserRepository extends JpaRepository<User, Integer>{

}
