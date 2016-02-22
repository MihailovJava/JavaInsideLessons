package Lesson1.Polymorph;

/*Класс рыбка - расширяет интерфейс животного */
public class Fish implements Animal {

    @Override
    public String song() {
        return "Бульк-бульк";
    }

    @Override
    public String move() {
        return "Рыбка плавает";
    }
}
