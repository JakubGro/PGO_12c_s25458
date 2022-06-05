package CW5.ZAD2;

public class Ore extends Mineral{
    protected boolean metallic = false;

    public Ore(String name, int baseReagent, int power, boolean metallic) {
        super(name, baseReagent, power);
        this.metallic = metallic;
    }

    public boolean isMetallic() {
        return metallic;
    }

    public void setMetallic(boolean metallic) {
        this.metallic = metallic;
    }

    @Override
    public int getReagent() {
        if (this.metallic){
            return super.getReagent();
        }
        return super.getReagent()/2;
    }
}
