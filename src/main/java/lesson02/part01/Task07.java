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
        Zerg zerg= new Zerg();
        Zerg zerg2= new Zerg();
        Zerg zerg3= new Zerg();
        Zerg zerg4= new Zerg();
        Zerg zerg5= new Zerg();
        zerg.name = "Mansur";
        zerg2.name = "Misha";
        zerg3.name = "Egor";
        zerg4.name = "Maksim";
        zerg5.name = "Dima";
        Protoss protoss=new Protoss();
        Protoss protoss2=new Protoss();
        Protoss protoss3=new Protoss();
        Protoss protoss4=new Protoss();
        protoss.name="Mans";
        protoss2.name="Abc";
        protoss3.name="Abcd";
        protoss4.name="Dcba";
        Terran terran=new Terran();
        Terran terran2=new Terran();
        Terran terran3=new Terran();
        terran.name="A";
        terran2.name="B";
        terran3.name="C";
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
