package org.example.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@Table(
        name = "products",
        schema = "ecommerce",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "sku_unique",
                        columnNames = "stock_keeping_unit"
                )
        }
)

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "product_generator")
    @SequenceGenerator(name = "product_generator",sequenceName = "product_sequence_name",allocationSize = 1)
    private long id;
    @Column(name = "stock_keeping_unit",nullable = false)
    private String s;
    @Column(nullable = false)
    private String name;
    private String description;
    private BigDecimal price;
    private boolean active;
    private String imageURL;
    @CreationTimestamp
    private LocalDateTime creatingTime;
    @UpdateTimestamp
    private LocalDateTime last_created;

}
