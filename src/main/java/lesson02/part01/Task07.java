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
      Zerg Anna = new Zerg();
      Zerg David = new Zerg();
      Zerg Dieter = new Zerg();
      Zerg Tatyana = new Zerg();
      Zerg Maria = new Zerg();

      Protoss Helmut = new Protoss();
      Protoss Silke = new Protoss();
      Protoss Ally = new Protoss();

      Terran Tony = new Terran();
      Terran Masha = new Terran();
      Terran Kolya = new Terran();
      Terran Sonya = new Terran();



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
