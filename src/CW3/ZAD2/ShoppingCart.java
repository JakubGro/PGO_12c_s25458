package CW3.ZAD2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ShoppingCart {
    private static int COUNTER_ID = 0;
    private int id = COUNTER_ID++;
    private ArrayList<Product> products = new ArrayList<>();

    public double totalPrice(){
        double price = 0;
        for (Product product : this.products) {
            price += product.getPrice();
        }
        return price;
    }

    public int totalDeliveryTime(){
        int deliveryTime = 0;
        Set<Storage> uniqueStorages = new HashSet<>();

        for (Product product : this.products) {
            if(product.getStorage() != null){
                uniqueStorages.add(product.getStorage());
            }
        }

        for (Storage storage : uniqueStorages) {
            deliveryTime += storage.getDeliveryTime();
        }

        return deliveryTime;
    }

    public void sell(){
        for (Product product : this.products) {
            product.sell();
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public int getId() {
        return id;
    }
}
