package lesson01.part2;

public class Task09 {

    /**
     * Создай объект типа Cat (кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
     * Присвой каждому животному владельца (owner).
     * <p>
     * <p>
     * Требования:
     * 1. Программа не должна выводить текст на экран.
     * 2. В методе main создай объекты типа Cat, Dog, Fish, Woman занеси их ссылки в переменные.
     * 3. В методе main присвойте каждому животному владельца Woman.
     * 4. Класс Cat, Dog, Fish должен содержать только одну переменную Woman owner.
     * 5. Класс Woman не должен содержать переменных.
     */

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat Vasya = new Cat();
        Fish Oleg = new Fish();
        Dog Andrew = new Dog();
        Andrew.Sveta = new Woman();
        Oleg.Alice = new Woman();
        Vasya.Mila = new Woman();

    }

    public static class Cat {
        public Woman Mila;
    }

    public static class Dog {
        public Woman Sveta;
    }

    public static class Fish {
        public Woman Alice;
    }

    public static class Woman {
    }
}
