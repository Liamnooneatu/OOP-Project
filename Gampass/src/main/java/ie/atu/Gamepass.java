package ie.atu;

import java.text.NumberFormat;

public class Gamepass {
    private String Name;
    private String Devoloper;
    private double price;

    protected static int count = 0;


    public Gamepass(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDevoloper() {
        return Devoloper;
    }

    public void setDevoloper(String devoloper) {
        Devoloper = devoloper;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    @Override
    public String toString() {
        return
                "Name: " + Name + "\n" +
                "Developer: " + Devoloper + "\n" +
                "price: " + price + "\n";
    }

    public void setCode(String gamepassCode) {
    }
    public static int getCount() {
        return count;
    }
}
