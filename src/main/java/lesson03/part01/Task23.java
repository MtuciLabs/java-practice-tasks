package lesson03.part01;

/**
 * В классе Cat создай статическую переменную public int catCount.
 * Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat)
 * статическая переменная catCount увеличивается на 1. Создать 10 объектов Cat и
 * вывести значение переменной catCount на экран.
 * <p>
 * Требования:
 * 1.	В классе Cat создай статическую переменную public int catCount.
 * 2.	В классе Cat создай конструктор public Cat() без параметров.
 * 3.	Конструктор должен увеличивать значение статической переменной catCount на 1.
 * 4.	В методе main создай 10 котов.
 * 5.	В методе main, после создания всех котов, выведи значение переменной catCount.
 */

public class Task23 {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();

        System.out.println(Cat.catCount);

    }

    public static class Cat {
        static int catCount = 0;

        public Cat(){
            catCount++;
        }



    }
}
