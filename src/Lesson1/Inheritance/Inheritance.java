package Lesson1.Inheritance;

/*Демонстрация работы наследования*/
public class Inheritance {

    public static void main(String[] args) {
        Droid c3po = new C3PO("C-3PO"); // Создаем C-3PO
        Droid r2d2 = new R2D2("R2D2"); // Создаем R2D2
        Droid bb8 = new BB8("BB8"); // Создаем R2D2
        droidSayHello(c3po);
        droidSayHello(r2d2);

        // Для обращения к спецефическим полям дочерних классов
        // необходимо явно преобразовать объект с3po и r2d2 к своим классам
        System.out.println(((C3PO) c3po).translateR2D2((R2D2) r2d2));
        droidSayHello(bb8);
        System.out.println(((C3PO) c3po).translateR2D2((R2D2) bb8)); // Мы так же могли привести bb8 к классу BB8
        ((R2D2) r2d2).fix();
        ((R2D2) bb8).fix(); // BB8 делает ремонт так же как и R2D2
        ((BB8) bb8).doSomethingAwesome();
    }

    // Все роботы могут сказать привет. Полиморфизм
    private static void droidSayHello(Droid droid) {
        System.out.println(droid.greeting());
    }

}
