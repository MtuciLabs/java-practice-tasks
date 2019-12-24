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
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        zerg1.name = "Зерлинг";
        zerg2.name = "Таракан";
        zerg3.name = "Гидралиск";
        zerg4.name = "Ультралиск";
        zerg5.name = "Муталиск";
        Protoss protoss1=new Protoss();
        Protoss protoss2=new Protoss();
        Protoss protoss3=new Protoss();
        protoss1.name="Зилот";
        protoss2.name="Сталкер";
        protoss3.name="Авианосец";
        Terran terran1=new Terran();
        Terran terran2=new Terran();
        Terran terran3=new Terran();
        Terran terran4=new Terran();
        terran1.name="Морпех";
        terran2.name="Осадный Танк";
        terran3.name="Викинг";
        terran4.name="Крейсер";

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
