public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String fullName, int magicPower, int transgression,
                      int nobility, int honor, int bravery) {
        super(fullName, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    private int powerMagic () {
        return nobility + honor + bravery;
    }
    public String equalsStudent(Gryffindor gryffindor) {
        if (gryffindor == this) {
            return "Выбран один и тот же ученик!!!";
        }else if (this.powerMagic() > gryffindor.powerMagic()) {
            return this.fullName + " лучший Грифиндорец, чем " + gryffindor.fullName;
        } else {
            return gryffindor.fullName + " лучший Грифиндорец, чем " + this.fullName;
        }
    }
}