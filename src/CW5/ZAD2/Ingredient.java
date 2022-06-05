package CW5.ZAD2;

public abstract class  Ingredient {

    protected String name;
    protected int baseReagent;


    public Ingredient(String name, int baseReagent) {
        this.setName(name);
        this.setBaseReagent(baseReagent);
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

    public void setBaseReagent(int baseReagent) {
        if (baseReagent < 0) {
            throw new RuntimeException("Nie ma");
        }
        this.baseReagent = baseReagent;
    }

    public int getReagent() {
        return baseReagent;
    }

}
