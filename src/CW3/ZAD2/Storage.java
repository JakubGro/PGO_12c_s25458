package CW3.ZAD2;

import java.util.ArrayList;

public class Storage {

    private int deliveryTime;
    private ArrayList<Product> products = new ArrayList<>();

    public Storage(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        if(deliveryTime < 0){
            throw new RuntimeException("Czas dosatwy musi byc dodatni");
        }
        this.deliveryTime = deliveryTime;
    }
}
