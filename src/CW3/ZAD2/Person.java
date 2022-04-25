package CW3.ZAD2;

import java.util.ArrayList;

public class Person {

    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private ShoppingCart currentCart;
    private ArrayList<ShoppingCart> historyCarts = new ArrayList<>();

    public Person(String name, String surname, double moneyInCash, double moneyOnCard) {
        this.setName(name);
        this.setSurname(surname);
        this.setMoneyInCash(moneyInCash);
        this.setMoneyOnCard(moneyOnCard);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null) {
            throw new RuntimeException("Imie nie moze byc puste");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname == null) {
            throw new RuntimeException("Nazwisko nie moze byc puste");
        }
        this.surname = surname;
    }

    public double getMoneyInCash() {
        return moneyInCash;
    }

    public void setMoneyInCash(double moneyInCash) {
        if(moneyInCash < 0){
            throw new RuntimeException("Nie masz wystarcajacej ilosci gotówki");
        }
        this.moneyInCash = moneyInCash;
    }

    public double getMoneyOnCard() {
        return moneyOnCard;
    }

    public void setMoneyOnCard(double moneyOnCard) {
        if(moneyOnCard < 0){
            throw new RuntimeException("Nie masz wystarcajacej ilosci piniędzy na karcie");
        }
        this.moneyOnCard = moneyOnCard;
    }

    public void makeOrder(){
        this.currentCart = new ShoppingCart();
    }

    public void buyByCard(){
        if (this.moneyOnCard < this.currentCart.totalPrice()){
            throw new RuntimeException("Nie masz wytsarczających srodków na karcie");
        }
        this.moneyOnCard = this.moneyOnCard - this.currentCart.totalPrice();
        this.currentCart.sell();
        this.historyCarts.add(this.currentCart);
        this.currentCart = null;
    }

    public void buyByCash(){
        if (this.moneyInCash < this.currentCart.totalPrice()){
            throw new RuntimeException("Nie masz wytsarczających srodków w gotówce");
        }
        this.moneyInCash = this.moneyInCash - this.currentCart.totalPrice();
        this.currentCart.sell();
        this.historyCarts.add(this.currentCart);
        this.currentCart = null;
    }

    public void addToCart(Product product){
        if (this.currentCart == null){
            throw new RuntimeException("Brak otwartego koszyka");
        }
        this.currentCart.getProducts().add(product);
    }

    public void showHistoryCarts(){
        for (ShoppingCart shoppingCart : this.historyCarts) {
            System.out.println(" ==== Historyczny Koszyk Id: " + shoppingCart.getId() + ", Total Price: " + shoppingCart.totalPrice() + " ====");
            for (Product product : shoppingCart.getProducts()) {
                System.out.println(product.getName() + " Price: " + product.getPrice());
            }
            System.out.println();
        }
    }

    public void showCurrentCart(){
        if(currentCart == null){
            System.out.println("Brak otwartego koszyka");
        } else {
            System.out.println(" ==== Otwarty Koszyk Id: " + currentCart.getId() + ", Całkowita wartość: " + currentCart.totalPrice() + " Całkowity czas dostawy: "+ this.currentCart.totalDeliveryTime()+" ====");
            for (Product product : this.currentCart.getProducts()) {
                System.out.println(product.getName() + " Price: " + product.getPrice());
            }
            System.out.println();
        }
    }

    public void showBalance(){
        System.out.println("Gotówka: " + this.moneyInCash);
        System.out.println("Karta: " + this.moneyOnCard);
        System.out.println();
    }

}
