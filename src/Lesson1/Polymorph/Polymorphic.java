package Lesson1.Polymorph;


/*Демонстрация работы полиморфизма*/
public class Polymorphic {

    public static void main(String[] args){
        // Последовательно меняем значение morph
        // Смотрим, как morph двигается и какой звук издает
        Animal morph = new Crow();
        callMorph(morph);
        morph = new Fish();
        callMorph(morph);
        morph = new Horse();
        callMorph(morph);
    }

    // Все животные могут издать звук и подвигаться
    public static void callMorph(Animal morph){
        System.out.println(morph.song());
        System.out.println(morph.move());
    }

}
