package com.ndourcodeur.ecommercespringapirest.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(
        name = "products",
        uniqueConstraints = {@UniqueConstraint(columnNames = "name")}
)
@Data @NoArgsConstructor @ToString @EqualsAndHashCode
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 128)
    private String name;

    @Column(nullable = false, length = 4000)
    private String description;

    @Column(nullable = false, precision = 10, scale = 2)
    private double price;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date addedOn = new Date();

    @Lob
    @Column(nullable = true, length = Integer.MAX_VALUE)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private byte[] image;

    public Product (String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Product (String name, String description, double price, byte[]image) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
    }
}
