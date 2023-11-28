public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String fullName, int powerMagic, int transgression,
                      int diligence, int loyalty, int honesty) {
        super(fullName, powerMagic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    @Override
    public String toString() {
        return super.toString() + "Факультет: Пуфендуй - трудолюбие = " + diligence +
                ", верность = " + loyalty +
                ", честность = " + honesty;
    }
}
