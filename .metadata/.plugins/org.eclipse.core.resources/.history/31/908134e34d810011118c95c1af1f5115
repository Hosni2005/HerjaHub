package com.axsos.project.models;

import java.security.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "oreder_items")
public class OrderItem {
	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   @NotNull
	   @Min(1)
	   private Integer quantity;
	   @NotNull
	   @Positive
	   private Double price;
	   @CreationTimestamp
	   @Column(name = "created_at", updatable = false)
	   private Timestamp createdAt;
	   @UpdateTimestamp
	   @Column(name = "updated_at")
	   private Timestamp updatedAt;
	   @ManyToOne(fetch = FetchType.LAZY)
	   @JoinColumn(name = "order_id")
	   private Order order;
	   @ManyToOne(fetch = FetchType.LAZY)
	   @JoinColumn(name = "product_id")
	   private Product product;
}
