package net.codejava.controllers;


import net.codejava.models.Cart;
import net.codejava.models.Order;
import net.codejava.models.Product;
import net.codejava.service.LoginService;
import net.codejava.service.OrderService;
import net.codejava.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductsController {
     @Autowired
     ProductService service;

     @Autowired
    OrderService orderService;
     Cart cart=Cart.getInstance();

    @RequestMapping(value = "/")
    public String startPage(){
        return "startpage";
    }

    @RequestMapping(value = "/logout")
    public String logout(){
        LoginService.setLoggedOut();
        return "startpage";
    }

    @RequestMapping(value = "/products")
    public ModelAndView productsPage(){
        ModelAndView modelAndView=new ModelAndView("products");
        List<Product>products =service.getAllProducts();
        modelAndView.addObject("products",products);
        return modelAndView;
    }
    @RequestMapping(value = "/cart")
    public ModelAndView cartPage(){
        ModelAndView modelAndView=new ModelAndView("cart");
        modelAndView.addObject("cart_products",cart.getProducts());
        modelAndView.addObject("totalPrice",cart.getTotal_Price());
        return modelAndView;
    }
    @RequestMapping(value = "/add-product",method = RequestMethod.GET)
    public String addProductToUserCart(@RequestParam("id")Long id,@RequestParam("quantity") int quantity){
        Product product=service.geProductById(id);
        product.setQuantity(quantity);
        cart.IncrementTotalBy(product.getQuantity()*product.getPrice());
        cart.addProductToCart(product);
        return "redirect:/products";
    }
    @RequestMapping(value = "/delete-product",method = RequestMethod.GET)
    public String deleteProductFromCart(@RequestParam Long id){
       cart.removeProductFromCart(id);
        return "redirect:cart";
    }
    @RequestMapping(value = "/confirm-order",method = RequestMethod.GET)
    public ModelAndView confirmOrder(){
        ModelAndView modelAndView=new ModelAndView("confirmPage");
        Order order= Order.builder()
                .user(LoginService.user).total_price(cart.getTotal_Price()).build();
        orderService.saveOrder(order);
        modelAndView.addObject("username",LoginService.user.getUsername());
        modelAndView.addObject("totalPrice",cart.getTotal_Price());
        cart.clearCart();
        return modelAndView;
    }
    @RequestMapping(value = "/user-orders",method = RequestMethod.GET)
    public ModelAndView userOrdersPage(){
        ModelAndView modelAndView = new ModelAndView("userOrders");
        modelAndView.addObject("orders",orderService.getOrdersById(LoginService.user.getId()));
        return modelAndView;
   }

}
