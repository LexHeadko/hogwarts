public class Slytherin extends Hogwarts {
    private Student student;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(Student student, int magicPower, int transgression, int cunning,
                     int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(magicPower, transgression);
        this.student = student;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

}
