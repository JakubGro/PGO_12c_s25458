package CW5.ZAD2;

public class Water extends Liquid {

    private boolean distilled = false;


    public Water(String name, int baseReagent, int dissolubility, boolean distilled) {
        super(name, baseReagent, dissolubility);
        this.setDistilled(distilled);
    }

    public boolean isDistilled() {
        return distilled;
    }

    public void setDistilled(boolean distilled) {
        this.distilled = distilled;
    }

    @Override
    public int getReagent() {
        if(this.distilled){
            return super.getReagent();
        }
        return super.getReagent()/2;
    }
}
