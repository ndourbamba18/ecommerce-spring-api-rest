package com.ndourcodeur.ecommercespringapirest.dto;

import com.ndourcodeur.ecommercespringapirest.entities.cart.CartItem;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data @ToString
public class UserDto {

    private long id;
    private String username;
    private String password;
    private String email;
    private String name;
    private String address;
    private String phone;
    private List<CartItem> cartItems = new ArrayList<>();

}
