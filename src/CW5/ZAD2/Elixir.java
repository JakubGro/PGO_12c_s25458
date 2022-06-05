package CW5.ZAD2;

import java.util.ArrayList;
import java.util.List;

public class Elixir {
    private String name;
    private boolean isCreated = false;
    private int power = 0;
    private Liquid catalyst;
    private List<Ingredient> ingredients = new ArrayList<>();

    public Elixir(String name, Liquid catalyst) {
        this.name = name;
        this.catalyst = catalyst;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            throw new RuntimeException("Invalid elixir name");
        }
        this.name = name;
    }

    public Liquid getCatalyst() {
        return catalyst;
    }

    public void setCatalyst(Liquid catalyst) {
        if(catalyst == null || this.isCreated){
            throw new RuntimeException("Can not change catalyst");
        }
        this.catalyst = catalyst;
    }

    public void addIngredient(Ingredient ingredient){
        if (isCreated){
            throw new RuntimeException("Elixir został utworzony");
        }
        this.ingredients.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient){
        if(isCreated){
            throw new RuntimeException("Elixir został utworzony");
        }
        this.ingredients.remove(ingredient);
    }

    public int getPower() {
        if(isCreated){
            return power;
        }
        throw new RuntimeException("Elixir nie jest gotowy");
    }

    public void create(){
        if(this.catalyst==null){
            throw new RuntimeException("Brakuje katalizatora");
        }

        for (Ingredient ingredient : this.ingredients) {
            this.power += ingredient.getReagent();
        }

        this.power /= catalyst.getReagent();

        this.isCreated = true;

    }

    public void showElixir (){
        System.out.println("Is ready: "+ this.isCreated);
        System.out.println("Name: "+ this.name);
        System.out.println("Power: "+ this.power );
        System.out.println("Catalyst: "+ this.catalyst.getName());
    }

}
