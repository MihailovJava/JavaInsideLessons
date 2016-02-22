package Lesson1.Inheritance;


/* Класс дроида BB8 */
public class BB8 extends R2D2 {

    // Унаследованный конструктор
    public BB8(String name) {
        super(name);
    }

    // Сделать что-нибудь клевое
    public void doSomethingAwesome(){
        System.out.println(name + " : *Достал и зажег зажигалку*");
    }

    // Унаследованное приветствие, но переопределенное
    @Override
    public String greeting() {
        return name + " : Ва-у-у-ва-у. Бибип-ва-би-буп";
    }
}
