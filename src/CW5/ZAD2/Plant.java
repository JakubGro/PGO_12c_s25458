package CW5.ZAD2;

public abstract class Plant extends Ingredient{
    int toxicity = 0;

    public Plant(String name, int baseReagent, int toxicity) {
        super(name, baseReagent);
        this.setToxicity(toxicity);
    }

    public int getToxicity() {
        return toxicity;
    }

    public void setToxicity(int toxicity) {
        this.toxicity = toxicity;
    }

    @Override
    public int getReagent() {
        return super.getReagent()*toxicity;
    }
}
