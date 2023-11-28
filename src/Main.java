public class Main {
    public static void main(String[] args) {
        Gryffindor potter = new Gryffindor("Гарри Поттер", 88, 53, 79,
                97, 54);
        Gryffindor granger = new Gryffindor("Гермиона Грейнджер", 89, 99, 74,
                65, 85);
        Gryffindor weasley = new Gryffindor("Рональд Уизли", 80, 75, 87,
                98, 55);
        Slytherin malfoy = new Slytherin("Драко Малфой", 75, 87, 45,
                65, 95, 15, 99);
        Slytherin montague = new Slytherin("Грэхэм Монтегю", 85, 89, 45,
                65, 53, 76, 65);
        Slytherin goyle = new Slytherin("Грегори Гойл", 87, 55, 65, 23,
                54, 98, 65);
        Hufflepuff smith = new Hufflepuff("Захария Смит", 58, 98, 65,
                32, 45);
        Hufflepuff diggory = new Hufflepuff("Седрик Дигорти", 48, 87, 56,
                75, 95);
        Hufflepuff finchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 85, 98,
                54, 54, 95);
        Ravenclaw chang = new Ravenclaw("Чжоу Чанг", 78, 98, 56,
                65,45, 87);
        Ravenclaw patil = new Ravenclaw("Падма Патил", 87,68,68,
                65,89,45);
        Ravenclaw belby = new Ravenclaw("Маркус Белби", 57,95,93,
                43,73,81);
        System.out.println(potter.toString());
        System.out.println(malfoy.toString());
        System.out.println(belby.toString());
        System.out.println(diggory.toString());
        System.out.println(potter.equalsStudent(granger));
        System.out.println(granger.equalsStudent(potter));
        System.out.println(potter.equalsStudent(potter));
        System.out.println(malfoy.equalsStudent(potter));
        System.out.println(potter.equalsStudent(malfoy));
    }
}