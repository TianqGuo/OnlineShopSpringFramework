package onlineShop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineShop.dao.CartDao;
import onlineShop.entity.Cart;

//use @service and @autowired created bean
@Service
public class CartService {

    @Autowired
    private CartDao cartDao;

    // get cart by id from cartDao
    public Cart getCartById(int cartId) {
        return cartDao.getCartById(cartId);
    }
}
