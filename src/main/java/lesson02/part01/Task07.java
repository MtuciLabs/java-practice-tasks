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
        Zerg Zerg1=new Zerg();
        Zerg Zerg2=new Zerg();
        Zerg Zerg3=new Zerg();
        Zerg Zerg4=new Zerg();
        Zerg Zerg5=new Zerg();
        Protoss Protoss1=new Protoss();
        Protoss Protoss2=new Protoss();
        Protoss Protoss3=new Protoss();
        Terran Terran1=new Terran();
        Terran Terran2=new Terran();
        Terran Terran3=new Terran();
        Terran Terran4=new Terran();

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
