import java.util.ArrayList;

public class Restaurant extends Place{
    private double revenue;
    private double subscriptionPlan;
    private String name;
    private ArrayList<Item> menu;
    private double rating;


    public Restaurant(String ownerId,String address, String name, double revenue, double subscriptionPlan, String name1, ArrayList<Item> menu, double rating) {
        super(ownerId,address, name);
        this.revenue = revenue;
        this.subscriptionPlan = subscriptionPlan;
        this.name = name1;
        this.menu = menu;
        this.rating = rating;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getSubscriptionPlan() {
        return subscriptionPlan;
    }

    public void setSubscriptionPlan(double subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Item> menu) {
        this.menu = menu;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void addItem(Item itm){
        this.menu.add(itm);
    }
    public void removeItem(Item itm){
        this.menu.remove(itm);
    }

}
