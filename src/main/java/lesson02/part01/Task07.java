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
        Zerg z1= new Zerg();
        Zerg z2= new Zerg();
        Zerg z3= new Zerg();
        Zerg z4= new Zerg();
        Zerg z5= new Zerg();
        Protoss p1=new Protoss();
        Protoss p2=new Protoss();
        Protoss p3=new Protoss();
        Terran t1 =new Terran();
        Terran t2 =new Terran();
        Terran t3 =new Terran();
        Terran t4 =new Terran();
        Zerg abra1=z1;
        Zerg abra2=z2;
        Zerg abra3=z3;
        Zerg abra4=z4;
        Zerg abra5=z5;
        Protoss kadabra1=p1;
        Protoss kadabra2=p2;
        Protoss kadabra3=p3;
        Terran shvabra1=t1;
        Terran shvabra2=t2;
        Terran shvabra3=t3;
        Terran shvabra4=t4;

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
