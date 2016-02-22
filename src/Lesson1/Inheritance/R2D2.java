package Lesson1.Inheritance;

/* Класс дроида R2D2 */
public class R2D2 extends Droid{

    // Унаследованный конструктор
    public R2D2(String name) {
        super(name);
    }

    // Унаследованное приветствие, но переопределенное
    @Override
    public String greeting() {
        return name + " : Фию фи";
    }

    // Специальный метод астромеханика R2D2
    public void fix(){
        System.out.println(name + " : *Начинает ремонт*");
        System.out.println(name + " : Уиии . . .");
        System.out.println(name + " : *Ремонт завершен*");
    }
}
