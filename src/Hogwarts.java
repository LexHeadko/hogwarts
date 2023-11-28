public abstract class Hogwarts {
    private int magicPower;
    private int transgression;

    public Hogwarts(int magicPower, int transgression) {
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgression() {
        return transgression;
    }
}
