package com.axsos.project.models;

import java.security.Timestamp;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	 @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   @CreationTimestamp
	   @Column(name = "created_at", updatable = false)
	   private Timestamp createdAt;
	   @UpdateTimestamp
	   @Column(name = "updated_at")
	   private Timestamp updatedAt;
	   @ManyToOne(fetch = FetchType.LAZY)
	   @JoinColumn(name = "customer_id")
	   private Customer customer;
	   @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	   private List<OrderItem> orderItems;

}
