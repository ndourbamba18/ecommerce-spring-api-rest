package com.ndourcodeur.ecommercespringapirest.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ndourcodeur.ecommercespringapirest.entities.cart.CartItem;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode @ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false, length = 35)
    private String username;

    @Column(nullable = false, length = 128)
    private String password;

    @Column(unique = true, nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 128)
    private String address;

    @Column(nullable = false, length = 15)
    private String phone;

    @JsonManagedReference
    @OneToMany(mappedBy = "pk.user", cascade = CascadeType.ALL)
    private List<CartItem> cartItems = new ArrayList<>();


    public User (String username, String password, String email, String name, String address, String phone) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.cartItems = new ArrayList<>();
    }

    @Transient
    public double getCartTotal () {
        double sum = 0;

        for (CartItem item : cartItems) {
            sum += item.getTotalPrice();
        }
        return sum;
    }

}
