import java.util.Objects;

public abstract class Hogwarts {
    String fullName;
    private int magicPower;
    private int transgression;

    public Hogwarts(String fullName, int magicPower, int transgression) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }
    @Override
    public String toString() {
        return "Cтудент: " +
                fullName + ", сила магии = " + magicPower +
                ", расстояние трансгресии = " + transgression +
                " ";
    }

    public String equalsStudent(Hogwarts hogwarts) {
        if (hogwarts == this) {
            return "Выбран один и тот же ученик!!!";
        }else if (this.magicPower + this.transgression > hogwarts.magicPower + hogwarts.transgression) {
            return this.fullName + " обладает большей мощностью магией, чем " + hogwarts.fullName;
        } else {
            return hogwarts.fullName + " обладает большей мощностью магией, чем " + this.fullName;
        }
    }
}
