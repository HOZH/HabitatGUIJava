package sample.core;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author hz
 */
public class Store implements Serializable {


    private HashMap<String, String> userLogin = new HashMap<String, String>();
    private HashMap<String, String> staffLogin = new HashMap<String, String>();
    private HashMap<String, User> users = new HashMap<String, User>();
    //todo remember to create couple staff account with higher priority
    private String sells = null;
    private Inventory inventory = new Inventory();
    private HashMap<Integer, Order> orders = new HashMap<Integer, Order>();
    private HashMap<String, item> items = new HashMap<String, item>();
    private int ordernumber = 0;


    public void getOrderNumber() {
        ordernumber++;
    }

    ;


    public HashMap<Integer, Order> getOrders() {
        return orders;
    }

    public void setOrders(HashMap<Integer, Order> orders) {
        this.orders = orders;
    }

    public HashMap<String, item> getItems() {
        return items;
    }

    public void setItems(HashMap<String, item> items) {
        this.items = items;
    }

    public HashMap<String, String> getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(HashMap<String, String> userLogin) {
        this.userLogin = userLogin;
    }

    public HashMap<String, String> getStaffLogin() {
        return staffLogin;
    }

    public void setStaffLogin(HashMap<String, String> staffLogin) {
        this.staffLogin = staffLogin;
    }

    public HashMap<String, User> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, User> users) {
        this.users = users;
    }

    public String getSells() {
        return sells;
    }

    public void setSells(String sells) {
        this.sells = sells;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }


    public void outputStreamHelper() throws IOException {
        File file = new File("outputTesting.dat");

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));

        outputStream.writeObject(this);
    }

    public Store inputStreamHelper() throws IOException, ClassNotFoundException {
        Store thatStore;
        File file = new File("outputTesting.dat");

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));

        return thatStore = (Store) inputStream.readObject();
    }


    public boolean isUserPasswordMatched(String username, String password) {
        if (userLogin.get(username) != null) {
                       return userLogin.get(username).equals(password);}
            return false;
        }



    // indentify user's password by isUserPasswordMatched first
    public User getToUserByUserName(String username) {


        User currentUser = users.get(username);
        return currentUser;

    }


}
