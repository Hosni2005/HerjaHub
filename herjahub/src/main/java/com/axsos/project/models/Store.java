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
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "stores")
public class Store {
	
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
	   @NotNull(message = "Store name is required")
	   @Size(min = 2, max = 150)
	   @Column(name = "store_name")
	   private String storeName;
	   @Column(columnDefinition = "TEXT")
	   private String description;
	   @Pattern(
	       regexp = "^[0-9+\\-\\s]{7,20}$",
	       message = "Invalid phone number"
	   )
	   private String phone;
	   @Size(max = 255)
	   private String address;
	   private String image;
	   @CreationTimestamp
	   @Column(name = "created_at", updatable = false)
	   private Timestamp createdAt;
	   @UpdateTimestamp
	   @Column(name = "updated_at")
	   private Timestamp updatedAt;
	   @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
	   private List<Product> products;
	}

