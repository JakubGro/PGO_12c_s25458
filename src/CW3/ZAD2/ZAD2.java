package CW3.ZAD2;

public class ZAD2 {

    public static void start(){

        Person personKuba = new Person("Kuba", "Gronostajski", 1000, 1000);

        //Produkty w sklepie
        Product egg = new Product("Jaja", ProductType.Consumable, 0.80, 100);
        Product computer = new Product("Komputer", ProductType.Electronic, 800, 10);
        Product ball = new Product("Pilka", ProductType.Entertainment, 50, 40);

        //Produkty w magazynie
        Storage appleStorage = new Storage(20);
        Product apple = new Product("Jabłko", ProductType.Consumable, 1, 200, appleStorage);

        Storage onionStorage = new Storage(50);
        Product onion = new Product("Cebula", ProductType.Consumable, 0.5, 300, onionStorage);

        //Srodki przed zakupami
        personKuba.showBalance();

        //Pierwsze zakupy (ze sklepu)
        personKuba.makeOrder();

        personKuba.addToCart(egg);
        personKuba.addToCart(ball);
        personKuba.addToCart(computer);

        personKuba.showCurrentCart();
        personKuba.buyByCard();


        //Drugie zakupy (z magazynu)
        personKuba.makeOrder();
        personKuba.addToCart(apple);
        personKuba.addToCart(apple);
        personKuba.addToCart(onion);
        personKuba.addToCart(onion);

        personKuba.showCurrentCart();
        personKuba.buyByCash();

        //Historia zakupów
        personKuba.showHistoryCarts();

        //Srodki po zakupach
        personKuba.showBalance();

        //Produkty przed uzupełnieniem
        Product.showAllProducts();

        //Uzupełnienie produktów
        egg.increaseQuantity(10);
        computer.increaseQuantity(1);
        ball.increaseQuantity(5);
        onion.increaseQuantity(500);
        apple.increaseQuantity(120);

        //Produkty po uzupełnieniu
        Product.showAllProducts();
    }
}
