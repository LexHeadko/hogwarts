public class Hufflepuff extends Hogwarts {
    Student student;
    int diligence;
    int loyalty;
    int honesty;

    public Hufflepuff(Student student, int powerMagic, int transgression, int diligence, int loyalty, int honesty) {
        super(powerMagic, transgression);
        this.student = student;
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
}
