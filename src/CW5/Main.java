package CW5;

import CW5.ZAD2.*;

public class Main {
    public static void main(String[] args) {
        Alcohol whisky = new Alcohol("Whisky", 40, 70, 48);
        Water water = new Water("Woda", 67, 100, false);
        Flower rose = new Flower("Róża", 41, 5);
        Ore iron = new Ore("Żelazo", 72, 42, true);
        Crystal rubin = new Crystal("Rubin", 75, 41, 32);

        Elixir swallow = new Elixir("Jaskolka", whisky);
        swallow.addIngredient(water);
        swallow.addIngredient(rose);
        swallow.addIngredient(iron);
        swallow.addIngredient(rubin);

        swallow.create();
        swallow.showElixir();
    }
}
