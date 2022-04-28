package com.ndourcodeur.ecommercespringapirest.repository;

import com.ndourcodeur.ecommercespringapirest.entities.cart.CartItem;
import com.ndourcodeur.ecommercespringapirest.entities.cart.CartItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository <CartItem, CartItemPK> {
}
