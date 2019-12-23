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
        Cat Murzik = new Cat();
        Dog Sosisk = new Dog();
        Fish Kilka = new Fish();
        Woman Kristina = new Woman();
        Murzik.Kristina = Kristina;
        Sosisk.Kristina = Kristina;
        Kilka.Kristina = Kristina;
    }

    public static class Cat {
        public Woman Kristina;
    }

    public static class Dog {
        public Woman Kristina;
    }

    public static class Fish {
        public Woman Kristina;
    }

    public static class Woman {
    }
}
