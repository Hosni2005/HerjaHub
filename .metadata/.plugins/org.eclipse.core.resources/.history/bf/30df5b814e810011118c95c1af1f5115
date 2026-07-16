package com.axsos.project.models;

import java.security.Timestamp;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "customers")
public class Customer {
	 @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   @NotNull(message = "First name is required")
	   @Size(min = 2, max = 100)
	   
	   private String firstName;
	   @NotNull(message = "Last name is required")
	   @Size(min = 2, max = 100)
	   
	   private String lastName;
	   @NotNull(message = "Email is required")
	   @Email(message = "Invalid email")
	   @Column(unique = true)
	   private String email;
	   @NotNull(message = "Password is required")
	   @Size(min = 8, max = 255)
	   private String password;
	   @CreationTimestamp
	   @Column(name = "created_at", updatable = false)
	   private Timestamp createdAt;
	   @UpdateTimestamp
	   @Column(name = "updated_at")
	   private Timestamp updatedAt;
	   @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	   private List<Order> orders;
	   @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	   private List<Comment> comments;
}
