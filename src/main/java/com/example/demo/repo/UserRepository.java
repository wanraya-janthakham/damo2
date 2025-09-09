package com.example.demo.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;


@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
	List<User> findByFirstName(String firstName);
	List<User> findByEmailContaining(String keyword);
	
}
