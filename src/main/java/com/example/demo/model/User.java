package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	 @Column(name = "first_name", nullable = false)
	private String frtstName ;
	 @Column(name = "last_name", nullable = false)
	private String lastName ;
	 @Column(name = "email", nullable = false, unique = true)
	private String email ;

}
