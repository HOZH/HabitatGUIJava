package sample.core;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;

public class Order implements Serializable {
    private HashSet<item> itemList = new HashSet<item>();
    private String truckingNumber = "no yet shipped";
    //todo define the logic for trucking number later
    private boolean isReturning = false;
    private boolean isShipped = false;
    private boolean isReturned = false;
    private String username;
    private int orderNumber = 0;
    private Date deliveryDate = new Date();
    private double subTotal;
    private double total;
    private String shippingAddress;
    private String billingAddress;
    private String creditCardNumber;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    public boolean isShipped() {
        return isShipped;
    }

    public void setShipped(boolean shipped) {
        isShipped = shipped;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", total=" + total +
                '}';
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
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

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public HashSet<item> getItemList() {
        return itemList;
    }

    public void setItemList(HashSet<item> itemList) {
        this.itemList = itemList;
    }

    public String getTruckingNumber() {
        return truckingNumber;
    }

    public void setTruckingNumber(String truckingNumber) {
        this.truckingNumber = truckingNumber;
    }

    public boolean isReturning() {
        return isReturning;
    }

    public void setReturning(boolean returning) {
        isReturning = returning;
    }


    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
