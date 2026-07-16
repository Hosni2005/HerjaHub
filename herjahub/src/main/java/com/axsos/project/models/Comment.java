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
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "comments")
public class Comment {
	 @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   @NotNull(message = "Rating is required")
	   @Min(value = 1, message = "Minimum rating is 1")
	   @Max(value = 5, message = "Maximum rating is 5")
	   private Integer rating;
	   @Size(max = 1000, message = "Comment cannot exceed 1000 characters")
	   @Column(columnDefinition = "TEXT")
	   private String comment;
	   @CreationTimestamp
	   @Column(name = "created_at", updatable = false)
	   private Timestamp createdAt;
	   @UpdateTimestamp
	   @Column(name = "updated_at")
	   private Timestamp updatedAt;
	   @ManyToOne(fetch = FetchType.LAZY)
	   @JoinColumn(name = "customer_id")
	   private Customer customer;
	   @ManyToOne(fetch = FetchType.LAZY)
	   @JoinColumn(name = "product_id")
	   private Product product;
}
