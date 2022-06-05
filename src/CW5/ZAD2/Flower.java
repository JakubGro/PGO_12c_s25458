package CW5.ZAD2;

public class Flower extends Plant{

    public Flower(String name, int baseReagent, int toxicity) {
        super(name, baseReagent, toxicity);
    }

    @Override
    public int getReagent() {
        return super.getReagent()*2;
    }
}
