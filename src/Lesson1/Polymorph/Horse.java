package Lesson1.Polymorph;

/*Класс лошадки - расширяет интерфейс животного */
public class Horse implements Animal {
    @Override
    public String song() {
        return "И-го-го";
    }

    @Override
    public String move() {
        return "Лошадка скачет";
    }
}
