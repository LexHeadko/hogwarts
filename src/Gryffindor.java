public class Gryffindor extends Hogwarts {
    private Student student;
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(Student student, int magicPower, int transgression,
                      int nobility, int honor, int bravery) {
        super(magicPower, transgression);
        this.student = student;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
}
