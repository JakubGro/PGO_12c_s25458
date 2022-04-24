package CW3.ZAD2;

public class ZAD2 {

    public static void start(){

        Person personKuba = new Person("Kuba", "Gronostajski", 1000, 1000);
        personKuba.makeOrder();

        Product egg = new Product("Jaja", ProductType.Consumable, 0.80, 100);
        Product computer = new Product("Komputer", ProductType.Electronic, 800, 10);
        Product ball = new Product("Pilka", ProductType.Entertainment, 50, 40);

        personKuba.addToCart(egg);
        personKuba.addToCart(ball);
        personKuba.addToCart(computer);

        personKuba.showCurrentCart();

        personKuba.buyByCard();

        personKuba.showHistoryCarts();


    }
}
