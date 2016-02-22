package Lesson1.Inheritance;


/* Родительский класс дроидов*/
public abstract class Droid {

    // Все дроиды имеют название
    String name;

    // Все дроиды могут сказать "Привет!"
    public abstract String greeting();

    // Конструктор дроидов
    public Droid(String name) {
        this.name = name;
    }
}
