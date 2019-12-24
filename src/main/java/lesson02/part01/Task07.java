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
        //StarCraft one love <3

        Zerg zergOne = new Zerg();
        Zerg zergTwo = new Zerg();
        Zerg zergThree = new Zerg();
        Zerg zergFour = new Zerg();
        Zerg zergFive = new Zerg();

        zergOne.name = "Broodling";
        zergTwo.name = "Overlord";
        zergThree.name = "Hydralisk";
        zergFour.name = "Zergling";
        zergFive.name = "Queen";


        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();

        protoss1.name = "Raszagal";
        protoss1.name = "Aldaris";
        protoss1.name = "Taldarin";


        Terran terran_1 = new Terran();
        Terran terran_2 = new Terran();
        Terran terran_3 = new Terran();
        Terran terran_4 = new Terran();

        terran_1.name = "Marine";
        terran_2.name ="Goliath";
        terran_3.name = "Valkyrie";
        terran_4.name = "Firebat";

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
