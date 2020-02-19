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
        Zerg zerg0 = new Zerg();
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        zerg0.name = "Z0";
        zerg1.name = "Z1";
        zerg2.name = "Z2";
        zerg3.name = "Z3";
        zerg4.name = "Z4";
        Protoss protoss0=new Protoss();
        Protoss protoss1=new Protoss();
        Protoss protoss2=new Protoss();
        protoss0.name="P0";
        protoss1.name="P1";
        protoss2.name="P2";
        Terran terran0=new Terran();
        Terran terran1=new Terran();
        Terran terran2=new Terran();
        Terran terran3=new Terran();
        terran0.name="T0";
        terran1.name="T1";
        terran2.name="T2";
        terran3.name="T3";  //напишите тут ваш код
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
