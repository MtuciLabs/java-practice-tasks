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
        Zerg Castello = new Zerg();
        Zerg Rassel = new Zerg();
        Zerg Gordon = new Zerg();
        Zerg Derek = new Zerg();
        Zerg Gorok = new Zerg();


        Protoss Mazda = new Protoss();
        Protoss Masdam = new Protoss();
        Protoss Cardan = new Protoss();


        Terran Fuck = new Terran();
        Terran Damn = new Terran();
        Terran Bitch = new Terran();
        Terran Shit = new Terran();

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
