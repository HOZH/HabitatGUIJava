package sample.core;

import java.io.Serializable;
import java.util.HashSet;

public class User implements Serializable {


    private String shippingAddress;
    private String billingAddress;
    private String name;
    private String username;
    private String password;
    private String secondaryKey;
    private HashSet<Order> orderList = new HashSet<Order>();
    private HashSet<item> shoppingcart = new HashSet<item>();
    ;


    public HashSet<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(HashSet<Order> orderList) {
        this.orderList = orderList;
    }

    public HashSet<item> getShoppingcart() {
        return shoppingcart;
    }

    public void setShoppingcart(HashSet<item> shoppingcart) {
        this.shoppingcart = shoppingcart;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecondaryKey() {
        return secondaryKey;
    }

    public void setSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
    }


}
