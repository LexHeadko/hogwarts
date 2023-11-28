public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String fullName, int magicPower, int transgression, int intelligence,
                     int wisdom, int wit, int creativity) {
        super(fullName, magicPower, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    @Override
    public String toString() {
        return super.toString() + "Факультет: Когтевран - ум = " + intelligence +
                ", мудрость = " + wisdom +
                ", остроумие = " + wit +
                ", творчество = " + creativity;
    }
    private int powerMagic () {
        return intelligence + wisdom + wit + creativity;
    }
    public String equalsStudent(Ravenclaw ravenclaw) {
        if (ravenclaw == this) {
            return "Выбран один и тот же ученик!!!";
        }else if (this.powerMagic() > ravenclaw.powerMagic()) {
            return this.fullName + " лучший Грифиндорец, чем " + ravenclaw.fullName;
        } else {
            return ravenclaw.fullName + " лучший Грифиндорец, чем " + this.fullName;
        }
    }
}

