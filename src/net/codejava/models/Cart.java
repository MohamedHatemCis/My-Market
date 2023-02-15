package net.codejava.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cart {
    public static Cart myCart;
    private List<Product>products;

    private double total_Price;

    static {
        myCart=new Cart();
    }
    public static Cart getInstance(){
        return myCart;
    }
    public Cart(){
        this.products=new ArrayList<>();
        this.total_Price=0;
    }
    public void addProductToCart(Product product){
        products.add(product);
    }
    public void removeProductFromCart(Long id){
        for(int i=0;i<products.size();i++){
            if(products.get(i).getId()==id)
            {
                DecrementTotalBy(products.get(i).getQuantity()*products.get(i).getPrice());
                products.remove(i);
                return;
            }
        }
    }
    public void IncrementTotalBy(double val){
        total_Price+=val;
    }
    public void DecrementTotalBy(double val){
        total_Price-=val;
    }

    public void clearCart(){
        myCart.setTotal_Price(0);
        myCart.products.clear();
    }
}
