package CW5.ZAD2;

public class Mineral extends Ingredient{
    protected int power = 0;

    public Mineral(String name, int baseReagent, int power) {
        super(name, baseReagent);
        this.setPower(power);
    }

    @Override
    public int getReagent() {
        return super.getReagent()+this.power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (this.power < 0){
            throw new RuntimeException("Invalid power");
        }
        this.power = power;
    }
}
