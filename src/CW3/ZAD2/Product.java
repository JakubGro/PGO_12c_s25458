package CW3.ZAD2;

public class Product {
    private String name;
    private ProductType productType;
    private double price;
    private int quantity;
    private Storage storage;

    public Product(String name, ProductType productType, double price, int quantity) {
        this.name = name;
        this.productType = productType;
        this.price = price;
        this.quantity = quantity;
    }

    public boolean isAvailable(){
        return this.quantity > 0;
    }

    public void sell(){
        if (this.quantity <= 0){
            throw new RuntimeException("Brak produktu");
        }
        this.quantity--;
    }

    public void increaseQuantity(int counter){
        if(counter <= 0){
            throw new RuntimeException("Niepoprawna liczba produktów");
        }
        this.quantity += counter;
    }

    public Storage getStorage() {
        return storage;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}
