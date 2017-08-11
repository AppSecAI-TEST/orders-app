package pl.ordersapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import pl.ordersapp.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByName(String name);

}
