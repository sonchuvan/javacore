package OOPEx;

public class Vehicle {
    private String name;
    private double price;
    private int capacity;

    Vehicle() {
        price = 0;
        capacity = 0;
    }

    Vehicle(double price, int capacity,String name) {
        this.price = price;
        this.capacity = capacity;
        this.name = name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(long price) {
        this.price = price;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    public double registrationTax(){
        double tax = 0;
        if(capacity < 100 ){
            tax = price/100;
        }
        else if(capacity < 200){
            tax = 3*price/100;
        }
        else{
            tax = 5*price/100;
        }
        return tax;
    }
}
