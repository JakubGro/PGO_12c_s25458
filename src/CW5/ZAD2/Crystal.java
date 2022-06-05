package CW5.ZAD2;

public class Crystal extends Mineral{
    int magicPower = 0;

    public Crystal(String name, int baseReagent, int power, int magicPower) {
        super(name, baseReagent, power);
        this.setMagicPower(magicPower);
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        if (magicPower < 0){
            throw new RuntimeException("Invalid magic power");
        }
        this.magicPower = magicPower;
    }

    @Override
    public int getReagent() {
        return super.getReagent()+this.magicPower;
    }
}
