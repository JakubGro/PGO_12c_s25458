package CW5.ZAD2;

public class Alcohol extends Liquid {

    private int percent=100;

    public Alcohol(String name, int baseReagent, int dissolubility, int percent) {
        super(name, baseReagent, dissolubility);
        this.setPercent(percent);

    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        if (percent < 0 || percent > 100){
            throw new RuntimeException("Error");
        }
        this.percent = percent;
    }

    @Override
    public int getReagent() {
        return super.getReagent()-(this.percent/100);
    }
}
