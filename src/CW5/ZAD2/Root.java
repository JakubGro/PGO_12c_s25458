package CW5.ZAD2;

public class Root extends Plant{
    public Root(String name, int baseReagent, int toxicity) {
        super(name, baseReagent, toxicity);
    }

    @Override
    public int getReagent() {
        return super.getReagent()/2;
    }
}
