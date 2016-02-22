package Lesson1.Polymorph;

/*Класс ворона - расширяет интерфейс животного */
public class Crow implements Animal {

    @Override
    public String song() {
        return "Кар-кар";
    }

    @Override
    public String move() {
        return "Ворон летает";
    }
}
