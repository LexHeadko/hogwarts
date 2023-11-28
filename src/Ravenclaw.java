public class Ravenclaw extends Hogwarts {
    private Student student;
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(Student student, int magicPower, int transgression, int intelligence,
                     int wisdom, int wit, int creativity) {
        super(magicPower, transgression);
        this.student = student;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
}
