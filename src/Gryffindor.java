public class Gryffindor extends Hogwarts {
    Student student;
    int nobility;
    int honor;
    int bravery;

    public Gryffindor(Student student, int magicPower, int transgression, int nobility, int honor, int bravery) {
        super(magicPower, transgression);
        this.student = student;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
}
