package models;

public class Order {
    private String address;
    private String size;
    private String crust;
    private String[] toppings;
    private String sauce;

    public Order(String address, String size, String crust,String sauce, String[] toppings) {
        this.address = address;
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
        this.sauce = sauce;

    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String[] getTopping() {
        return toppings;
    }

    public void setTopping(String[] toppings) {
        this.toppings = toppings;
    }
}
