package Lesson1.Encapsulation;

/* Класс кота Cat демонстрирующий принцип инкапсуляции */
public class Cat {
    // Данные о котах

    // Имя кота
    private String name;
    // Возраст кота
    private int age;

    // Конструктор с входными данными имя - name и возраст - age
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод наделяющий кота способностью мурлыкать
    public void murmur(){
        System.out.println("Мур-мур");
    }

    // Функция переводящая данные о коте в текст
    @Override
    public String toString() {
        return "Кот " + name + " возраст - " + age;
    }


    public static void main(String[] args) {
        Cat cat = new Cat("Василий",8); // Создаем кота "Василия" 8 лет
        System.out.println(cat.toString()); // Выведем информацию о коте Василии
        cat.murmur(); // Погладим кота
    }
}
