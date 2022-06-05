package CW5.ZAD2;

public abstract class Liquid extends Ingredient{

    protected int dissolubility;

    public Liquid(String name, int baseReagent, int dissolubility) {
        super(name, baseReagent);
        this.setDissolubility(dissolubility);
    }

    public int getDissolubility() {
        return dissolubility;
    }

    public void setDissolubility(int dissolubility) {
        if (dissolubility < 0 || dissolubility > 100){
            throw new RuntimeException("Error");
        }
        this.dissolubility = dissolubility;
    }

    @Override
    public int getReagent() {
        return (super.getReagent()*this.dissolubility)/100;
    }
}
