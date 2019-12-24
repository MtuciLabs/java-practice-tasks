package lesson02.part01;

/**
 * Создать 5 зергов, 3 протосса и 4 террана.
 * Дать им всем уникальные имена.
 * <p>
 * <p>
 * Требования:
 * 1.	Нельзя изменять классы Zerg, Protoss и Terran.
 * 2.	Нужно создать 5 объектов типа Zerg и каждому из них дать свое имя.
 * 3.	Нужно создать 3 объекта типа Protoss и каждому из них дать свое имя.
 * 4.	Нужно создать 4 объекта типа Terran и каждому из них дать свое имя.
 */

public class Task07 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg Irina = new Zerg();
        Zerg Igor = new Zerg();
        Zerg Narnia = new Zerg();
        Zerg Katya = new Zerg();
        Zerg Misha = new Zerg();

        Protoss Nik = new Protoss();
        Protoss Rik = new Protoss();
        Protoss Morty = new Protoss();

        Terran Jack = new Terran();
        Terran Jack1 = new Terran();
        Terran Jack2 = new Terran();
        Terran Jack3 = new Terran();

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
