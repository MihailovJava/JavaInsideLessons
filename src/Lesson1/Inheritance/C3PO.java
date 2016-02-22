package Lesson1.Inheritance;

/*Класс дроида C3PO*/
public class C3PO extends Droid {

    // Унаследованный конструктор
    public C3PO(String name) {
        super(name);
    }

    // Унаследованное приветствие, но переопределенное
    @Override
    public String greeting() {
        return name + " : Ох . . . Привет, Я , " + name;
    }

    // Спецефический метод работы C3PO
    public String translateR2D2(R2D2 r2d2){
        return name + " : Он говорит: \"Привет! Я  "  + r2d2.name + "\"";
    }
}
